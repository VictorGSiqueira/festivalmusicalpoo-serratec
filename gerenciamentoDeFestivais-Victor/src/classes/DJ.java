package classes;

public class DJ extends Artista {
	private String equipamento;

	public DJ(String nome, Genero genero, double cache, String equipamento) {
		super(nome, genero, cache);
		this.equipamento = equipamento;
	}

	public String getEquipamento() {
		return equipamento;
	}

	@Override
	public String toString() {
		return super.toString() + "\nEquipamento: " + equipamento + "\n";
	}
	
	

}
