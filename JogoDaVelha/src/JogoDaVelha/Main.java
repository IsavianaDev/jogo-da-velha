package JogoDaVelha;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			char[][] jogo = new char[3][3];
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					jogo[i][j] = ' ';
				}
			}

			char pAtual = 'X';
			int jogadas = 0;
			int i, j;
			String resposta;

			while (true) {
				for (i = 0; i < 3; i++) {
					for (j = 0; j < 3; j++) {
						System.out.print(jogo[i][j]);
						if (j < 2)
							System.out.print("|");
					}
					System.out.println();
					if (i < 2)
						System.out.println("------");
				}

				System.out.println("Jogador " + pAtual + ", escolha a linha e coluna (0-2): ");
				int L1 = sc.nextInt();
				int C1 = sc.nextInt();

				if (L1 < 0 || L1 > 2 || C1 < 0 || C1 > 2) {
					System.out.println("Número inválido. Escolha um número entre 0 e 2.");
					continue;
				}

				if (jogo[L1][C1] == ' ') {
					jogo[L1][C1] = pAtual;
					jogadas++;

					boolean vencedor = false;
					for (i = 0; i < 3; i++) {
						if ((jogo[i][0] == pAtual && jogo[i][1] == pAtual && jogo[i][2] == pAtual)
								|| (jogo[0][i] == pAtual && jogo[1][i] == pAtual && jogo[2][i] == pAtual)) {
							vencedor = true;
							break;
						}
					}
					if ((jogo[0][0] == pAtual && jogo[1][1] == pAtual && jogo[2][2] == pAtual)
							|| (jogo[0][2] == pAtual && jogo[1][1] == pAtual && jogo[2][0] == pAtual)) {
						vencedor = true;
					}

					if (vencedor) {
						for (i = 0; i < 3; i++) {
							for (j = 0; j < 3; j++) {
								System.out.print(jogo[i][j]);
								if (j < 2)
									System.out.print("|");
							}
							System.out.println();
							if (i < 2)
								System.out.println("------");
						}
						System.out.println("O Jogador " + pAtual + " venceu!");
						break;
					}

					if (jogadas == 9) {
						for (i = 0; i < 3; i++) {
							for (j = 0; j < 3; j++) {
								System.out.print(jogo[i][j]);
								if (j < 2)
									System.out.print("|");
							}
							System.out.println();
							if (i < 2)
								System.out.println("------");
						}
						System.out.println("O jogo deu velha!");
						break;
					}

					if (pAtual == 'X') {
						pAtual = 'O';
					} else {
						pAtual = 'X';
					}
				} else {
					System.out.println("Movimento inválido, tente novamente.");
				}
			}

			System.out.print("Deseja recomeçar? Aperte [S] para sim ou [N] para não. ");
			resposta = sc.next();

			if (!(resposta.charAt(0) == 'S' || resposta.charAt(0) == 's')) {
				System.out.println("Fim de jogo.");
				break;
			}
		}

		sc.close();
	}
}
