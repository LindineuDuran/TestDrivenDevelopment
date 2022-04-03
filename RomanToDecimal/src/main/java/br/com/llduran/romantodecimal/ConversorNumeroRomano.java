package br.com.llduran.romantodecimal;

import br.com.llduran.romantodecimal.model.RomanNum;

import java.util.List;
import java.util.stream.Collectors;

public class ConversorNumeroRomano
{
	public int converte(String numeroRomano)
	{
		int acumulador = 0;
		int ultimoVizinhoDireita = 0;

		int[] i = new int[1];
		for(i[0] = numeroRomano.length()-1; i[0]  >= 0; i[0]--)
		{
			// pega o inteiro referente ao simbolo atual
			List<Integer> numeroDecimal = RomanNum.stream().filter(r -> r.name().equals(numeroRomano.charAt(i[0])+"")).map(r -> r.getDecimal()).collect(Collectors.toList());
			int atual = numeroDecimal.get(0);

			// se o da direita for menor, o multiplicaremos por -1 para torná-lo negativo
			int multiplicador = 1;
			if(atual < ultimoVizinhoDireita) {multiplicador = -1;}

			acumulador += atual * multiplicador;

			// atualiza o vizinho da direita
			ultimoVizinhoDireita = atual;
		}

		return acumulador;
	}
}
