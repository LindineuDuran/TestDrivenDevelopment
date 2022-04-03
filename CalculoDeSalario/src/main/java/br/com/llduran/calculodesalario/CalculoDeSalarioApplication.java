package br.com.llduran.calculodesalario;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculoDeSalarioApplication implements CommandLineRunner
{
	public static void main(String[] args)
	{
		SpringApplication.run(CalculoDeSalarioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		System.out.println("Executando a aplicação");
	}
}
