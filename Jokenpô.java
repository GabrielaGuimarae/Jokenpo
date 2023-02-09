//Importação de Bibliotecas
import java.util.Scanner;

//Jogo Jokenpo
public class Jokenpô {
	
	//	Placar
		private static int placarJogador = 0;
		private static int placarComputador = 0;
		
	//	Jogadores
		private static int escolhaJogador;
		private static int escolhaComputador;

	//	Principal
		public static void main(String[] args) {
			
			//Quantidade de rodadas
			int rodadas = 0;
			//Reiniciar o Jogo
			int reiniciar = 1;
			//Entrada de dado
			Scanner input1 = new Scanner(System.in);
			
			//Saída de dados
			System.out.println("------------  Jokenpô  ------------");
			System.out.println("!!Olá jogador, Bem-Vindo ao Jokenpô!!");
			System.out.println("-----------------------------------");
			System.out.println("-------  Você tem 3 rodadas  ------");
			rodadas = 3;
			System.out.println("------------------------------------");
			
			//Reinicar o jogo
			while(reiniciar==1) {
				
				//Rodar o jogo
				for(int i=1;i<=rodadas; i++) {
					
					//Imprimi a escolha do jogador
					//Escolha do jogador
					rotuloJogador();
					escolhaJogador = input1.nextInt();//Input de jogador(reutilização do input)
					//Substituir letra por número
					switch(escolhaJogador) {
					
						case 1: //(1)Pedra
							System.out.println("      A sua escolha foi pedra       ");
							System.out.println("------------------------------------");
							break;
					
						case 2: //(2)Papel
							System.out.println("      A sua escolha foi papel      ");
							System.out.println("------------------------------------");
							break;
					
						case 3: //(3)Tesoura
							System.out.println("      A sua escolha foi tesoura      ");
							System.out.println("------------------------------------");
							break;
					}
					
					//Imprimi a escolha do computador
					escolhaComputador = (int) (Math.random()*3)+1;
					
					//Escolha do computador
					//Substituir letra por número
					switch(escolhaComputador) {
					
						case 1: //(1)Pedra
							System.out.println("     A escolha do computador foi pedra     ");
							System.out.println("---------------------------------------");
							break;
					
						case 2: //(2)Papel
							System.out.println("      A escolha do computador foi papel      ");
							System.out.println("-----------------------------------------");
							break;
					
						case 3: //(3)Tesoura
							System.out.println("      A escolha do computador foi tesoura       ");
							System.out.println("--------------------------------------------");
							break;
					}
					//Verifica resultado
					verificaResultado();
				}
				//Verifica o placar
				verificaPlacar();

			
			//Pergunta ao usuário se ele quer reinicar o jogo
			System.out.println("     ");
			System.out.println("Quer começar um novo jogo?");
			System.out.println("(1)Sim  (0) Não");
			reiniciar = input1.nextInt();
			}
		}
	
	
		//Verifica resultado
		public static void verificaResultado() {
			//Comparações
			//Empate
			if(escolhaJogador == escolhaComputador) {
				System.out.println("---- (⊙ˍ⊙) Empate (⊙ˍ⊙) -----");
			}
			//Vitória Jogador
			else if((escolhaJogador - escolhaComputador) == -1 || (escolhaJogador - escolhaComputador) == 2){	
				System.out.println("(～￣▽￣)～  Você ganhou essa rodada  (～￣▽￣)～");
				placarComputador ++;
			}
			//Vitória Computador
			else {
				System.out.println("≡(▔﹏▔)≡  Você perdeu essa rodada  ≡(▔﹏▔)≡");
				placarJogador ++;
			}
		}
		
		
		
	//	Exibir o placar
		private static void verificaPlacar() {
			if(placarJogador > placarComputador) {
				System.out.println("---- Você ganhou o jogo! ----");
			}
			else if(placarJogador < placarComputador) {
				System.out.println("---- O computador ganhou o jogo! ----");
			}
			else{
				System.out.println("---- (⊙ˍ⊙) Empate (⊙ˍ⊙) -----");
			}
		}
		
		
	//	Onde o Jogador faz a sua jogada
		private static void rotuloJogador() {
			System.out.println("                                    ");
			System.out.println("Jogador, Escolha sua opção");
			System.out.println("----          Insira:           ----");
			System.out.println(" - - - - - - - - - - - - - - - - - -");
			System.out.println("(1)Pedra  (2)Papel  (3)Tesoura");
			System.out.println(" - - - - - - - - - - - - - - - - - -");
		}
		
		
}
// ********** Desenvolvido por Gabriela Guimarães **********
