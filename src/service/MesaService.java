package service;
import domain.Comanda;
import domain.Mesa;
import domain.Mozo;
import domain.Salon;

public class MesaService {

	private Integer numero;

	public MesaService() {
		numero = 0;
	}

	public Integer getNumero() {
		return numero;
	}

	public Mesa crear(Integer cantidadDeComensales) {
		numero++;
		return new Mesa(numero, cantidadDeComensales);
	}

	public void ocupar(Mesa mesa) {
		mesa.setOcupado(true);
	}

	public void liberar(Mesa mesa) {
		mesa.setOcupado(false);
	}

	public static boolean estado(Mesa mesa) {
		return mesa.isOcupado();
	}
	
	
	public void hacerPedidoalMozo(Mozo mozo,Mesa mesa, Comanda comanda,EmpleadoService service) {
				Boolean mesaDesOcupada=false;
				for(Mesa mesas:Salon.getMesas()) {
			if(mesas.getOcupado()==false && mesas.getCantidadDeComensales()==2 ) { 
				mesaDesOcupada=true;
			}
				}
		if(mozo.getMesas().contains(comanda.getMesa()) && mesa.getOcupado()==false) {
			System.out.println("El mozo esta tomando su pedido...por favor aguarde.");
			service.ingresarPedidoAlSistema(comanda);
			mesa.setOcupado(true);
		}else {
			if(mesaDesOcupada==false) {
				System.out.println("no hay mesas disponibles...");
			}else {
			System.out.println("su pedido no pudo ser ingresado por favor verifique los datos...");
			}
		}	
	}
	public void mostrar(Mesa mesa) {
		StringBuilder str = new StringBuilder();
		
		str.append("Mesa numero: ");
		str.append(mesa.getNumero());
		str.append("\n");
		str.append("Cantidad de comensales: ");
		str.append(mesa.getCantidadDeComensales());
		str.append("\n");
		str.append("Ocupada: ");
		str.append(mesa.getOcupado());
		str.append("\n");
		System.out.println(str.toString());
	}
}	
	
	
	
	

