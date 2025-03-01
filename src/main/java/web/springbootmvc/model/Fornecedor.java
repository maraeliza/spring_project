package web.springbootmvc.model;

import java.util.Objects;

public class Fornecedor {

	private Long codigo;
	private String nome;

	public Fornecedor() {
	}

	public Fornecedor(Long codigo) {
		this.codigo = codigo;
	}
	
	public Fornecedor(Long codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "codigo: " + codigo + "\nnome: " + nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fornecedor other = (Fornecedor) obj;
		return Objects.equals(codigo, other.codigo);
	}

}
