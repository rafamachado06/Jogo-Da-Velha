package jogo;

import java.util.Scanner;

public class Jogador {

	//aqui recebo do jogador a posição que ele quer preencher.
	//se a jogada for invalida (retorno do validarJogada()), preço novamente a posição, até 
	//uma posição válida for escolhida.
	public void jogar(Tabuleiro tabuleiro) {
		boolean valida = false;
		String jogada = "";
		
		while (valida == false) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escolha a posição de sua jogada:");
		jogada = teclado.next();
		valida = tabuleiro.validarJogada(jogada);
		}
	}
}
