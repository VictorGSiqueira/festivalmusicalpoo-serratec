package classes;

public class Banda extends Artista {
	private int numeroIntegrantes;
	private String instrumentos;

	public Banda(String nome, Genero genero, double cache, int numeroIntegrantes, String instrumentos) {
		super(nome, genero, cache);
		this.numeroIntegrantes = numeroIntegrantes;
		this.instrumentos = instrumentos;
	}

	public int getNumeroIntegrantes() {
		return numeroIntegrantes;
	}
	

	public String getInstrumentos() {
		return instrumentos;
	}

	@Override
	public String toString() {
		return super.toString() + "\nNúmero de Integrantes: " + numeroIntegrantes + "\nInstrumentos: " + instrumentos + "\n";
	}
}
