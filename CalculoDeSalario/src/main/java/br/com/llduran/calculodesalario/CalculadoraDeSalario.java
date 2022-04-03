package br.com.llduran.calculodesalario;

import br.com.llduran.calculodesalario.model.Cargo;
import br.com.llduran.calculodesalario.model.Funcionario;

public class CalculadoraDeSalario
{
	public double calculaSalario(Funcionario funcionario)
	{
		if(funcionario.getSalario() > 3000.0) { return funcionario.getSalario() * 0.8; }

		return funcionario.getSalario() * 0.9;
	}
}
