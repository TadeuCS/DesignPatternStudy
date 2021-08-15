package br.com.alura.loja.imposto;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.loja.orcamento.Orcamento;

public class ICMS implements Imposto{
	@Override
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal(0.10)).setScale(2, RoundingMode.HALF_UP);
	}
}
