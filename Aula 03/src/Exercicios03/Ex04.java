package Exercicios03;
import java.util.Scanner;
public class Ex02java {
	public class CorrecaoExercicio04 {

		public static void main(String[] args) {
			
			int idade, sexo, fp, numpessoas = 0, contpc = 0, contmn = 0,
				contha = 0, contpn40 = 0, contpc18 = 0, contoc = 0;
			
			Scanner ler = new Scanner(System.in);
			
			while(numpessoas<=3) {
				System.out.println("Entre com sua idade: ");
				idade = ler.nextInt();
				
				while(idade<=0 || idade >= 130) {
					System.out.println("Voce provavelment digiout sua idade errada!");
					System.out.println("Favor entrar com a idade correta: ");
					idade = ler.nextInt();
				}
				
				System.out.println("Digite o sexo: 1 - Feminino| 2 - Masculino| 3 - Outros");
				sexo = ler.nextInt();
				
				while(sexo < 1 || sexo > 3) {
					System.out.println("Digite o número correspondente ao sexo.");
					System.out.println("1 - Feminimo| 2 - Masculino| 3 - Outros:");
					sexo = ler.nextInt();
				}
				
				System.out.println("Entre com o Fator Psicológico.");
				System.out.println("1 - Calma | 2 - Nervosa | 3 - Agressiva:");
				fp = ler.nextInt();
				
				while(fp < 1 || fp > 3) {
					System.out.println("Favor Digitar um dos n�meros abaixo.");
					System.out.println("1 - Calma | 2 - Nervosa | 3 - Agressiva:");
					fp = ler.nextInt();
				}
				if(fp == 1) {
					contpc++;
				}
				if(sexo == 1 && fp == 2) {
					contmn++;
				}
				if(sexo == 2 && fp == 3) {
					contha++;
				}
				if(sexo == 3 && fp == 1) {
					contoc++;
				}
				if(fp == 2 && idade > 40) {
					contpn40++;
				}
				if(fp == 1 && idade < 18) {
					contpc18++;
				}
				numpessoas++;
			}
			ler.close();

			System.out.println("Pessoas Calmas: " + contpc);
			System.out.println("Mulheres Nervosas: " + contmn);
			System.out.println("Homens Agressivos: " + contha);
			System.out.println("Outros Calmos: " + contoc);
			System.out.println("Pessoas com de 40 anos nervosas: " + contpn40);
			System.out.println("Pessoas calmas com menos de 18 anos: " + contpc18);
		}

	}

	

	
	}


