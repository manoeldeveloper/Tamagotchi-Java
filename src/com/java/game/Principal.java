package com.java.game;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	static Scanner leia = new Scanner(System.in);
	static ArrayList<Personagem> personagem;
	
	public static void main(String[] args) {
		personagem = new ArrayList<Personagem>();
		criarPersonagem();
	}
	 protected static void criarPersonagem() {
        System.out.println("Bem vindo(a) ao Tamagotchi!!\n");
          System.out.println("Digite o nome do seu personagem:");
             String nome = leia.nextLine();
            Personagem p = new Personagem(50, 50, nome);
          personagem.add(p);
        System.out.printf("Seja bem vindo(a) ao mundo %s!!\n\n",nome);
menu();
	}
	protected static void menu() {
		System.out.println("----------TAMAGOTCHI----------");
		for(Personagem p : personagem) {
		System.out.printf("\tEscolha uma ação para %s:\n\n", p.getNome());
		p.barra();
		System.out.println("\n\n");
		p.face();
		}
		System.out.println("\n\n1 - Alimentar\n");
		System.out.println("2 - Passsear\n");
		System.out.println("3 - Dar Carinho\n");
		System.out.println("4 - Dormir\n");
		
		int opt = leia.nextInt();
		
		switch(opt) {
		case 1:
			alimentar();
			break;
		case 2:
			Passear();
			break;
		case 3:
			carinho();
			break;
		case 4:
			dormir();
			break;
			default :
				System.out.println("Digite uma das opções");
				menu();
		}

	 }
	//Static significa que faz parte dessa classe e não pode ser acessada por outras
	private static void dormir() {
		for(Personagem p : personagem) {
			p.setFelicidade(p.getFelicidade() - 30);
			p.setFome(p.getFome() - 30);
		}
		morte();
		menu();
	}
	private static void carinho() {
		for(Personagem p : personagem) {
			p.setFelicidade(p.getFelicidade() + 10);
			p.setFome(p.getFome());
		}
		morte();
		menu();
	}
	private static void Passear() {
		for(Personagem p : personagem) {
			p.setFelicidade(p.getFelicidade() + 10);
			p.setFome(p.getFome() - 40);
		}
		morte();
		menu();		
	}
	private static void alimentar() {
		for(Personagem p : personagem) {
			p.setFelicidade(p.getFelicidade() + 5);
			p.setFome(p.getFome() + 40);
		}
		morte();
		menu();		
	}
	
	private static void morte() {
		for(Personagem p : personagem) {
		if(p.getFome() <=0 ) {
			System.out.println("O seu personagem morreu de fome ;(");
			System.exit(0);
		}
		}
		menu();
	}

}
