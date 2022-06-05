import java.util.Scanner;

public class pagamento {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int id, horas;
		double valorHora, salario;

		System.out.println("Apresente o seu ID de três dígitos");
		id = sc.nextInt();
		if (id > 999) {
			System.out.println("Atenção! O ID deve ter três dígitos. Caso necessário, adicione zeros à esquerda do ID");
		} 
		else {
			
		System.out.println("Para calcular seu pagamento, digite as horas trabalhadas no mês:");
		horas = sc.nextInt();
		System.out.println("Agora, digite o valor que voce recebe por hora:");
		valorHora = sc.nextDouble();
		salario = valorHora*horas;
		System.out.printf("O seu salario será de %.2f%n", salario);
		salario = sc.nextDouble();
		
				
		sc.close();
		}
	}
}