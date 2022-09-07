package domain;

public enum FormaDePago {

	EFECTIVO("efectivo"),TARJETA("tarjeta"),DEBITO("debito");
	
	private String formaDePago;

	private FormaDePago(String formaDePago) {
		this.formaDePago = formaDePago;
	}

	public String getFormaDePago() {
		return formaDePago;
	}

	public void setFormaDePago(String formaDePago) {
		this.formaDePago = formaDePago;
	}
	
	
	
	
}
