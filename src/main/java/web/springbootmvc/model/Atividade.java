package web.springbootmvc.model;

public class Atividade {
	
	private Long codigo;
	private String data;
	private int minutos;
	private String resumo;

	public Atividade() {
	}

	public Atividade(String data, int minutos, String resumo) {
		this.data = data;
		this.minutos = minutos;
		this.resumo = resumo;
	}

	public Atividade(Long codigo, String data, int minutos, String resumo) {
		this.codigo = codigo;
		this.data = data;
		this.minutos = minutos;
		this.resumo = resumo;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	@Override
	public String toString() {
		return "codigo=" + codigo + ", data=" + data + ", minutos=" + minutos + ", resumo=" + resumo;
	}

}
