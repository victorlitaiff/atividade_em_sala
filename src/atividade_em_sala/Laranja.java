package atividade_em_sala;

import java.util.Scanner;

public class Laranja {

	public static void main(String[] args) {
	
	int pessoa_joao = 1;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Quantas laranjas João possui? "); 
	int laranjas_de_joao = sc.nextInt();
	
	int quantidade_de_amigos = 3;
	int laranjas_divididas = laranjas_de_joao / (pessoa_joao + quantidade_de_amigos);
	
	System.out.println("Para que todos tenham a mesma quandidade de laranjas, João precisaria dar " + laranjas_divididas + " laranjas para cada amigo." );

		}

}
