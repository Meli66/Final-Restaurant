package domain;

import java.util.List;

public class Cheff extends Cocinero{

	private Boolean titulo;

	

	public Cheff(String nombre, Integer legajo, String fechaDeIngreso, Integer yearsDeExperiencia, Boolean titulo) {
		super(nombre, legajo, fechaDeIngreso, yearsDeExperiencia);
		this.titulo = titulo;
	}

	
	
	public Boolean getTitulo() {
		return titulo;
	}



	public void setTitulo(Boolean titulo) {
		this.titulo = titulo;
	}

	public void setCheff(String nombre, Integer legajo, String fechaDeIngreso, Integer yearsDeExperiencia, Boolean titulo) {
		
		
	}

	@Override
	public void setMozo(String nombre, Integer legajo, String fechaDeIngreso, String tipoDeMozo, List<Mesa> mesas) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SetCocinero(String nombre, Integer legajo, String fechaDeIngreso, Integer yearsDeExperiencia) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public String toString() {
		return "| Cheff nombre: " + getNombre() + "| nro de legajo: " + getLegajo() + "| Fecha de ingreso: "
				+ getFechaDeIngreso()+"\n";
	}

	
	


	
	
}
