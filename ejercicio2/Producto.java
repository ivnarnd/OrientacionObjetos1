package ar.edu.unlp.info.oo1.estructura;

public class Producto {
	private double peso;
	private double precioXKilo;
	private String descripcion;
	
	public Producto(String descripcion,double peso,double precioXKilo ){
		this.descripcion = descripcion;
		this.peso = peso;
		this.precioXKilo = precioXKilo;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPrecioPorKilo() {
		return precioXKilo;
	}
	public void setPrecioPorKilo(double precioXKilo) {
		this.precioXKilo = precioXKilo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio(){
		return this.peso * this.precioXKilo;
	}
}
