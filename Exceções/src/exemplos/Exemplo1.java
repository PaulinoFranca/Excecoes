package exemplos;

import java.io.FileNotFoundException;

public class Exemplo1 {

	public static void main(String[] args) {

		try {
			new java.io.FileInputStream("arquivo.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
