package br.com.alura.loja.descontos;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class Desconto {
	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}

	public BigDecimal calcular(Orcamento orcamento) {
		return deveCalcular(orcamento) ? efetuarCalculo(orcamento) : proximo.calcular(orcamento);
	}

	public abstract BigDecimal efetuarCalculo(Orcamento orcamento);

	public abstract boolean deveCalcular(Orcamento orcamento);
}
