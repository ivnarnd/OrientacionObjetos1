package ar.edu.unlp.info.oo1.estructura;

import java.time.LocalDate;
import java.util.List;
public class Ticket {
	private LocalDate fecha;
	private List<Producto> productos;
	
	public Ticket(List<Producto> prods) {
		this.fecha = LocalDate.now();
		this.productos = prods;
	}
	
	public LocalDate getFecha() {
		return fecha;
	}
	
	public int getCantidadDeProductos() {
		return this.productos.size();
	}
	
	public double getPrecioTotal() {
		double tmp;
		tmp = productos.stream().mapToDouble(producto -> producto.getPrecio()).sum();
		return tmp;
	}
	
	public double getPesoTotal() {
		double tmp = 0;
		tmp = productos.stream().mapToDouble(producto -> producto.getPeso()).sum();
		return tmp;
	}

	public double impuesto() {
		return this.getPrecioTotal()*0.21;
	}
	
	
}
