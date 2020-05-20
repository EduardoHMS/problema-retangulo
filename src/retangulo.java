import java.util.Locale;
import java.util.Scanner;

public class retangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double largura, altura, area, perimetro;
		int opcao = 0;
		
		// largura //
		System.out.println("Digite a largura do retangulo: ");
		largura = sc.nextDouble();
		while(largura <= 0.0) {
			System.out.println("O valor deve ser positivo. Tente novamente: ");
			largura = sc.nextDouble();
		}
		
		// altura //
		System.out.println("Digite a altura do retangulo: ");
		altura = sc.nextDouble();
		while(altura <= 0.0) {
			System.out.println("O valor deve ser positivo. Tente novamente: ");
			altura = sc.nextDouble();
		}
		
		// menu //
		System.out.println(" ");
		
		boolean bol = true;
		while(bol) {
			System.out.println("MENU: ");
			System.out.println("1 - Mostrar area");
			System.out.println("2 - Mostrar perimetro");
			System.out.println("3 - Sair");
			System.out.println("Digite uma opcao: ");
			opcao = sc.nextInt();
			
			if(opcao == 1) {
				area = largura * altura;
				System.out.println(" ");
				System.out.printf("AREA = %.1f%n", area);
				System.out.println(" ");
			}else if(opcao == 2) {
				perimetro = 2*largura + 2*altura;
				System.out.println(" ");
				System.out.printf("PERIMETRO = %.1f%n", perimetro);
				System.out.println(" ");
			}else if(opcao == 3) {
				System.out.println(" ");
				System.out.println("FIM DO PROGRAMA!");
				System.out.println(" ");
				bol = false;
			}else {
				System.out.println(" ");
				System.out.println("OPÇÃO INVALIDA");
				System.out.println(" ");
			}
		}
		
		sc.close();
	}

}
