package br.senai.teste.software;

public class OpMatematicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(somaDoisValoresReais(10d, 20d));

	}

	public static Double somaDoisValoresReais(Double num1, Double num2) {

		if (num1 != null && num2 != null) {
			return num1 + num2;
		}
		throw new NumberFormatException("Erro");

	}

	public static Double subtraiDoisValoresReais(Double num1, Double num2) {
		if (num1 != null && num2 != null) {
			return num1 - num2;
		}
		throw new NumberFormatException("Erro Subtração");
	}

	public static Double divideDoisValoresReais(Double num1, Double num2) {

		if (num2 == 0) {
			throw new NumberFormatException("Não é possivel dividir por zero");
		}

		if (num1 != null && num2 != null) {
			return num1 / num2;
		}
		throw new NumberFormatException(
				"Você deve passar dois valores para o calculo");
	}

	public static Double multiplicaDoisValoresReais(Double num1, Double num2) {

		if (num1 != null && num2 != null) {
			return num1 * num2;
		}
		throw new NumberFormatException("Você deve passar dois valores para o calculo");
	}
	
	

}
