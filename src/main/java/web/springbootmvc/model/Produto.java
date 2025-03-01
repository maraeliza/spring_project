package web.springbootmvc.model;

import java.util.ArrayList;
import java.util.List;

public class Produto {

	private String nome;
	private boolean desativado;
	private List<Caracteristica> caracteristicas = new ArrayList<>();
	private Tipo tipo;
	private Fornecedor fornecedor;

	public Produto() {
		tipo = Tipo.NAO_PERECIVEL;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isDesativado() {
		return desativado;
	}

	public void setDesativado(boolean desativado) {
		this.desativado = desativado;
	}

	public List<Caracteristica> getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(List<Caracteristica> caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public void adicionarCaracteristica(Caracteristica caracteristica) {
		caracteristicas.add(caracteristica);
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	@Override
	public String toString() {
		return "nome: " + nome + "\ndesativado: " + desativado + "\ncaracteristicas: " + caracteristicas + "\ntipo: " + tipo + "\nfornecedor: " + fornecedor;
	}

}

