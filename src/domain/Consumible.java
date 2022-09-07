package domain;

import java.util.Objects;

public abstract class Consumible {

	private String nombre;
	private Double precio;
	
	public Consumible(String nombre, Double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
			
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public abstract void setPlato(String nombre, Double precio, String descripcion, Boolean aptoVegano,
			Boolean aptoCeliaco);
	public abstract void setBebida(String nombre, Double precio, Double tamanioCc, Boolean alcohol);
	
	public abstract Boolean  isPlato();

	public abstract Boolean isBebida(); 
	
	public abstract Boolean getAptoCeliaco();
	
	public  abstract Boolean getAptoVegano();
	
	public abstract Boolean getAlcohol();
		
	@Override
	public String toString() {
		return "| Nombre: " + nombre+ "\n" + "| Precio: " + precio + "\n" ;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nombre, precio);
	}
}
