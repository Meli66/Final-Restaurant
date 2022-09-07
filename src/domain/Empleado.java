package domain;

import java.util.List;

public abstract class Empleado {
	
	private String Nombre;
	private Integer legajo;
    private String fechaDeIngreso;

    public Empleado(String nombre, Integer legajo, String fechaDeIngreso) {
		super();
		Nombre = nombre;
		this.legajo = legajo;
		this.fechaDeIngreso = fechaDeIngreso;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Integer getLegajo() {
		return legajo;
	}

	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}

	public String getFechaDeIngreso() {
		return fechaDeIngreso;
	}

	public void setFechaDeIngreso(String fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}
	
	public abstract void setMozo(String nombre, Integer legajo, String fechaDeIngreso, String tipoDeMozo, List<Mesa> mesas);

	public abstract void SetCocinero(String nombre, Integer legajo, String fechaDeIngreso, Integer yearsDeExperiencia);
	
	
}
