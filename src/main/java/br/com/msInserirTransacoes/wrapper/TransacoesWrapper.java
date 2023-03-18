package br.com.msInserirTransacoes.wrapper;


import com.fasterxml.jackson.annotation.JsonProperty;
import br.com.msInserirTransacoes.util.TipoEnum;

public class TransacoesWrapper {
	
	@JsonProperty("tipo")
	private TipoEnum tipo;
	
	@JsonProperty("valor")
	private Double valor;
	

	public TipoEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoEnum tipo) {
		this.tipo = tipo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}
