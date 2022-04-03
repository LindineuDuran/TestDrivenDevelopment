package br.com.llduran.calculodesalario.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Funcionario
{
	private String nome;
	private double salario;
	private Cargo cargo;
}
