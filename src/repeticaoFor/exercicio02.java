package repeticaoFor;

import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = 0;
		int qnt_in = 0;
		int qnt_out = 0;
		
		for(int i = 0; i < n ; i++) {
			
			x = sc.nextInt();
			
			if(x >= 10 && x <= 20) {
				qnt_in +=1;
			}
			else{
				qnt_out+=1;
			}
		}
		
	
		System.out.println(qnt_in + " in ");
		System.out.println(qnt_out + " out ");
		
		sc.close();
		
	}

}

