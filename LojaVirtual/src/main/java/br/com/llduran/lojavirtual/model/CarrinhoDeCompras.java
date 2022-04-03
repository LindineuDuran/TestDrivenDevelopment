package br.com.llduran.lojavirtual.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@ToString
public class CarrinhoDeCompras
{
	private List<Item> itens;

	public CarrinhoDeCompras() { this.itens = new ArrayList<Item>(); }

	public void adiciona(Item item)
	{
		this.itens.add(item);
	}

	public List<Item> getItens()
	{
		return Collections.unmodifiableList(itens);
	}

	public double maiorValor()
	{
		if(itens.size() == 0) { return 0; }

		DoubleSummaryStatistics summary = (DoubleSummaryStatistics) itens.stream()
				                                                         .map(i -> i.getValorTotal())
				                                                         .collect(Collectors.summarizingDouble(Double::doubleValue));

		double maior = summary.getMax();

		return maior;
	}
}