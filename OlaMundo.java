package PortoSeguro1;

import java.util.Scanner;

public class OlaMundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome;
		int idade,x,y;
		double altura,nota1,nota2,nota3,media; 
		
		Scanner leia = new Scanner(System.in);
				
		System.out.println("Ol� Mundo!!!");
		
		System.out.println("Por favor, prezado usu�rio...\n\t\tEntre com o seu nome: ");
		nome = leia.nextLine();
		System.out.println("\n\t\tEntre com a sua idade: ");
		idade = leia.nextInt();
		System.out.println("\n\t\tEntre com a sua altura: ");
		altura = leia.nextFloat();
		
		System.out.println("\nEntre com a primeira nota: ");
		nota1 = leia.nextFloat();
		System.out.println("\nEntre com a segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("\nEntre com a terceira nota: ");
		nota3 = leia.nextFloat();
		
		media = (nota1+nota2+nota3) / 3; 
		
		if(media>=7 && media<=10)
		{
			System.out.println("\nAluno aprovado!!!");
		}
		else if(media>=5 && media<7)
		{
			System.out.println("\nAluno de exame!!!");
		}
		else if(media>=0 && media<5)
		{
			System.out.println("\nAluno reprovado");
		}
		else
		{
			System.out.println("\nM�dia inv�lida");
		}
		
		
		System.out.println("\nMeu nome �: "+nome+" Eu tenho: "+idade+
				" ano(s) e a minha altura �: "+altura);
		
		System.out.printf("\nM�dia aritm�tica: %2.2f",media);
		 nota1 = Math.sqrt(nota2);//raiz quadrada
		 nota2 = Math.pow(nota3, 3);//potencia
		 
		 System.out.println("\nEntre com o valor de x: ");
		 x = leia.nextInt();
		 System.out.println("\nEntre com o valor de y: ");
		 y = leia.hashCode();
		 
		 x = x % y; //calcula o resto da divis�o de dois n�meros inteiros
		 
		 
		
		
	}

}
