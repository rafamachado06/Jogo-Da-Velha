package jogo;

import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		
		// instancio as classes de tabuleiro e jogador
		Tabuleiro tabuleiro = new Tabuleiro();
		Jogador jogador = new Jogador();
		
		//pego do usuário a dificuldade escolhida
		Scanner teclado = new Scanner(System.in);
		System.out.println("Jogo da velha");
		System.out.println("Escolha a dificuldade 1,2 ou 3:");
		int opcao = teclado.nextInt();
		Computador computador = null;
		
		//de acordo com a dificuldade, pego qual computador irá jogar
		if(opcao==1) {
			computador= new ComputadorA();
		}
		else if(opcao==2) {
			computador= new ComputadorB();
		}
		else if(opcao==3) {
			computador= new ComputadorC();
		}
		
		int vez=1; //vez do jogador, começa por padrão
		tabuleiro.visualizar(); //mostro o tabuleiro para o usuário
		
		while(tabuleiro.situacao()==0) { //looping no tabuleiro, enquanto a situação for 0 de "em andamento", 
			                             //continua as rodadas. Mostro o tabuleiro a cada rodada
			if(vez==1) { //Jogador Humano
				System.out.println("Rodada do Jogador!");
				jogador.jogar(tabuleiro);
				vez=2; //passo a vez para o computador
			}
			else if(vez==2) {
				System.out.println("Rodada do Computador!");
				System.out.println("\n");
				computador.jogar(tabuleiro);
				vez=1; //volto a vez para o jogador
			}
			
			tabuleiro.visualizar();
			System.out.println("\n");
		}
		
		//faço uma validação para saber quem ganhou
		if (tabuleiro.situacao()==1) {
			System.out.println("Parabéns! Jogador ganhou!");
		}
		else if (tabuleiro.situacao()==2) {
			System.out.println("Que pena :( Computador ganhou!");
		}
	}
}
