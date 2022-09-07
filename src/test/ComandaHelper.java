package test;

import domain.Cocinero;
import domain.Comanda;
import domain.FormaDePago;
import domain.Menu;
import domain.Mesa;
import domain.Mozo;
import domain.Salon;
import service.ComandaService;

public class ComandaHelper {

	public static Comanda crearComanda(ComandaService service,Menu menu, Mesa mesa, Mozo mozo, Cocinero cocinero, FormaDePago formaDePago) {
		return service.crearComanda(menu, service.crearLista(), mesa, mozo, cocinero, formaDePago);	
	}
	public static void eliminarComanda(Comanda comanda) {
		Salon.getComandas().remove(comanda);
	}
		
}
