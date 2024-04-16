package classes;

import java.util.ArrayList;
import java.util.List;

public abstract class Artista {
	private String nome;
	private Genero genero;
	private double cache;
	public static List<Artista> artistas = new ArrayList<>();
	
	public Artista(String nome, Genero genero, double cache) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.cache = cache;
	}

	public String getNome() {
		return nome;
	}

	public Genero getGenero() {
		return genero;
	}

	public double getCache() {
		return cache;
	}

	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public void setCache(double cache) {
		this.cache = cache;
	}

	@Override
	public String toString() {
		return String.format("Nome: %s\nGênero: %s\nCachê: R$%.2f", nome, genero, cache);
	}
}
