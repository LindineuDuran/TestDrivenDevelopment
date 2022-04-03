package br.com.llduran.romantodecimal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversorNumeroRomanoTest
{
	@Test
	public void deveRetornarTrueSeForNumeroRomanoValido()
	{
		String valorRomano = "MMVI";

		// Instancia uma nova conversão de um valor em Romano para um valor em Decimal
		ConversorNumeroRomano romano = new ConversorNumeroRomano();

		// Valida o teste
		assertTrue(romano.isRomanNumber(valorRomano));
	}

	@Test
	public void deveRetornarFalseSeNaoForNumeroRomanoValido()
	{
		String valorRomano = "MGVI";

		// Instancia uma nova conversão de um valor em Romano para um valor em Decimal
		ConversorNumeroRomano romano = new ConversorNumeroRomano();

		// Valida o teste
		assertFalse(romano.isRomanNumber(valorRomano));
	}

	@Test
	/*
	 * recebendo uma String com o numeral romano I e devolvendo o valor inteiro 1
	 */
	public void deveEntenderSimboloI()
	{
		ConversorNumeroRomano romano = new ConversorNumeroRomano();
		int numero = romano.converte("I");
		assertEquals(1, numero);
	}

	@Test
	/*
	 * recebendo uma String com o numeral romano V e devolvendo o valor inteiro 5
	 */
	public void deveEntenderSimboloV()
	{
		ConversorNumeroRomano romano = new ConversorNumeroRomano();
		int numero = romano.converte("V");
		assertEquals(5, numero);
	}

	@Test
	/*
	 * recebendo uma String com o numeral romano II e devolvendo o valor inteiro 2
	 */
	public void deveEntenderSimboloII()
	{
		ConversorNumeroRomano romano = new ConversorNumeroRomano();
		int numero = romano.converte("II");
		assertEquals(2, numero);
	}

	@Test
	/*
	 * recebendo uma String com o numeral romano XXII e devolvendo o valor inteiro 22
	 */
	public void deveEntenderSimboloXXII()
	{
		ConversorNumeroRomano romano = new ConversorNumeroRomano();
		int numero = romano.converte("XXII");
		assertEquals(22, numero);
	}

	@Test
	/*
	 * recebendo uma String com o numeral romano IX e devolvendo o valor inteiro 9
	 */
	public void deveEntenderSimboloIX()
	{
		ConversorNumeroRomano romano = new ConversorNumeroRomano();
		int numero = romano.converte("IX");
		assertEquals(9, numero);
	}

	@Test
	/*
	 * recebendo uma String com o numeral romano XXIV e devolvendo o valor inteiro 24
	 */
	public void deveEntenderSimboloXXIV()
	{
		ConversorNumeroRomano romano = new ConversorNumeroRomano();
		int numero = romano.converte("XXIV");
		assertEquals(24, numero);
	}
}
