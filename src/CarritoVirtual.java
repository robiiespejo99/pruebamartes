
public class CarritoVirtual {

	int codigoCarrito;
	int nitCliente;
	String fechaCreacion;
	public CarritoVirtual(int codigoCarrito, int nitCliente, String fechaCreacion) {
		super();
		this.codigoCarrito = codigoCarrito;
		this.nitCliente = nitCliente;
		this.fechaCreacion = fechaCreacion;
	}
	public int getCodigoCarrito() {
		return codigoCarrito;
	}
	public void setCodigoCarrito(int codigoCarrito) {
		this.codigoCarrito = codigoCarrito;
	}
	public int getNitCliente() {
		return nitCliente;
	}
	public void setNitCliente(int nitCliente) {
		this.nitCliente = nitCliente;
	}
	public String getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(String fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	@Overri
}
