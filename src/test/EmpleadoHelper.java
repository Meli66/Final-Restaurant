package test;

import service.EmpleadoService;
import domain.Cheff;
import domain.Cocinero;
import domain.Mozo;

public class EmpleadoHelper {
	//metodos para la creacion de empleados...
	public static Mozo crearMozo1 (EmpleadoService service) {
		return service.crearMozo("Ernesto", 321, "23-1-2020", "mozo de dia", service.crearLista());
	}
	public static Mozo crearMozo2 (EmpleadoService service) {
		return service.crearMozo("Pedro", 323, "15-4-2021", "mozo de dia", service.crearLista());
	}
	
	public static Cocinero crearCocinero1(EmpleadoService service) {
		return service.crearCocinero("Carlitos", 320, "03-6-2019", 10);
	}
	public static Cocinero crearCocinero2(EmpleadoService service) {
		return service.crearCocinero("Jose", 322, "01-2-2020", 5);
	}
	public static Cheff crearCheff(EmpleadoService service) {
		return service.crearCheff("Petrona", 319, "02-1-2015",10 ,true);
	}
	
	
	
	
	
	
}
