package web.springbootmvc.model;

import java.util.ArrayList;
import java.util.List;

public class Ficha {
	
	private Long codigo;
	private String aluno;
	private String orientador;
	private String curso;
	private String tituloTrabalho;
	private List<Atividade> atividades = new ArrayList<>();

	public Ficha() {
	}

	public Ficha(String aluno, String orientador, String curso, String tituloTrabalho) {
		this.aluno = aluno;
		this.orientador = orientador;
		this.curso = curso;
		this.tituloTrabalho = tituloTrabalho;
	}

	public Ficha(Long codigo, String aluno, String orientador, String curso, String tituloTrabalho) {
		this.codigo = codigo;
		this.aluno = aluno;
		this.orientador = orientador;
		this.curso = curso;
		this.tituloTrabalho = tituloTrabalho;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getAluno() {
		return aluno;
	}

	public void setAluno(String aluno) {
		this.aluno = aluno;
	}

	public String getOrientador() {
		return orientador;
	}

	public void setOrientador(String orientador) {
		this.orientador = orientador;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getTituloTrabalho() {
		return tituloTrabalho;
	}

	public void setTituloTrabalho(String tituloTrabalho) {
		this.tituloTrabalho = tituloTrabalho;
	}

	public List<Atividade> getAtividades() {
		return atividades;
	}

	public void setAtividades(List<Atividade> atividades) {
		this.atividades = atividades;
	}

	public void adicionarAtividade(Atividade atividade) {
		atividades.add(atividade);
	}

	@Override
	public String toString() {
		return "codigo=" + codigo + ", aluno=" + aluno + ", orientador=" + orientador + ", curso=" + curso
				+ ", tituloTrabalho=" + tituloTrabalho;
	}

}
