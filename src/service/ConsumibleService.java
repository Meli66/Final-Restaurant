package service;
import domain.Consumible;
import domain.Plato;
import domain.Bebida;
import domain.Menu;


public class ConsumibleService {
	
	public Plato crearPlato(String nombre,Double precio,String descripcion,Boolean aptoVegano,Boolean aptoCeliaco) {
			return  new Plato(nombre,precio,descripcion,aptoVegano,aptoCeliaco);
	}
	
	public Bebida crearBebida(String nombre,Double precio,Double tamanioCc,Boolean alcohol) {
		return new Bebida(nombre,precio,tamanioCc,alcohol);
	}
		
	public void modificarPlato(Plato plato,String nombre,Double precio,String descripcion,Boolean aptoVegano,Boolean aptoCeliaco) {
			plato.setPlato(nombre, precio, descripcion, aptoVegano, aptoCeliaco);
		}
	
	public void modificarBebida(Bebida bebida,String nombre, Double precio, Double tamanioCc, Boolean alcohol) {
		bebida.setBebida(nombre, precio,tamanioCc,alcohol);
	}
	
	public void borrarPlato(Menu menu,Plato plato) {
		menu.getConsumibles().remove(plato);
	}
	public void borrarBebida(Menu menu,Bebida bebida) {
		menu.getConsumibles().remove(bebida);
	}
	public void mostrar(Consumible consumible) {
		StringBuilder str = new StringBuilder();
		str.append("Tipo de consumible: ");
		str.append("\n");
		str.append(consumible.getNombre());
		str.append("\n");
		str.append("Precio: ");
		str.append(consumible.getPrecio());
		str.append("\n");
		System.out.println(str.toString());
	}	

}
	
	
	
	
	
	
	
	
