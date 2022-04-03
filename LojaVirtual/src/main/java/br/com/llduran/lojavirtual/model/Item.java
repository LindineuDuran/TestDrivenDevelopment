package br.com.llduran.lojavirtual.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Item
{
	private String descricao;
	private int quantidade;
	private double valorUnitario;

	public double getValorTotal()
	{
		return this.valorUnitario * this.quantidade;
	}
}