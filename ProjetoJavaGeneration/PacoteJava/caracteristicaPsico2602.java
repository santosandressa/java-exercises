package PacoteJava;

import java.util.Scanner;

public class caracteristicaPsico2602 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner leia =  new Scanner(System.in);
		
		int idade, calma=0,nervosa=0, agressiva=0;
		String sexo , humor, str, str1;
		
		System.out.println("Qual sua idade?: ");
		idade = leia.nextInt();

		System.out.println("Qual sexo você se identifica?: ");
		sexo = leia.next();
		
		System.out.println("Qual sua característica psicológica: Calma, Nervosa ou Agressiva? ");
		humor = leia.next();
		
		str= sexo.substring(0,1).toUpperCase() + sexo.substring(1);
		str1 = humor.substring(0,1).toUpperCase() + sexo.substring(1);
		
	
		while(idade>1 && idade<=99) {
			
			System.out.println("Qual sua idade?: ");
			idade = leia.nextInt(); 
			
			System.out.println("Qual sexo você se identifica?: ");
			sexo = leia.next();
			str= sexo.substring(0,1).toUpperCase() + sexo.substring(1);
			
			System.out.println("Qual sua característica psicológica | Calma |  | Nervosa | | Agressiva |? ");
			humor = leia.next();
			str1 = humor.substring(0,1).toUpperCase() + humor.substring(1);
			
			if(str.equals("Feminino") || str.equals("Masculino") && str1.equals("Calma") ) {
				System.out.println("você está calma");
				calma++;
			}	else if(str.equals("Feminino") && str1.equals("Nervosa")) {
				nervosa++;
			}	else if(str.equals("Masculino") && str1.equals("Agressiva")) {
				agressiva++;	
			} 	else if(str.equals("Masculino") && str1.equals("Calma")) {
				calma++;
			}  else if(idade >=40 && str1.equals("Nervosa")) {
				nervosa++;
			} else if(idade < 18 && str1.equals("Calma")) {
				calma++;
			}
				
		}
		
		System.out.printf("%d pessoas estão calmas",calma);
		System.out.printf("\n%d mulheres estão nervosas",nervosa);
		System.out.printf("\n%d homens estão agressivos",agressiva);
		System.out.printf("\n%d pessoas acima de 40 anos estão nervosas",nervosa);
		System.out.printf("\n%d pessoas menores de 18 anos estão calmas",calma);
	}
}
