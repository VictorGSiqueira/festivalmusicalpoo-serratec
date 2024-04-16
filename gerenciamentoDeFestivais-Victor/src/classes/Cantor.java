package classes;

public class Cantor extends Artista{
	private String classificacaoVocal;

	public Cantor(String nome, Genero genero, double cache, String classificacaoVocal) {
		super(nome, genero, cache);
		this.classificacaoVocal = classificacaoVocal;
	}

	public String getClassificacaoVocal() {
		return classificacaoVocal;
	}

	@Override
	public String toString() {
		return super.toString() + "\nClassificação vocal: " + classificacaoVocal + "\n";
	}
	
	

}
