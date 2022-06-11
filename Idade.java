import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int anos, meses, dias, totalDias;
		
		System.out.println("Insira a sua idade (anos)");
		anos = sc.nextInt();
		System.out.println("Insira os meses");
		meses = sc.nextInt();
		System.out.println("Insira os dias");
		dias = sc.nextInt();
		totalDias = (anos * 365) + (meses * 30) + dias;
		System.out.println("A sua idade em dias é " + totalDias);
		
		sc.close();

	}

}