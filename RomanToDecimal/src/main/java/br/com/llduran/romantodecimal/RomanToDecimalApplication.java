package br.com.llduran.romantodecimal;

import br.com.llduran.romantodecimal.exception.NumeroRomanoInvalidoException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RomanToDecimalApplication implements CommandLineRunner
{
	public static void main(String[] args)
	{
		SpringApplication.run(RomanToDecimalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		String valorRomano = "MMVI";
		try
		{
			converteValor(valorRomano);
		}
		catch (NumeroRomanoInvalidoException e)
		{
			System.out.println(e.getMessage());
		}

		valorRomano = "MCMXLIV";
		try
		{
			converteValor(valorRomano);
		}
		catch (NumeroRomanoInvalidoException e)
		{
			System.out.println(e.getMessage());
		}

		valorRomano = "IV";
		try
		{
			converteValor(valorRomano);
		}
		catch (NumeroRomanoInvalidoException e)
		{
			System.out.println(e.getMessage());
		}

		valorRomano = "AIV";
		try
		{
			converteValor(valorRomano);
		}
		catch (NumeroRomanoInvalidoException e)
		{
			System.out.println(e.getMessage());
		}

	}

	private static void converteValor(String valorRomano) throws NumeroRomanoInvalidoException
	{
		// Instancia uma nova conversão de um valor em Romano para um valor em Decimal
		ConversorNumeroRomano romano = new ConversorNumeroRomano();

		if (romano.isRomanNumber(valorRomano))
		{
			int valorConversaoRomanoParaDecimal = romano.converte(valorRomano);
			System.out.println(
					"O número romano " + valorRomano + " vale " + valorConversaoRomanoParaDecimal + " em decimal");
		}
		else
		{
			throw new NumeroRomanoInvalidoException(valorRomano + " não é um número romano válido!!!");
		}
	}
}
