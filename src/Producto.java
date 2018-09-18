
public class Producto {

	int codigoProducto;
	String nombre;
	String descripcion;
	double precioUnidad;
	public Producto(int codigoProducto, String nombre, String descripcion, double precioUnidad) {
		super();
		this.codigoProducto = codigoProducto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precioUnidad = precioUnidad;
	}
	public int getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecioUnidad() {
		return precioUnidad;
	}
	public void setPrecioUnidad(double precioUnidad) {
		this.precioUnidad = precioUnidad;
	}
	@Override
	public String toString() {
		return "Producto [codigoProducto=" + codigoProducto + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", precioUnidad=" + precioUnidad + "]";
	}
	
}
