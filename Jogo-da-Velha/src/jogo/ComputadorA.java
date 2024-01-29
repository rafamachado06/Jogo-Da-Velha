package jogo;

public class ComputadorA extends Computador {
	
	public void jogar(Tabuleiro tabuleiro) {
		//enquanto a jogada for válida, gero um número aleatório dentro das posições do array e faço a validação.
		while (jogadaComputador != true) {
		posicaoComputador = String.valueOf(String.format("%01.0f",Math.random() * 9 + 1));
		jogadaComputador = tabuleiro.validarJogadaComputador(posicaoComputador);
		}
		jogadaComputador = false;
	}
}
