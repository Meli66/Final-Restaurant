package domain;

import java.util.List;

public class Cocinero extends Empleado{
	
	
	private Integer yearsDeExperiencia;

	public Cocinero(String nombre, Integer legajo, String fechaDeIngreso, Integer yearsDeExperiencia) {
		super(nombre, legajo, fechaDeIngreso);
		this.yearsDeExperiencia = yearsDeExperiencia;
	}

	public Integer getYearsDeExperiencia() {
		return yearsDeExperiencia;
	}

	public void setYearsDeExperiencia(Integer yearsDeExperiencia) {
		this.yearsDeExperiencia = yearsDeExperiencia;
	}

	@Override
	public void setMozo(String nombre, Integer legajo, String fechaDeIngreso, String tipoDeMozo, List<Mesa> mesas) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SetCocinero(String nombre, Integer legajo, String fechaDeIngreso, Integer yearsDeExperiencia) {
		// TODO Auto-generated method stub
		
	}


	public void setCheff(String nombre, Integer legajo, String fechaDeIngreso, Integer yearsDeExperiencia,
			Boolean titulo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return " nombre: " + getNombre() + "| nro de legajo: " + getLegajo() + "| Fecha de ingreso: "
				+ getFechaDeIngreso() + "\n";
	}




}
