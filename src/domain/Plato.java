package domain;

public class Plato extends Consumible{
	
	private String descripcion;
	private  Boolean aptoVegano;
	private  Boolean aptoCeliaco;
	
	public Plato(String nombre, Double precio, String descripcion, Boolean aptoVegano, Boolean aptoCeliaco) {
		super(nombre, precio);
		this.descripcion = descripcion;
		this.aptoVegano = false;
		this.aptoCeliaco = false;
		
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public  Boolean getAptoVegano() {
		return aptoVegano;
	}

	public void setAptoVegano(Boolean aptoVegano) {
		this.aptoVegano = aptoVegano;
	}

	public  Boolean getAptoCeliaco() {
		return aptoCeliaco;
	}

	public void setAptoCeliaco(Boolean aptoCeliaco) {
		this.aptoCeliaco = aptoCeliaco;
	}
		
	public Boolean isPlato() {
		return true;
	}

	@Override
	public void setPlato(String nombre, Double precio, String descripcion, Boolean aptoVegano, Boolean aptoCeliaco) {
			
	}

	@Override
	public void setBebida(String nombre, Double precio, Double tamanioCc, Boolean alcohol) {
		
	}

	@Override
	public String toString() {
		return "| Plato: "+getNombre()+"| Descripcion: "+getDescripcion()+"| Precio: "+getPrecio()+"\n";
	}

	@Override
	public Boolean isBebida() {
		return false;
	}

	@Override
	public Boolean getAlcohol() {
		return false;
	}
}
