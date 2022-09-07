package service;

import domain.Menu;
import domain.Consumible;
import java.util.ArrayList;
import java.util.List;

public class MenuService {

	
	public List<Consumible> CrearLista(){
		return new ArrayList<Consumible>();
	}
	
	public Menu crear(String tipoMenu, List<Consumible> consumibles) {
			return new Menu(consumibles,tipoMenu);
	}
	
	public void agregarConsumible(Menu menu,Consumible consumible) {
		menu.getConsumibles().add(consumible);
	}
	
	public void borrarConsumible(Menu menu,Consumible consumible) {
		menu.getConsumibles().remove(consumible);
	}
	public void mostrarBebidas(Menu menu) {
		for( Consumible consumible:menu.getConsumibles()) {
			if(consumible!=null && consumible.isBebida()==true) {
				System.out.println("lista de Bebidas: " + consumible ); 
		}	
		}
	}
	public void mostrarPlatos(Menu menu) {
		for(Consumible consumible:menu.getConsumibles()) {
			if(consumible!=null && consumible.isPlato()==true) {
			System.out.println("lista de Platos: "+consumible);
			}
		}
	}
}

	
