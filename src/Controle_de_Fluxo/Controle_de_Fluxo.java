/**
 * 
 */
package Controle_de_Fluxo;

import java.util.Scanner;

/**
 * @author danmoreira28
 */
public class Controle_de_Fluxo {

	public static void main(String[] args) {
	
		System.out.println("***Calculadora de Média!***\n");
		Scanner s = new Scanner(System.in);
		System.out.println("Deseja calcular a sua Média?");
		String resposta = s.next();
		

		while (true) {
			if (resposta.equalsIgnoreCase("Sim")) {
                Scanner p = new Scanner(System.in);
                System.out.println("Digite sua nota de Português:");
                int portugues = p.nextInt();
                
                Scanner m = new Scanner(System.in);
                System.out.println("Digite sua nota de Matemática:");
                int matematica = m.nextInt();
                
                Scanner h = new Scanner(System.in);
                System.out.println("Digite sua nota de História:");
                int historia = h.nextInt();
                
                Scanner g = new Scanner(System.in);
                System.out.println("Digite sua nota de Geografia:");
                int geografia = g.nextInt();
                
                
                // Cálculo da média final
                int mediaFinal = (portugues + matematica + historia + geografia) / 4;
               
                if (mediaFinal >= 7 && mediaFinal <= 10) {
                	System.out.println("Sua média final é " + mediaFinal + "! Parabéns você passou!");
                } else if (mediaFinal >= 5 && mediaFinal <= 6) {
                	System.out.println("Sua média final é " + mediaFinal + "! Você está de recuperação!");
                }else if (mediaFinal >= 0 && mediaFinal <= 4) {
                	System.out.println("Sua média final é " + mediaFinal + "! Você está reprovado!");	
                }else {
                	System.out.println("Digite notas de 0 a 10!");	
                }
                
            } else if (!resposta.equalsIgnoreCase("Sim")) {
                System.out.println("Programa encerrado!.");
                break;     
            } 
			
			System.out.println("Deseja Calcular sua média final novamente?.");
            resposta = s.next();
            
			
		}
		
    }		
}

