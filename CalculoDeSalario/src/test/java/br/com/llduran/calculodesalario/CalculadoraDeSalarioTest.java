package br.com.llduran.calculodesalario;

import br.com.llduran.calculodesalario.model.Cargo;
import br.com.llduran.calculodesalario.model.Funcionario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraDeSalarioTest
{
	@Test
	public void deveCalcularSalarioParaDesenvolvedoresComSalarioAbaixoDoLimite()
	{
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario();

		Funcionario desenvolvedor = new Funcionario("Maurício",1500.0, Cargo.DESENVOLVEDOR);

		double salario = calculadora.calculaSalario(desenvolvedor);

		assertEquals(1500.0 * 0.9, salario, 0.00001);
	}

	@Test
	public void deveCalcularSalarioParaDesenvolvedoresComSalarioAcimaDoLimite()
	{
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario();

		Funcionario desenvolvedor = new Funcionario("Maurício",4000.0, Cargo.DESENVOLVEDOR);

		double salario = calculadora.calculaSalario(desenvolvedor);

		assertEquals(4000.0 * 0.8, salario, 0.00001);
	}

	@Test
	public void deveCalcularSalarioParaDBAsComSalarioAbaixoDoLimite()
	{
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario();

		Funcionario desenvolvedor = new Funcionario("Maurício",500.0, Cargo.DBA);

		double salario = calculadora.calculaSalario(desenvolvedor);

		assertEquals(500.0 * 0.85, salario, 0.00001);
	}
}
