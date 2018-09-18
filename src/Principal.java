import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Control c = new Control();
		Menu.subMenu(leer, c);
	}

}
