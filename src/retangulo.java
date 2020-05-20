import java.util.Locale;
import java.util.Scanner;

public class retangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double largura;
		
		System.out.println("Digite a largura do retangulo: ");
		largura = sc.nextDouble();
		while(largura <= 0.0) {
			System.out.println("O valor deve ser positivo. Tente novamente: ");
			largura = sc.nextDouble();
		}
		
		sc.close();
	}

}
