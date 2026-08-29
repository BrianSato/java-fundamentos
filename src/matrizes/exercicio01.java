package matrizes;
/*
 * Fazer um programa para ler dois números inteiros M e N e depois ler a matriz de M linhas por N colunas contendo números inteiros, 
 * podendo haver repetições. Em Seguida, ler um número inteiro X que pertence à matriz. 
 * Para cada ocorrência de X, mostrar os valores à esqueda, acima, à direita e abaixo de X, quando houver
 */

import java.util.Locale;
import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//informando a quantidade de M linhas e N colunas
		int mLinhas = sc.nextInt();
		int nColunas = sc.nextInt();
		
		//informando os números que vão compor a matriz de M linhas por N colunas
		int[][] mat = new int [mLinhas][nColunas];
		
		for(int iLinhas=0; iLinhas < mLinhas; iLinhas++) {
			for (int jColunas=0; jColunas < nColunas; jColunas++) {
				mat[iLinhas][jColunas] = sc.nextInt();
			}
		}
		
		//Informando o valor a ser pesquisa dentre os valores informados nas M linhas e N colunas
		int nBuscar = sc.nextInt();
		
		for(int iLinhas=0; iLinhas < mLinhas; iLinhas++) {
			for (int jColunas=0; jColunas<nColunas; jColunas++) {
				
				if(nBuscar == mat[iLinhas][jColunas]) {
					System.out.println("Position " + iLinhas + "," + jColunas);
					if(jColunas > 0) {
						System.out.println("Left: " + mat[iLinhas][jColunas - 1]);
					}
					if( jColunas < nColunas - 1  ) {
						System.out.println("Right:" + mat[iLinhas][jColunas + 1]);
					}
					if(iLinhas > 0) {
						System.out.println("Up:" + mat[iLinhas - 1][jColunas]);
					}
					if(iLinhas < mLinhas - 1 ) {
						System.out.println("Down: " + mat[iLinhas + 1][jColunas]);		
					}			
				}
			}
		}
				
		
		
		
		sc.close();

	}

}
