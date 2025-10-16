package ar.edu.unlp.info.oo1.estructura;

public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public Item(String detalle,int cantidad,double costoUnit){
		this.detalle = detalle;
		this.cantidad = cantidad;
		this.costoUnitario = costoUnit;
	}
	public String getDetalle(){
		return this.detalle;
	}
	public int getCantidad(){
		return this.cantidad;
	}
	public double getCostoUnitario() {
		return this.costoUnitario;
	}
		
	public double costo() {
		return this.getCantidad() * this.getCostoUnitario();
	}
}
