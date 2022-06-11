import java.util.Scanner;
public class Temperatura {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		boolean continuar = true;
		int opcao;
		double temp, C, F;
		
		do 
		{
		System.out.println("Qual é a temperatura agora?");
		temp = sc.nextDouble();
		
		System.out.println("Onde você está, qual é a escala da temperatura?");
		System.out.println("1. Celsius");
		System.out.println("2. Farenheit");
		System.out.println("0. Fechar programa");
		System.out.print("Insira sua opção: ");
		opcao = sc.nextInt();
		
		if(opcao == 0) {
			continuar = false;
			System.out.println("Fim do programa");
		}
		if(opcao == 1) {
			F = temp * 1.18 + 32;
			System.out.println("A temperatura agora é de " + temp + "°C. Em Fahrenheit, a temperatura seria de " + F + "°F.");
		}
		if(opcao == 2) {
			C = (temp-32)/1.8;
			System.out.println("A temperatura agora é de " + temp + "°F. Em Celsius, a temperatura seria de " + C + "°C.");
		}
		
		System.out.println("Deseja encerrar o programa?");
		System.out.println("0. Sim");
		System.out.println("1. Não");
		opcao = sc.nextInt();
		if(opcao == 0) {
			continuar = false;
			System.out.println("Fim do programa");
		}
		if (opcao > 1) {
			continuar = false;
			System.out.println("Opção inválida. Fim do programa.");
		}
	} while ( continuar );
		sc.close(); 
		}
}
