package jogo;

public class ComputadorB extends Computador {
	public void jogar(Tabuleiro tabuleiro)
	{
		//enquanto a jogada for válida, faço um looping para marcar em ordem crescente no tabuleiro
		//marco com o O somente se a posição estiver vaga (sem O e sem X)
		while (jogadaComputador != true) {
			for (int linha = 0; linha < tabuleiro.matriz.length; linha++) {//linhas
				for (int coluna = 0; coluna < tabuleiro.matriz.length; coluna++) {//colunas
					if (!tabuleiro.matriz[linha][coluna].equals("X") && !tabuleiro.matriz[linha][coluna].equals("O")) {
						tabuleiro.matriz[linha][coluna] = "O";
						jogadaComputador = false;
						return;
					}
				}
			}
		}
	}
}
