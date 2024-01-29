package jogo;

import java.util.Scanner;

public class Jogador {

	//aqui recebo do jogador a posi��o que ele quer preencher.
	//se a jogada for invalida (retorno do validarJogada()), pre�o novamente a posi��o, at� 
	//uma posi��o v�lida for escolhida.
	public void jogar(Tabuleiro tabuleiro) {
		boolean valida = false;
		String jogada = "";
		
		while (valida == false) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escolha a posi��o de sua jogada:");
		jogada = teclado.next();
		valida = tabuleiro.validarJogada(jogada);
		}
	}
}
