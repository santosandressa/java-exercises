package PacoteJava;

import java.util.Scanner;

public class caracteristicas {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner leia =  new Scanner(System.in);
		
		int x=1, idade,sexo, humor, calma=0,nervosa=0, agressiva=0,menor=0, maior=0;
		
		System.out.println("Qual sua idade?: ");
		idade = leia.nextInt();
		
		System.out.println("Qual sexo você se identifica: 1- Feminino 2- Masculino ");
		sexo = leia.nextInt();
		
		while(sexo<1 || sexo>3) {
			System.out.println("Opção Invalida");
			System.out.println("Qual sexo você se identifica: 1- Feminino 2- Masculino ");
			sexo = leia.nextInt();
		}

		System.out.println("Qual sua característica psicológica: 1- Calma 2 -Nervosa 3-Agressiva? ");
		humor = leia.nextInt();
		
		while(x<=6) {
			
			System.out.println("Qual sua idade?: ");
			idade = leia.nextInt(); 
			
			System.out.println("Qual sexo você se identifica: 1- Feminino 2- Masculino ");
			sexo = leia.nextInt();
		
			System.out.println("Qual sua característica psicológica: 1- Calma 2 -Nervosa 3-Agressiva? ");
			humor = leia.nextInt();
	
			
			if(humor==1) {
				calma++;
			}
			
			if(sexo == 1 && humor==2) {
				nervosa++;
			}	
			
			if(sexo == 2 && humor==3) {
				agressiva++;
			}	
			
			if(sexo == 2 && humor==1) {
				calma++;
			}	
			
			if(humor==2 && idade>=40) {
				maior++;
			}	
			
			if(humor==1 && idade<=18) {
				menor++;
			}	
			
			x++;
				
		}
		
		System.out.printf("%d pessoas estão calmas",calma);
		System.out.printf("\n%d mulheres estão nervosas",nervosa);
		System.out.printf("\n%d homens estão agressivos",agressiva);
		System.out.printf("\n%d pessoas acima de 40 anos estão nervosas",maior);
		System.out.printf("\n%d pessoas menores de 18 anos estão calmas",menor);
		
		

	}

}
