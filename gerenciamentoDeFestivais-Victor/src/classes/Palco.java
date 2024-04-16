package classes;

import java.util.ArrayList;
import java.util.List;

public class Palco {
    private String nome;
    private int capacidade;
    public List<String> horarios;
	public static List<Palco> palcos = new ArrayList<>();

    public Palco(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.horarios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public List<String> getHorarios() {
        return horarios;
    }

	@Override
	public String toString() {
		return "Palco: " + nome + "\nCapacidade: " + capacidade + "\nHorários: " + horarios;
	}

	public void adicionarHorario(String horarioShow) {
		horarios.add(horarioShow);		
	}

	

}
