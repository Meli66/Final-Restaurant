package domain;

public class Mesa {
	
	private Integer numero;
	private Integer cantidadDeComensales;
	private Boolean ocupado;
	
	public Mesa(Integer numero, Integer cantidadDeComensales){
		
		this.numero = numero;
		this.cantidadDeComensales = cantidadDeComensales;
		this.ocupado = false;
		
	}
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public Integer getCantidadDeComensales() {
		return cantidadDeComensales;
	}
	public void setCantidadDeComensales(Integer cantidadDeComensales) {
		this.cantidadDeComensales = cantidadDeComensales;
	}
	public Boolean getOcupado() {
		return ocupado;
	}
	public boolean isOcupado() {
		return (ocupado != null) ? ocupado : false;
	}
	
	public void setOcupado(Boolean estado) {
		this.ocupado = estado;
	}
	@Override
	public String toString() {
		return " numero: " + numero + "| Cantidad de Comensales: " + cantidadDeComensales + "| Estado de mesa: Ocupado: " + ocupado + "\n";
	}
	
	
	
	

}
