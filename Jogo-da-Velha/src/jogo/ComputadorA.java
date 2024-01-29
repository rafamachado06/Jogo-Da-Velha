package jogo;

public class ComputadorA extends Computador {
	
	public void jogar(Tabuleiro tabuleiro) {
		//enquanto a jogada for v�lida, gero um n�mero aleat�rio dentro das posi��es do array e fa�o a valida��o.
		while (jogadaComputador != true) {
		posicaoComputador = String.valueOf(String.format("%01.0f",Math.random() * 9 + 1));
		jogadaComputador = tabuleiro.validarJogadaComputador(posicaoComputador);
		}
		jogadaComputador = false;
	}
}
