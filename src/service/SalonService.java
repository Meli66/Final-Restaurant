package service;

import java.util.List;

import domain.Cocinero;
import domain.Comanda;
import domain.Empleado;
import domain.Menu;
import domain.Mesa;
import domain.Mozo;
import domain.Salon;

public class SalonService {

	public Salon crearSalon(List<Menu> menues, List<Mesa> mesas, List<Empleado> empleados, List<Comanda> comandas) {
		return new Salon(menues,mesas,empleados,comandas);
	}
	
	
	public  void agregarMesa(Mesa mesa) {
		Salon.getMesas().add(mesa);
	}
	public  void borrarMesa(Mesa mesa) {
		Salon.getMesas().remove(mesa);
	}
	public void asignarMesa(Mozo mozo,Mesa mesa) {
		mozo.getMesas().add(mesa);
	}
	public void agregarMenu(Menu menu) {
		Salon.getMenues().add(menu);
	}
	public void eliminarMenu(Menu menu) {
		Salon.getMenues().remove(menu);
	}
	public void agregarEmpleado(Empleado empleado) {
		Salon.getEmpleados().add(empleado);
	}
	public void eliminarEmpleado(Empleado empleado) {
		Salon.getEmpleados().remove(empleado);
	}
	
	public void pedidosPorCocinero(Cocinero cocinero) {
		Integer cantidadDePedidos=0;
	
		for(Comanda comandas:Salon.getComandas()) {
			if(comandas.getCocinero().equals(cocinero)) {
				cantidadDePedidos++;
			}
		}
		StringBuilder str = new StringBuilder();
		str.append(" Pedidos por cocinero: ");
		str.append("\n");
		str.append(" nombre: ");
		str.append(cocinero.getNombre());
		str.append("\n");
		str.append(" numero de legajo: ");
		str.append(cocinero.getLegajo());
		str.append("\n");
		str.append(" total de comandas atendidas: ");
		str.append(cantidadDePedidos);
		System.out.println(str.toString());
	}
	
	public void pedidosConMasConsumibles() {
		Integer cantidadMax=0;
		Comanda comandaMaxima=null;
		for (Comanda comanda : Salon.getComandas()) {
			if(comanda.getConsumidos().size()>cantidadMax) {
				cantidadMax=comanda.getConsumidos().size();
				comandaMaxima=comanda;		
			}	
		}
		System.out.println(" La comanda con mayor cantidad de consumibles es: \n "+ comandaMaxima+" con: "+cantidadMax+" pedidos.");
	
	}
}
