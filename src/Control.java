import java.util.ArrayList;
import java.util.Scanner;

public class Control {
	private ArrayList<Producto> catalogo;  
	private ArrayList<CarritoVirtual> carrito;  
	private ArrayList<DetalleCarrito> detalles;  
	private Scanner leer = new Scanner(System.in);
public Control() {	
	
		catalogo = new ArrayList<Producto>();
		carrito = new ArrayList<CarritoVirtual>();
		detalles = new ArrayList<DetalleCarrito>();
	
}
public Control(ArrayList<Producto> catalogo, ArrayList<CarritoVirtual> carrito, ArrayList<DetalleCarrito> detalles) {
	super();
	this.catalogo = catalogo;
	this.carrito = carrito;
	this.detalles = detalles;
	
}
public Control(ArrayList<Producto> catalogo) {
	this.catalogo = catalogo;

}
public ArrayList<Producto> cargarProductos() {

	return catalogo;
}
public void mostrarProductos() {
	for (int i = 0; i < catalogo.size(); i++) {
		if (catalogo.get(i).getCodigoProducto() != 0) {
			System.out.print(catalogo.get(i) + "\n-------\n");
		}

	}

}
public int insertarProductos(int codigo, String nombre, String descripcion ,double precio) {

	for (int i = 0; i < catalogo.size(); i++) {
	
		if (catalogo.get(codigo - 1) != null) {

			catalogo.get(codigo - 1).setCodigoProducto(codigo);
			catalogo.get(codigo - 1).setNombre(nombre);
			catalogo.get(codigo - 1).setDescripcion(descripcion);
			catalogo.get(codigo - 1).setPrecioUnidad(precio);
			
			System.out.println("Producto insertado! ");

		}

	}
	return codigo;

	

}
}