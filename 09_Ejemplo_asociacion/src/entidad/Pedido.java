package entidad;

import java.util.Date;

public class Pedido {
	
	// atributos
	private Date fechaRecibido;
	private boolean prepagado;
	private int cantidad;
	private double precio;
	
	private Cliente cliente; // implementacion de la asociación
	
	// constructores
	public Pedido() {
		
	}

	public Pedido(Date fechaRecibido, boolean prepagado, int cantidad,
			double precio, Cliente cliente) {
		super();
		this.fechaRecibido = fechaRecibido;
		this.prepagado = prepagado;
		this.cantidad = cantidad;
		this.precio = precio;
		this.cliente = cliente;
	}

	// getters y setters
	public Date getFechaRecibido() {
		return fechaRecibido;
	}

	public void setFechaRecibido(Date fechaRecibido) {
		this.fechaRecibido = fechaRecibido;
	}

	public boolean isPrepagado() {
		return prepagado;
	}

	public void setPrepagado(boolean prepagado) {
		this.prepagado = prepagado;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/* Método para despachar el pedido */
	public String despachar() {
		return "Pedido despachado";
	}
	
	/* Método para cerrar el pedido */
	public String cierra() {
		return "Pedido cerrado";
	}
	
	@Override
	public String toString() {
		return "Pedido [\n\tfechaRecibido=" + fechaRecibido + ",\n\tprepagado="
				+ prepagado + ",\n\tcantidad=" + cantidad + ",\n\tprecio="
				+ precio + ",\n\tcliente=" + cliente + "\n]";
	}

}

