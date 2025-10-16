package ar.edu.unlp.info.oo1.estructura;
import java.time.LocalDate;
import java.util.ArrayList;
public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private ArrayList<Item> items;
	
	public Presupuesto(String cliente){
		this.fecha = LocalDate.now();
		this.cliente = cliente;
		this.items = new ArrayList<>();
	}
	public LocalDate getFecha(){
		return this.fecha;
	}
	public String getCliente(){
		return this.cliente;
	}
	public void agregarItem(Item  item) {
		this.items.add(item);
	}
	public double calcularTotal(){
		double temp = 0;
		for(Item i:items) {
			temp = temp + i.costo();
		}
		return temp;
	}
}
