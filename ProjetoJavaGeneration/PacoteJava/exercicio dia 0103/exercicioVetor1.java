package PacoteJava;

public class exercicioVetor1 {

	public static void main(String[] args) {
		
		int soma=0;	
		int[] firstValue = new int [6];
		firstValue[0] = 1;
		firstValue[1] = 0;
		firstValue[2] = 5;
		firstValue[3] = -2;
		firstValue[4] = -5;
		firstValue[5] = -7;
		
		for (int i=0; i<firstValue.length; i++) {
			System.out.printf("\nO valor de %d é %d ",i+1, firstValue[i]);
		}
		
		soma = firstValue[0] + firstValue[1] +firstValue[5];
		System.out.println("\nSoma: " + soma);
		
		for (int i=0; i<firstValue.length; i++) {
			if(firstValue[3] == -2) {
				firstValue[3] = 100;
				System.out.printf("\nO novo valor é %d ",firstValue[3]);
			}
		}
		System.out.println();
		
		for (int i=0; i<firstValue.length; i++) {
			System.out.printf("\nO valor de %d é %d ",i+1, firstValue[i]);
		}	

	}

}
