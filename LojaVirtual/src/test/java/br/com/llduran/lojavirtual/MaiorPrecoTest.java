package br.com.llduran.lojavirtual;

import br.com.llduran.lojavirtual.model.CarrinhoDeCompras;
import br.com.llduran.lojavirtual.model.CarrinhoDeComprasBuilder;
import br.com.llduran.lojavirtual.model.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaiorPrecoTest
{
	private CarrinhoDeCompras carrinho;

	@BeforeEach
	public void setUp()
	{
		carrinho = new CarrinhoDeCompras();
	}

	@Test
	public void deveRetornarZeroSeCarrinhoVazio()
	{
		CarrinhoDeCompras carrinho = new CarrinhoDeComprasBuilder().cria();
		assertEquals(0.0, carrinho.maiorValor(), 0.0001);
	}

	@Test
	public void deveRetornarValorDoItemSeCarrinhoCom1Elemento()
	{
		// carrinho.adiciona(new Item("Geladeira", 1, 900.0));
		CarrinhoDeCompras carrinho = new CarrinhoDeComprasBuilder()
				                     .comItens(900.0)
				                     .cria();

		assertEquals(900.0, carrinho.maiorValor(), 0.0001);
	}

	@Test
	public void deveRetornarMaiorValorSeCarrinhoContemMuitosElementos()
	{
		// carrinho.adiciona(new Item("Geladeira", 1, 900.0));
		// carrinho.adiciona(new Item("Fogão", 1, 1500.0));
		// carrinho.adiciona(new Item("Máquina de Lavar", 1, 750.0));

		CarrinhoDeCompras carrinho = new CarrinhoDeComprasBuilder()
				                         .comItens(900.0, 1500.0, 750.0)
				                         .cria();

		assertEquals(1500.0, carrinho.maiorValor(), 0.0001);
	}
}