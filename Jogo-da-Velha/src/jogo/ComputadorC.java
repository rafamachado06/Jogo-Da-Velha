package jogo;
import java.util.Collections;

public class ComputadorC extends Computador {
	public void jogar(Tabuleiro tabuleiro) {
		//aqui o computador só irá marcar as posições na diagonal, se estiver vago (sem X e sem o O)
		while (jogadaComputador != true) {
			if (!tabuleiro.matriz[0][0].equals("X") && !tabuleiro.matriz[0][0].equals("O")) {
				tabuleiro.matriz[0][0] = "O";
				jogadaComputador = false;
				return;
			}
			else if (!tabuleiro.matriz[1][1].equals("X") && !tabuleiro.matriz[1][1].equals("O")) {
				tabuleiro.matriz[1][1] = "O";
				jogadaComputador = false;
				return;
			}
			else if (!tabuleiro.matriz[2][2].equals("X") && !tabuleiro.matriz[2][2].equals("O")) {
				tabuleiro.matriz[2][2] = "O";
				jogadaComputador = false;
				return;
			}
			else if (!tabuleiro.matriz[0][2].equals("X") && !tabuleiro.matriz[0][2].equals("O")) {
				tabuleiro.matriz[0][2] = "O";
				jogadaComputador = false;
				return;
			}
			else if (!tabuleiro.matriz[2][0].equals("X") && !tabuleiro.matriz[2][0].equals("O")) {
				tabuleiro.matriz[2][0] = "O";
				jogadaComputador = false;
				return;
			}
		}
	}
}
