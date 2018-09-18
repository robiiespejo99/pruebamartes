import java.util.Scanner;

public class Menu {
	public static int menu(Scanner scanner) {

		int opcion;
		

		while (true) {
			try {
				System.out.println("Ingresar una opcion: ");
				System.out.println("------------------- ");
				System.out.println("1. Inserte un producto.");
				System.out.println("2. Inserte un detalle.");
				System.out.println("3. Insertar carrito.");
				System.out.println("4. Listar detalles");
				System.out.println("5. Salir.");
				System.out.println();

				opcion = scanner.nextInt();
				scanner.nextLine();

				if (opcion >= 1 && opcion <= 5) {

					return opcion;

				} else {
					System.out.println("Seleccione una opcion valida.(1, 2, 3, 4 o 5)");
				}

			} catch (java.util.InputMismatchException e) {
				System.out.println("Ingrese solo valores numéricos");
				System.out.println();
				scanner.nextLine();
			}
		}
	}

	public static void subMenu(Scanner leer,  Control c) {
		
		boolean salir = false;
		
	
		int codigo = 0;
		String nombre= "";
		String descripcion = "";
		double precio = 0;
		
		while (!salir) {
			switch (menu(leer)) {
			case 1:
				System.out.println("Codigo de producto:");
				codigo = leer.nextInt();
				System.out.println("Nombre de producto:");
				nombre = leer.next();
				System.out.println("Descripcion:");
				descripcion = leer.next();
				System.out.println("Precio de producto:");
				precio = leer.nextDouble();
				
				c.insertarProductos(codigo, nombre, descripcion, precio);
				c.mostrarProductos();
				System.out.println("Producto insertado! ");
				
				
				break;
			case 2:
				
				break;
			case 3:
				while (true) {
					
				}
			case 4:
				
		
			case 5:
				salir = true;
				System.out.println("Hasta Luego");
				System.exit(0);

				break;

			}
		}
	}

}
