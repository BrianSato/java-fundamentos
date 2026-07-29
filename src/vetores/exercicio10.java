package vetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] genero = new String[n];
		double[] altura = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("Altura da %da pessoa: ", i+1);
			altura[i] = sc.nextDouble();
			sc.nextLine();
			System.out.printf("Genero da %da pessoa: ", i+1);
			genero[i] = sc.nextLine();
		}
		
		int qntMulheres = 0;
		int qntHomens = 0;
		double maiorAltura = 0;
		double menorAltura = 0;
		double somaAlturaMulheres = 0;
		
		for(int i=0; i<n; i++) {
			if(maiorAltura < altura[i]) {
				maiorAltura = altura[i];
				menorAltura = maiorAltura;
			}
			if(menorAltura > altura[i]) {
				menorAltura = altura[i];
			}
			if(genero[i].equals("F")) {
				somaAlturaMulheres += altura[i];
				qntMulheres ++;
			}else {
				qntHomens ++;
			}
		}
		
		double mediaAlturaMulheres = somaAlturaMulheres / qntMulheres;
		
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Média das alturas das mulheres = %.2f%n", mediaAlturaMulheres);
		System.out.printf("Numero de homens = %d", qntHomens);
		
		sc.close();

	}

}
