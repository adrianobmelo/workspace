public class ExecutaMatriz {

	public static void main(String[] args) {
		//Criando uma variável do tipo Matriz
		String[] carros= {"HB20","Uno","Gol","Sandero","C3","Opala","Tempra"};
		
		//Mostrando o conteúdo da variável do tipo Matriz
		/*System.out.println(carros[0]);
		System.out.println(carros[1]);
		System.out.println(carros[2]);
		System.out.println(carros[3]);
		System.out.println(carros[4]);*/
		
		// Contando a quantidade de registros de uma matriz 
		System.out.println(carros.length);
		
		int contagem=1;
		//Criando um laco de repetição para mostrar os registros
		for(int contador=0;contador<carros.length;contador++) {
			contagem=contagem+contador;
			System.out.println(contagem+" - "+carros[contador]);
		}

	}

}