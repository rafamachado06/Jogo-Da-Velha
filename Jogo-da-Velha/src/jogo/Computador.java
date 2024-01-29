package jogo;

public class Computador {
	//variaveis utilizadas com as classes filhas, junto com o gets e sets
	boolean jogadaComputador;
	String posicaoComputador;
	
	public boolean isJogadaComputador() {
		return jogadaComputador;
	}

	public void setJogadaComputador(boolean jogadaComputador) {
		this.jogadaComputador = jogadaComputador;
	}

	public String getPosicaoComputador() {
		return posicaoComputador;
	}

	public void setPosicaoComputador(String posicaoComputador) {
		this.posicaoComputador = posicaoComputador;
	}
	
	public void jogar(Tabuleiro tabuleiro) {
	}
}
