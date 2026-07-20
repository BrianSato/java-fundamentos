package orientacaoObjetos.entities;

public class Student {
	
	public String name;
	public double firstGrade,secondGrade,thirdGrade;
	
	public double finalScore() {
		return firstGrade + secondGrade + thirdGrade;
	}
	
	public boolean isApproved() {
		return finalScore() >= 60;
	}
	
	public double missingScore() {
		 return 60 - finalScore();
	}
	
}
