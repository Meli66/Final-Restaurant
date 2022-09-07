package test;

import domain.Consumible;
import service.ConsumibleService;

public class ConsumibleHelper {

//Metodos para la creacion de Bebidas:
	public static Consumible crearAgua (ConsumibleService service) {
		return service.crearBebida("agua", 300.0, 500.0, false);
	}
	public static Consumible crearAguaConGas (ConsumibleService service) {
		return service.crearBebida("agua con gas", 320.0, 500.0, false);
	}
	public static Consumible crearVino500cc(ConsumibleService service) {
		return service.crearBebida("vino de la casa", 2000.0, 500.0, true);
	}
	public static Consumible crearVino1000cc(ConsumibleService service) {
		return service.crearBebida("vino de la casa", 4000.0, 1000.0, true);
	}
	public static Consumible crearCerveza500cc(ConsumibleService service) {
		return service.crearBebida("weihenstephaner", 1000.0, 500.0, true);
	}
	public static Consumible crearCocacola600cc(ConsumibleService service) {
		return service.crearBebida("Cocacola", 450.0, 600.0, false);
	}
	
	//Metodos para la creacion de Platos:
	
	public static Consumible crearHamburguesaSimple (ConsumibleService service) {
		return service.crearPlato("hamburguesa", 500.00, "hamburguesa simple con queso", false, false);
	}
	public static Consumible crearHamburguesaVegie(ConsumibleService service) {
		return service.crearPlato("hamburguesa vegana", 600.0, "hamburguesa hecha con proteina de arveja", true, false);
	}
	public static Consumible crearHamburguesaCeliaca(ConsumibleService service) {
		return service.crearPlato("hamburguesa aptoCeliaco", 590.0, "hamburguesa libre de gluten", false, true);
	}
	public static Consumible crearFideosConSalsa(ConsumibleService service) {
		return service.crearPlato(" fideos", 1100.0, "fideos con salsa casera", false, false);
	}
	public static Consumible crearFideosConSalsaVegie(ConsumibleService service) {
		return service.crearPlato(" fideos veganos", 1200.0, "fideos con salsa casera sin carne", true, false);
	}
	public static Consumible crearFideosConSalsaCeliaca(ConsumibleService service) {
		return service.crearPlato(" fideos celiacos", 1000.0, "fideos con salsa apto celiacos", false, true);
	}
	public static Consumible crearEnsalada(ConsumibleService service) {
		return service.crearPlato(" ensalada", 700.0, "ensalada mixta apto vegano,apto celiaco", true, true);
	}
	public static Consumible crearSushiVegano(ConsumibleService service) {
		return service.crearPlato(" sushi vegano", 1300.0, "Sushi vegano : Ingredientes: algas,nueces,guacamole,tomates secos", true, true);
	}
	
	


}
