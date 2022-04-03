package br.com.llduran.lojavirtual;

import br.com.llduran.lojavirtual.model.CarrinhoDeCompras;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LojaVirtualApplication implements CommandLineRunner
{
	public static void main(String[] args)
	{
		SpringApplication.run(LojaVirtualApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
	}
}
