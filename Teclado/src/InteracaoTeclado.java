import java.util.Scanner;

public class InteracaoTeclado {

	public static void main(String[] args) {
		// Utilizacao do comando Scanner
		// Permite colher informações do teclado
		Scanner teclado = new Scanner(System.in);
		
		//Criando uma variável
		
		System.out.println("Digite o nome do seu cleinte:");
		String nomeCliente = teclado.nextLine();
		
		//Vinculando o teclado com a nossa variável
		//nomeCliente = teclado.nextLine();
		
		//Mostrar o nome em uma frase
		System.out.println("Olá " +nomeCliente);

	}

}
