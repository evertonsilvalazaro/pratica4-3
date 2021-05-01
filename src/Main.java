import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int numeroDeFilhos=0, mediaFilhos;
		double sala=0, salario=0, mediaSalario;
		int contador=0;
		while(sala>=0) {
			
			System.out.println("Digite o numero de filhos");
			numeroDeFilhos+=sc.nextInt();
			
			
			System.out.println("Digite o salario");
			sala=sc.nextDouble();
			
			salario+=sala;
			
			if(sala>0)
			contador++;
		}

	mediaFilhos=numeroDeFilhos/contador;
	mediaSalario=salario/contador;
	
	System.out.println(mediaFilhos);
	System.out.println(mediaSalario);

	sc.close();
	}
		
}
