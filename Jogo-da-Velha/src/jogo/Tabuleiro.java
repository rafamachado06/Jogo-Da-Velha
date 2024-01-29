package jogo;

public class Tabuleiro {

	//preferi por fazer uma matriz em String já preenchida com as posições.
	// assim o usuário escolhe só um número
	public String[][] matriz = {{"1","2","3"},
								{"4","5","6"},
								{"7","8","9"}};

	
	public int situacao() {
		//lógica de controle da situação da partida (em andamento, jogador venceu, máquina ou computador venceu)
		//0 = em andamento;
		//1 = jogador venceu;
		//2 = computador venceu;
		
		//aqui monto um array para armazenar todas as possibilidades de vitória.
		//concateno cada linha, cada diagonal do tabuleiro e mando para o array
		String jogadas[] = new String[8];
		
		jogadas[0] = matriz[0][0] + matriz[0][1] + matriz[0][2];
		jogadas[1] = matriz[1][0] + matriz[1][1] + matriz[1][2];
		jogadas[2] = matriz[2][0] + matriz[2][1] + matriz[2][2];
		
		jogadas[3] = matriz[0][0] + matriz[1][0] + matriz[2][0];
		jogadas[4] = matriz[0][1] + matriz[1][1] + matriz[2][1];
		jogadas[5] = matriz[0][2] + matriz[1][2] + matriz[2][2];

		jogadas[6] = matriz[0][0] + matriz[1][1] + matriz[2][2];
		jogadas[7] = matriz[0][2] + matriz[1][1] + matriz[2][0];

		//valido as condições de vitória. Se a linha ou diagonal for igual a XXX, então o jogador venceu
		//se não, se for OOO, o computador venceu
		for (int i=0; i<jogadas.length;i++) {
			if (jogadas[i].equals("XXX")) {
				return 1;
			}
			else if (jogadas[i].equals("OOO")) {
				return 2;
			}
			else {
				
			}
		}
		return 0;
	}
	
	//mostro o tabuleiro para o usuário, fazendo um loop na matriz com as posições
	public void visualizar() {
		for (int linha = 0; linha < matriz.length; linha++) {//linhas
			for (int coluna = 0; coluna < matriz.length; coluna++) {//colunas
					System.out.print("   " + matriz[linha][coluna]);
			}
			System.out.println("\n");
		}
		
	}
	
	//valido a jogada do jogador. Se colocar uma posição invalida, retorno falso com um aviso, se não, preencho a posição
	// e retorno verdadeiro
	public boolean validarJogada(String jogada) {
		for (int linha = 0; linha < matriz.length; linha++) {//linhas
			for (int coluna = 0; coluna < matriz.length; coluna++) {//colunas
				if (matriz[linha][coluna].equals(jogada)) {
					matriz[linha][coluna] = "X";
					return true;
				}
			}
		}
		System.out.println("Posição invalida ou já preenchida! Tente novamente!");
		return false;
	}
	
	//valido a jogada do Computador. Se a jogada dele for válida, preencho com O e retorno verdadeiro, se não retorno falso
	public boolean validarJogadaComputador(String jogada) {
		for (int linha = 0; linha < matriz.length; linha++) {//linhas
			for (int coluna = 0; coluna < matriz.length; coluna++) {//colunas
				if (matriz[linha][coluna].equals(jogada)) {
					matriz[linha][coluna] = "O";
					return true;
				}
			}
		}
		return false;
	}
}
