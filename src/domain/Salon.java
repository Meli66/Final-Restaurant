package domain;

import java.util.ArrayList;
import java.util.List;


public class Salon {
	
	static List<Menu> menues = new ArrayList<Menu>();
	static List<Mesa> mesas = new ArrayList<Mesa>();
	static List<Empleado> empleados = new ArrayList<Empleado>();
	static List<Comanda> comandas = new ArrayList<Comanda>();

	public Salon(List<Menu> menues, List<Mesa> mesas, List<Empleado> empleados, List<Comanda> comandas) {
		super();
		Salon.menues = menues;
		Salon.mesas = mesas;
		Salon.empleados = empleados;
		Salon.comandas = comandas;
	}

	public static List<Menu> getMenues() {
		return menues;
	}

	public void setMenues(List<Menu> menues) {
		Salon.menues = menues;
	}

	public static List<Mesa> getMesas() {
		return mesas;
	}

	public void setMesas(List<Mesa> mesas) {
		Salon.mesas = mesas;
	}

	public static List<Empleado> getEmpleados() {
		return empleados;
	}

	public static void setEmpleados(List<Empleado> empleados) {
		Salon.empleados = empleados;
	}

	public static List<Comanda> getComandas() {
		return comandas;
	}

	public void setComandas(List<Comanda> comandas) {
		Salon.comandas = comandas;
	}



}
