package com.java.game;

public class Personagem {
	
	 protected int felicidade;
	 protected int fome;
	 protected String nome;	
	 final int LIMITE = 100;
	 
	 public Personagem(int felicidade, int fome, String nome) {
		 this.felicidade = felicidade;
		 this.fome = fome;
		 this.nome = nome;
	 }

	 protected void barra() {
		 System.out.print("Felicidade: ");
			for(int i = 0; i < felicidade; i = i + 10) {
				System.out.print("[]");
			}
			System.out.print("\n\nFome: ");
			for(int i = 0; i < fome; i = i + 10) {
				System.out.print("[]");
			}
	 }
	 
	 protected void face() {
			if(felicidade > 50) {
				System.out.println("(＾▽＾)");
			} else {
				System.out.println("ಥ_ಥ");
			}
	 }
	 
	public int getFelicidade() {
		if(felicidade > LIMITE) {
			felicidade = LIMITE;
		}
		return felicidade;
	}

	public void setFelicidade(int felicidade) {
		this.felicidade = felicidade;
	}

	public int getFome() {
		if(fome > LIMITE) {
			fome = LIMITE;
		}
		return fome;
	}

	public void setFome(int fome) {
		this.fome = fome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "\nNome: " + getNome() + 
				"\nFelicidade: " + getFelicidade() + 
				"\nFome: " + getFome();
	}
	 

}
