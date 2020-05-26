package entidad;

import excepcion.ProductoExcepcion;


public class Producto {
	
	// atributos
	private String descripcion;
	private double precioBase;
	private int cantidadStock;
	
	// constructores
	public Producto() {	}

	public Producto(String descripcion, double precioBase, int cantidadStock) {
		super();
		this.descripcion = descripcion;
		this.precioBase = precioBase;
		this.cantidadStock = cantidadStock;
	}

	// getters y setters
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public int getCantidadStock() {
		return cantidadStock;
	}

	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}
	

	/**
	 * Descuenta la cantidad de stock del producto.
	 * @param cantidad: int
	 */
	public void descuentaStock(int cantidad) {
		
		try {
			if (cantidad > this.cantidadStock) {
				throw new ProductoExcepcion(this, cantidad);
			}
			this.cantidadStock -= cantidad;
			System.out.println( this.descripcion + " stock: " + this.cantidadStock );
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	
	@Override
	public String toString() {
		return "Producto [\n\tdescripcion=" + descripcion + ",\n\tprecioBase="
				+ precioBase + ",\n\tcantidadStock=" + cantidadStock + "\n]";
	}
}
