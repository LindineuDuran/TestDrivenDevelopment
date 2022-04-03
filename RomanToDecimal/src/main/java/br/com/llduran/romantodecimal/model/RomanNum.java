package br.com.llduran.romantodecimal.model;

import java.util.stream.Stream;

public enum RomanNum
{
	I(1),
	V(5),
	X(10),
	L(50),
	C(100),
	D(500),
	M(1000);

	private int decimal;

	/**
	 * @param decimal
	 */
	private RomanNum(int decimal)
	{
		this.decimal = decimal;
	}

	/**
	 * @return the decimal
	 */
	public int getDecimal()
	{
		return decimal;
	}

	public static Stream<RomanNum> stream()
	{
		return Stream.of(RomanNum.values());
	}
}
