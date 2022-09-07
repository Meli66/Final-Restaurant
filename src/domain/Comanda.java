package domain;


import java.util.List;


public class Comanda {
	
	Menu menu;
	private  List<Consumible> consumidos ;
	Mesa mesa;
	Mozo mozo;
	Cocinero cocinero;
	FormaDePago formaDePago;
	
	public Comanda(Menu menu, List<Consumible> consumidos, Mesa mesa, Mozo mozo, Cocinero cocinero,
			FormaDePago formaDePago) {
		super();
		this.menu = menu;
		this.consumidos = consumidos;
		this.mesa = mesa;
		this.mozo = mozo;
		this.cocinero = cocinero;
		this.formaDePago = formaDePago;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public List<Consumible> getConsumidos() {
		return consumidos;
	}

	public void setConsumidos(List<Consumible> consumidos) {
		this.consumidos = consumidos;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public Mozo getMozo() {
		return mozo;
	}

	public void setMozo(Mozo mozo) {
		this.mozo = mozo;
	}

	public Cocinero getCocinero() {
		return cocinero;
	}

	public void setCocinero(Cocinero cocinero) {
		this.cocinero = cocinero;
	}

	public FormaDePago getFormaDePago() {
		return formaDePago;
	}

	public void setFormaDePago(FormaDePago formaDePago) {
		this.formaDePago = formaDePago;
	}

	@Override
	public String toString() {
		return "| lista de platos y bebidas:\n" + consumidos + "\n| mesa: " + mesa + "| mozo: " + mozo
				+ "| cocinero: " + cocinero + "| formaDePago: " + formaDePago + "\n";
	}


	
	
	
	

	
	
	

}
