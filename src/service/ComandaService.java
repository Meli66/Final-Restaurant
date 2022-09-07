package service;
import java.util.ArrayList;
import java.util.List;

import domain.Cocinero;
import domain.Comanda;
import domain.Menu;
import domain.Mesa;
import domain.Mozo;
import domain.Salon;
import domain.Consumible;
import domain.Descuentos;
import domain.FormaDePago;

public class ComandaService implements Descuentos {

	
	public List<Consumible> crearLista(){
		return new ArrayList<Consumible>();
	}
	
	public Comanda crearComanda(Menu menu,List<Consumible> consumidos, Mesa mesa, Mozo mozo, Cocinero cocinero, FormaDePago formaDePago) {
		return new Comanda(menu,consumidos,mesa,mozo,cocinero,formaDePago);
	}

	public void agregarConsumibleAlistaComanda(Comanda comanda,Consumible consumible) {
			for(Menu menu:Salon.getMenues()) {
				if(menu.getConsumibles().contains(consumible)) {
				comanda.getConsumidos().add(consumible);
		}
			
		}
			
	}
	public  void calcularTotal(Comanda comanda) {
		double totalSinDescuento=calcularTotalSinDescuento(comanda);
		double totalConDescuento=calcularTotalSinDescuento(comanda)-calcularDescuento(comanda);
		StringBuilder str = new StringBuilder();
		str.append(" Totales: ");
		str.append("\n");
		str.append(" Mesa numero: ");
		str.append(comanda.getMesa().getNumero());
		str.append("\n");
		str.append(" Medio de pago: ");
		str.append(comanda.getFormaDePago());
		str.append("\n");
		if(comanda.getFormaDePago()==FormaDePago.EFECTIVO) {
		str.append(" Total sin descuento: ");
		str.append(totalSinDescuento);
		str.append("\n");
		str.append(" Total con descuento: ");
		str.append(totalConDescuento);
		System.out.println(str.toString());
	}else {
		str.append(" Total: ");
		str.append(totalSinDescuento);
		System.out.println(str.toString());
	}
	}
	
	public Double calcularDescuento(Comanda comanda) {
			double descuento=0;
			if(comanda.getFormaDePago()==FormaDePago.EFECTIVO) {
				for (Consumible consumible : comanda.getConsumidos() ) {
					if(consumible.isPlato()) {
							if(consumible.getAptoCeliaco()) {
								descuento+=consumible.getPrecio()* (descuento5porciento+descuento2porciento);}
							else if(!consumible.getAptoVegano()) {
								descuento+=consumible.getPrecio()*descuento5porciento;
							}
					}
					else if(consumible.isBebida()) {
						if(consumible.getAlcohol()) {
							descuento+=consumible.getPrecio()*descuento3porciento;
						}
						else {
							descuento+=consumible.getPrecio()*descuento10porciento;
						}
					}
				}
			}
			return descuento;
	}
	
	public Double calcularTotalSinDescuento(Comanda comanda) {
		double totalSinDescuento=0;
		for (Consumible consumible : comanda.getConsumidos()) {
			totalSinDescuento+=consumible.getPrecio();		
		}
		return totalSinDescuento;
	}
	public void mostrarComanda(Comanda comanda) {
		for(Comanda comandas:Salon.getComandas()) {
			if(comandas.equals(comanda)) {
					
		
				StringBuilder str = new StringBuilder();
				
				str.append("Detalle de pedido: ");
				str.append("\n");
				str.append(comandas.getConsumidos());
				str.append("\n");
				str.append("Mesa: ");
				str.append(comandas.getMesa());
				str.append("Mozo: ");
				str.append(comandas.getMozo().getNombre());
				str.append("\n");
				str.append("Cocinero:");
				str.append(comandas.getCocinero().getNombre());
				str.append("\n");
				str.append("Forma de pago:");
				str.append(comandas.getFormaDePago());
				str.append("\n");
				System.out.println(str.toString());		
			}
	}
	}
}
