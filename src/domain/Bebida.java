package domain;

public class Bebida extends Consumible{
	
	
	private Double tamanioCc;
	private Boolean alcohol;
	
	public Bebida(String nombre, Double precio, Double tamanioCc, Boolean alcohol) {
		super(nombre, precio);
		this.tamanioCc = tamanioCc;
		this.alcohol = alcohol;
		
	}

	public Double getTamanioCc() {
		return tamanioCc;
	}

	public void setTamanioCc(Double tamanioCc) {
		this.tamanioCc = tamanioCc;
	}
	
	public Boolean getAlcohol() {
		return alcohol;
	}

	public  void setAlcohol(Boolean alcohol) {
		this.alcohol = alcohol;
	}
	
	@Override
	public void setPlato(String nombre, Double precio, String descripcion, Boolean aptoVegano, Boolean aptoCeliaco) {
	
	}

	@Override
	public void setBebida(String nombre, Double precio, Double tamanioCc, Boolean alcohol) {
	
	}

	@Override
	public String toString() {
		return "| Bebida: " + getNombre() + "| Tamanio: " + getTamanioCc() +" Cc"+ " | Precio: " + getPrecio() + "\n";
	}

	@Override
	public Boolean isPlato() {
		return false;
	}

	@Override
	public Boolean isBebida() {
		return true;
	}

	@Override
	public Boolean getAptoCeliaco() {
		return false;
	}

	@Override
	public Boolean getAptoVegano() {
		return false;
	}
}
