import java.util.Scanner;

public class SistemaConsulta {

	public static void main(String[] args) {
			
		//Criando uma variável do tipo matriz
		String [] nome={"Ricardo","Alexandre","Pedro","Camila"};
						
		//Criando um sistema de consulta
		int matricula;
		
		// Criando a chamada de um objeto da biblioteca
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o número da matrícula:");
		matricula=teclado.nextInt();		
		
		System.out.println(nome[matricula]);
		
		
	   }
	}

