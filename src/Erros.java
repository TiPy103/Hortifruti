import java.util.Scanner;

public class Erros {
	static Scanner in = new Scanner(System.in); 
	
	public static int erroInt(NumberFormatException e) {
		System.out.println("Digite um valor numérico válido");

		String peso = in.nextLine();

		try {
			return Integer.parseInt(peso);
		} catch (NumberFormatException f) {
			return erroInt(f);
		}
	}
	
	public static double erroDouble(NumberFormatException e) {
		System.out.println("Digite um valor numérico válido");

		String peso = in.nextLine();

		try {
			return Double.parseDouble(peso);
		} catch (NumberFormatException f) {
			return erroDouble(f);
		}
	}
}