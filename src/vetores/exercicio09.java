package vetores;

import java.util.Locale;
import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		String[] nomeAluno = new String[n];
		double[] nota1Semestre = new double[n];
		double[] nota2Semestre = new double[n];
		double media = 0;
		
		for(int i=0; i<n; i++) {
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno: ", i+1);
			nomeAluno[i] = sc.nextLine();
			nota1Semestre[i] = sc.nextDouble();
			nota2Semestre[i] = sc.nextDouble();
			sc.nextLine();
			
		}
		System.out.println("Alunos aprovados:");
		for(int i=0; i<n; i++) {
			media = (nota1Semestre[i] + nota2Semestre[i]) / 2;
			if(media >= 6.0) {
				System.out.println(nomeAluno[i]);
			}
		}
		
		sc.close();

	}

}
