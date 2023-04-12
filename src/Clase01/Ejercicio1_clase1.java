package Clase01;

public class Ejercicio1_clase1 {

	public static void main(String[] args) {

		// A - Todos los numeros entre 2 variables:
		
		System.out.println("Todos los numeros entre 2 variables: \n");
		
		int var1_Inicio = 5;
		int var1_Fin = 16;
		
		while(var1_Inicio <= var1_Fin) {
			System.out.println(var1_Inicio);
			var1_Inicio++;
		}
		
		// B - Solo numeros Pares
		
		System.out.println("\n Solo numeros Pares: \n");

		
		int var2_Inicio = 5;
		int var2_Fin = 16;
		
		while(var2_Inicio <= var2_Fin) {
			if(var2_Inicio % 2 == 0) {
				System.out.println(var2_Inicio);
			}
			var2_Inicio++;
		}
		
		// C - Elegir numeros pares o impares
		
		System.out.println("\n Elegir numeros pares o impares: \n");
		
		
		int var3_Inicio = 5;
		int var3_Fin = 16;
		boolean par = true;

		while (var3_Inicio <= var3_Fin) {
			if(!par) {
				if(var3_Inicio % 2 == 0) {
					System.out.println(var3_Inicio);
				}
			} else {
				if (var3_Inicio % 2 == 1){
					System.out.println(var3_Inicio);
				}
			}
			var3_Inicio++;
		}
		
		// D - Solo numeros Pares invertido
		
		System.out.println("\n Solo numeros Pares invertido: \n");
		
		
		int varInvertir = 16;
		
		for (int i = 5; varInvertir > i; varInvertir--) {
			if(varInvertir % 2 == 0) {
				System.out.println(varInvertir);
			}
		}
	}

}
