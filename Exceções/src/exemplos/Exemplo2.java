package exemplos;

public class Exemplo2 {
	public static void main(String[] args) {
		System.out.println("inicio do main");
		try {
			metodo1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("fim do main");
	}

	static void metodo1() throws Exception {
		System.out.println("inicio do metodo1");
		metodo2();
		System.out.println("fim do metodo1");
	}

	static void metodo2() throws Exception {
		System.out.println("inicio do metodo2");
		int[] array = new int[10];
		for (int i = 0; i <= 15; i++) {
				array[i] = i;

			System.out.println(i);
		}
		System.out.println("fim do metodo2");
		System.out.println("eae minha galerinha");
	}
}
