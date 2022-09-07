package test;

import domain.Salon;
import service.SalonService;

public class SalonHelper {
	
	public static Salon crearRestaurante(SalonService service) {
		return service.crearSalon(Salon.getMenues(), Salon.getMesas(), Salon.getEmpleados(), Salon.getComandas());
	}
	
	
	
	
	
	
	
}
