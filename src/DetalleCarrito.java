
public class DetalleCarrito {
	
	int codigoDetalle;
	int codigoCarrito;
	int codigoProducto;
	int cantidad;
	public DetalleCarrito(int codigoDetalle, int codigoCarrito, int codigoProducto, int cantidad) {
		super();
		this.codigoDetalle = codigoDetalle;
		this.codigoCarrito = codigoCarrito;
		this.codigoProducto = codigoProducto;
		this.cantidad = cantidad;
	}
	public int getCodigoDetalle() {
		return codigoDetalle;
	}
	public void setCodigoDetalle(int codigoDetalle) {
		this.codigoDetalle = codigoDetalle;
	}
	public int getCodigoCarrito() {
		return codigoCarrito;
	}
	public void setCodigoCarrito(int codigoCarrito) {
		this.codigoCarrito = codigoCarrito;
	}
	public int getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "DetalleCarrito [codigoDetalle=" + codigoDetalle + ", codigoCarrito=" + codigoCarrito
				+ ", codigoProducto=" + codigoProducto + ", cantidad=" + cantidad + "]";
	}
	
	

}
