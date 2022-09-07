package domain;

import java.util.List;

public class Menu {

	
	private  List<Consumible> consumibles;
	private  String tipoMenu;

	public Menu(List<Consumible> consumibles, String tipoMenu) {
		super();
		this.consumibles = consumibles;
		this.tipoMenu = tipoMenu;
	}

	public List<Consumible> getConsumibles() {
		return consumibles;
	}

	public void setConsumibles(List<Consumible> consumibles) {
		this.consumibles = consumibles;
	}

	public String getTipoMenu() {
		return tipoMenu;
	}

	public void setTipoMenu(String tipoMenu) {
		this.tipoMenu = tipoMenu;
	}

	@Override
	public String toString() {
		return " Tipo de Menu:  "+tipoMenu +" \n Consumibles: "+ getConsumibles();
	}
	
	
	

	
	
	
	
}
