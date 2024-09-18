Jogo da Velha
Este é um jogo da velha simples, desenvolvido em Java para ser jogado localmente por dois jogadores no console.

Como funciona
O jogo da velha segue as regras tradicionais:

Dois jogadores, um jogando com o símbolo "X" e o outro com o símbolo "O".
Os jogadores se alternam para marcar uma posição em um tabuleiro de 3x3.
O objetivo é formar uma linha com três símbolos iguais, seja na horizontal, vertical ou diagonal.
Se nenhum dos jogadores conseguir formar uma linha após 9 jogadas, o jogo termina em empate ("velha").

Funcionalidades:
O jogador é solicitado a escolher uma linha e uma coluna (0, 1 ou 2) para colocar seu símbolo.
O jogo verifica automaticamente se houve um vencedor após cada jogada.
Em caso de vitória ou empate, o jogo exibe a mensagem correspondente e pergunta se os jogadores desejam iniciar uma nova partida.
A cada nova partida, o tabuleiro é resetado e o jogo reiniciado.
Requisitos
Java 8 ou superior
Nenhuma dependência externa é necessária.

Como executar
Faça o download ou clone este repositório.
Compile o código fonte utilizando o comando:
javac JogoDaVelha/Main.java

Execute o jogo com o comando: 
java JogoDaVelha.Main



