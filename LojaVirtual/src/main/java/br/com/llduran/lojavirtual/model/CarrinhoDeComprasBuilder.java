package br.com.llduran.lojavirtual.model;

import java.util.Arrays;

public class CarrinhoDeComprasBuilder
{
	public CarrinhoDeCompras carrinho;

	public CarrinhoDeComprasBuilder()
	{
		this.carrinho = new CarrinhoDeCompras();
	}

	public CarrinhoDeComprasBuilder comItens(double... valores)
	{
		Arrays.stream(valores).forEach(v -> carrinho.adiciona(new Item("item", 1, v)));
		return this;
	}

	public CarrinhoDeCompras cria()
	{
		return carrinho;
	}
}
