package service;

import java.util.ArrayList;
import java.util.List;

import domain.Cheff;
import domain.Cocinero;
import domain.Comanda;

import domain.Mesa;
import domain.Mozo;
import domain.Salon;


public class EmpleadoService {
	//metodos del cocinero...
	public Cocinero crearCocinero(String nombre, Integer legajo, String fechaDeIngreso, Integer yearsDeExperiencia) {
		return new Cocinero(nombre,legajo,fechaDeIngreso,yearsDeExperiencia);
	}
	public void agregarCocinero(Cocinero cocinero) {
		Salon.getEmpleados().add(cocinero);
	}
	public void borrarCocinero(Cocinero cocinero) {
		Salon.getEmpleados().remove(cocinero);
	}
	
	//metodos del mozo...
	public List<Mesa> crearLista(){
		return new ArrayList<Mesa>();
	}
	public Mozo crearMozo(String nombre, Integer legajo, String fechaDeIngreso, String tipoDeMozo, List<Mesa> mesas) {
		return new Mozo(nombre,legajo,fechaDeIngreso,tipoDeMozo,mesas);
		
	}
	public void agregarMozo(Mozo mozo) {
		Salon.getEmpleados().add(mozo);
	}
	public void borrarMozo(Mozo mozo) {
		Salon.getEmpleados().remove(mozo);
	}
	
	public List<Mesa> mostrarMesasAsignadas(Mozo mozo) {
		return mozo.getMesas();
	}
	
	public void ingresarPedidoAlSistema(Comanda comanda) {
		if(Salon.getComandas().contains(comanda)) {
			System.out.println("La comanda ya se encuentra en la lista ");
		}else {
			System.out.println("La Comanda fue ingresada correctamente...");
			Salon.getComandas().add(comanda);
		}
	}
	
	//metodos del cheff...
	
	public Cheff crearCheff(String nombre, Integer legajo, String fechaDeIngreso, Integer yearsDeExperiencia, Boolean titulo) {
		return new Cheff(nombre,legajo,fechaDeIngreso,yearsDeExperiencia,titulo);
	}
	public void agregarCheff(Cheff cheff) {
		Salon.getEmpleados().add(cheff);
	}
	public void borrarCheff(Cheff cheff) {
		Salon.getEmpleados().remove(cheff);
	}	
}
