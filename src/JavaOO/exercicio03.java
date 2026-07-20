package JavaOO;

import java.util.Locale;
import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
	
		student.name = sc.nextLine();
		student.firstGrade = sc.nextDouble();
		student.secondGrade = sc.nextDouble();
		student.thirdGrade = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", student.finalScore());
		if (student.isApproved()) {
			System.out.println("PASS");
		}else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", student.missingScore());
		}
		
		sc.close();

	}

}
