import java.util.Scanner;

public class Salario_Minimo {
	
	public static final double SM = 1212;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double salario;
		
		System.out.println("Insira o seu salário");
		salario = sc.nextDouble();
		double x = salario/SM;
		System.out.println("Salário: R$ " + salario);
		System.out.printf("O seu salário é " + x + " vez(es) o salário mínimo no Brasil em junho/2022");
		x = sc.nextDouble();
												
		sc.close();
	}
}