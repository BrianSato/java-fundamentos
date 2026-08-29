package manipulacaoArquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file path:");
		String path = sc.nextLine();
		File file = new File(path);
		
		boolean successFolder = new File(file.getParent() + "\\out").mkdir();
		File summary = new File(file.getParent() + "\\out\\summary.csv");
		
		System.out.println();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path));
			BufferedWriter bw = new BufferedWriter(new FileWriter(summary))){
			
			String line = br.readLine();
			while(line != null) {
				
				String[] fields = line.split(",");
				System.out.println("Product File:" + line);
				
				
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				double total = price*quantity;
				
				bw.write(fields[0] + "," + total);
				bw.newLine();
				System.out.println("Summary File: " + fields[0] + "," + total);
				System.out.println();
				
				line = br.readLine();

			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}

}
