package main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a cotacao do dolar (US$): ");
		float cotacaoDolares = scanner.nextFloat();
		
		System.out.print("Digite a quantidade de dólares disponíveis (US$): ");
        float quantidadeDolares = scanner.nextFloat();
        
        float valorEmReais = cotacaoDolares * quantidadeDolares;
        System.out.printf("Valor em reais (R$): %.2f%n", valorEmReais);
        
        scanner.close();

	}

}
