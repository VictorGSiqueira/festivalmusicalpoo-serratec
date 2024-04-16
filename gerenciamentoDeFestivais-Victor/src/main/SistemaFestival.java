package main;

import java.util.Scanner;

import classes.Artista;
import classes.Banda;
import classes.Cantor;
import classes.DJ;
import classes.Genero;
import classes.Palco;

public class SistemaFestival {
	


	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
        Artista eric = new Cantor("Eric Clapton", Genero.BLUES, 175000, "Tenor");
        Artista blackBerry = new Banda("Black Berry Smoke", Genero.COUNTRY, 190000, 6, "Guitarra, Microfone, Bateria, Percussão, Contrabaixo e Teclado");
        Artista victor = new Cantor("Victor Siqueira", Genero.ROCK, 115000, "Tenor");
        Artista dragonforce = new Banda("Dragonforce", Genero.METAL, 320000, 6, "Guitarra, Microfone, Bateria, Contrabaixo e Teclado");
        Artista alok = new DJ("Alok", Genero.ELETRONICO, 350000, "Pioneer XDJ-RX3");
        Artista andre = new Cantor("Andre Matos", Genero.ROCK, 155000, "Tenor");
        Artista sorriso = new Banda("Sorriso Maroto", Genero.SERTANEJO, 140000, 5, "Microfone, Violão, Contrabaixo, Teclado, Bateria e Percussão");
        Artista skrillex = new DJ("Skrillex", Genero.ELETRONICO, 375000, "Pioneer cdj-2000 Nexus");

        Artista.artistas.add(eric);
        Artista.artistas.add(blackBerry);
        Artista.artistas.add(victor);
        Artista.artistas.add(dragonforce);
        Artista.artistas.add(alok);
        Artista.artistas.add(andre);
        Artista.artistas.add(sorriso);
        Artista.artistas.add(skrillex);
        
        Palco palcoPrincipal = new Palco("Principal", 32000);
        Palco palcoParalelo = new Palco("Paralelo", 18500);
        Palco palcoEletronico = new Palco("Eletrônico", 15000);
        Palco.palcos.add(palcoPrincipal);
        Palco.palcos.add(palcoParalelo);
        Palco.palcos.add(palcoEletronico);
        

        palcoPrincipal.adicionarHorario("04/05/2024 - 19:00 - " + eric.getNome());
        palcoPrincipal.adicionarHorario("04/05/2024 - 21:00 - " + victor.getNome());
        palcoPrincipal.adicionarHorario("04/05/2024 - 23:00 - " + dragonforce.getNome());
        palcoParalelo.adicionarHorario("05/05/2024 - 19:00 - " + andre.getNome());
        palcoParalelo.adicionarHorario("05/05/2024 - 21:00 - " + blackBerry.getNome());
        palcoParalelo.adicionarHorario("05/05/2024 - 23:00 - " + sorriso.getNome());
        palcoEletronico.adicionarHorario("04/05/2024 - 16:00 - " + alok.getNome());
        palcoEletronico.adicionarHorario("05/05/2024 - 16:00 - " + skrillex.getNome());
            	
        boolean sair = false;
        int escolha;
        while (!sair) {
            System.out.println("Festival SerraJava Music\n");
            System.out.println("1. Visualizar Cantores que irão se apresentar.");
            System.out.println("2. Visualizar Bandas que irão se apresentar.");
            System.out.println("3. Visualizar DJs que irão se apresentar.");
            System.out.println("4. Visualizar horários das apresentações.");
            System.out.println("5. Descrição do festival.");
            System.out.println("6. Sair.\n");

            System.out.println("Escolha uma opção: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
            		//Visualizar Cantores que irão se apresentar.
                	for(Artista artista : Artista.artistas) {
                		if(artista instanceof Cantor) {
                        	System.out.println(artista);                			
                		}
                		
                	}
                    break;
                case 2:
                	//Visualizar Bandas que irão se apresentar.
                	for(Artista artista : Artista.artistas) {
                		if(artista instanceof Banda) {
                        	System.out.println(artista);                			
                		}
                		
                	}
                    break;
                case 3:
                    //Visualizar DJs que irão se apresentar.
                	for(Artista artista : Artista.artistas) {
                		if(artista instanceof DJ) {
                        	System.out.println(artista);                			
                		}
                		
                	}
                    break;
                case 4:
                    //Visualizar horários das apresentações.
                	boolean voltar = false;
                	int escolha1;
                	while (!voltar) {
	                    System.out.println("Visualização de horários\n");
	                    System.out.println("1. Visualizar horários do Palco Principal.");
	                    System.out.println("2. Visualizar horários do Palco Paralelo.");
	                    System.out.println("3. Visualizar horários do Palco Eletrônico.");
	                    System.out.println("4. Voltar para o menu principal.\n");
	        			
	                    System.out.println("Selecione um palco.");
	        			escolha1 = scanner.nextInt();
	                	switch (escolha1) {
	                		case 1:
	                			System.out.println(palcoPrincipal.horarios);
	                			break;
	                		case 2:
	                			System.out.println(palcoParalelo.horarios);
	                			break;
	                		case 3:
	                			System.out.println(palcoEletronico.horarios);
	                			break;
	                		case 4:
	                			voltar = true;
	                			break;
	                	}
                	}
                    break;
                case 5:
                	//Descrição do festival.
                	System.out.println("O festival SerraJava Music irá reunir diversos artistas em um final de semana recheado de emoções!\n"
                			+ "Se emocione com os solos do grande guitarrista e cantor Eric Clapton!\n"
                			+ "Vibre com o som frenético da banda Dragonforce!\n"
                			+ "Curta as vibes do grande DJ Alok!\n"
                			+ "3 grandes palcos irão receber estes artistas.\n"
                			+ "Venha e traga sua família para este grande evento!\n");
                	break;
                case 6:
                	System.out.println("Fechando o sistema...\n");
                	sair = true;
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.\n");
            }
        }
	}      
}
	

