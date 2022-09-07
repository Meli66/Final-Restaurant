package domain;


import java.util.List;

public class Mozo extends Empleado{
	

	private String tipoDeMozo;
	
	private List <Mesa> mesas ;

	public Mozo(String nombre, Integer legajo, String fechaDeIngreso, String tipoDeMozo, List<Mesa> mesas) {
		super(nombre, legajo, fechaDeIngreso);
		this.tipoDeMozo = tipoDeMozo;
		this.mesas = mesas;
	}

	public String getTipoDeMozo() {
		return tipoDeMozo;
	}

	public void setTipoDeMozo(String tipoDeMozo) {
		this.tipoDeMozo = tipoDeMozo;
	}

	public List<Mesa> getMesas() {
		return mesas;
	}

	public void setMesas(List<Mesa> mesas) {
		this.mesas = mesas;
	}

	@Override
	public void setMozo(String nombre, Integer legajo, String fechaDeIngreso, String tipoDeMozo, List<Mesa> mesas) {
		
		
	}

	@Override
	public void SetCocinero(String nombre, Integer legajo, String fechaDeIngreso, Integer yearsDeExperiencia) {
	
		
	}

	@Override
	public String toString() {
		return " nombre: " + getNombre() + "| nro de legajo: " + getLegajo() + "| Fecha de ingreso: "
				+ getFechaDeIngreso() + "\n";
	}

	
	
	
	
}
