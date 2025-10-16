package ar.edu.unlp.info.oo1.estructura;

import java.util.ArrayList;
import java.util.List;

public class Balanza {
	private List<Producto> productos;
	
	public Balanza() {
		this.productos = new ArrayList<>();
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
	
	public void ponerEnCero(){
		this.productos = new ArrayList<>();
	}
	public void agregarProducto(Producto prod) {
		this.productos.add(prod);
	}
	public List<Producto> getProductos(){
		return this.productos;
	}
	public Ticket emitirTicket(){
		Ticket ticket =  new Ticket(this.productos);
		return ticket;
	}
	
}
