package test;
import java.util.List;

import domain.Menu;
import domain.Salon;
import service.MenuService;



public  class MenuHelper {
	// metodo para crear un nuevo menu...
	public static Menu crearMenu(MenuService service) {
		return service.crear(" Menu completo: ",service.CrearLista());
	}
	public static void eliminarMenu(Menu menu) {
		Salon.getMenues().remove(menu);
	}
	
}
