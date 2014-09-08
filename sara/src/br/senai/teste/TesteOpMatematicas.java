package br.senai.teste;

import junit.framework.TestCase;

import org.junit.Test;

import br.senai.teste.software.OpMatematicas;

public class TesteOpMatematicas extends TestCase {

	@Test
	public static void testSomaDoisValoresReais() {
		Double num1 = 10d;
		Double num2 = 20d;
		Double resultadoEsperado = 30d;
		Double resultadoAtual = OpMatematicas.somaDoisValoresReais(num1, num2);

		assertEquals("Falha - Os valores não são iguais ", resultadoEsperado,
				resultadoAtual);
	}
	
	@Test
	public static void testSomaDoisValoresReaisEquals() {
		Double num1 = 10.5;
		Double num2 = 20.75;
		Double resultadoEsperado = 31.25;
		Double resultadoAtual = OpMatematicas.somaDoisValoresReais(num1, num2);

		assertEquals("Falha - Os valores não são iguais ", resultadoEsperado,resultadoAtual);
	}
	
	@Test
	public static void testSomaDoisValoresReaisTrue() {
		Double num1 = 10d;
		Double num2 = 20d;
		Double resultadoEsperado = 20d;
		Double resultadoAtual = OpMatematicas.somaDoisValoresReais(num1, num2);

		assertTrue("Falha - Os valores não são iguais ", resultadoEsperado != resultadoAtual);
	}
	
	@Test
	public static void testSomaDoisValoresReaisFalse() {
		Double num1 = 10d;
		Double num2 = 20d;
		Double resultadoEsperado = 30d;
		Double resultadoAtual = OpMatematicas.somaDoisValoresReais(num1, num2);

		assertFalse("Falha - Os valores não são iguais ", resultadoEsperado == resultadoAtual);
	}
	
	@Test
	public static void testSubtraiDoisValoresReais() {
		Double num1 = 10d;
		Double num2 = 20d;
		Double resultadoEsperado = -10d;
		Double resultadoAtual = OpMatematicas.subtraiDoisValoresReais(num1, num2);

		assertEquals("Falha - Os valores não são iguais ", resultadoEsperado , resultadoAtual);
	}
	
	@Test
	public static void testSubtraiDoisValoresReaisEquals() {
		Double num1 = 10d;
		Double num2 = 20d;
		Double resultadoEsperado = 30d; // erro proposital
		Double resultadoAtual = OpMatematicas.subtraiDoisValoresReais(num1, num2);

		assertEquals("Falha - Os valores não são iguais ", resultadoEsperado , resultadoAtual);
	}
	
	@Test
	public static void testSubtraiDoisValoresReaisTrue() {
		Double num1 = 10d;
		Double num2 = 20d;
		Double resultadoEsperado = -10d;
		Double resultadoAtual = OpMatematicas.subtraiDoisValoresReais(num1, num2);

		assertTrue("Falha - Os valores não são iguais ", resultadoEsperado == resultadoAtual);
	}
	
	@Test
	public static void testSubtraiDoisValoresReaisFalse() {
		Double num1 = 10d;
		Double num2 = 20d;
		Double resultadoEsperado = 30d;
		Double resultadoAtual = OpMatematicas.subtraiDoisValoresReais(num1, num2);

		assertFalse("Falha - Os valores não são iguais ", resultadoEsperado != resultadoAtual);
	}
	

	@Test
	public static void testDivideDoisValoresReais() {
		Double num1 = 10d;
		Double num2 = 0d; // feito para verificar a excessão.
		Double resultadoEsperado = 5d;
		Double resultadoAtual = OpMatematicas
				.divideDoisValoresReais(num1, num2);

		assertEquals("Falha - Os valores não são iguais ", resultadoEsperado,
				resultadoAtual);

	}
	@Test
	public static void testDivideDoisValoresEquals() {
		Double num1 = 10d;
		Double num2 = 5d;
		Double resultadoEsperado = 2d;
		Double resultadoAtual = OpMatematicas
				.divideDoisValoresReais(num1, num2);

		assertEquals("Falha - Os valores não são iguais ", resultadoEsperado,resultadoAtual);

	}
	
	@Test
	public static void testDivideDoisValoresReaisTrue() {
		Double num1 = 10d;
		Double num2 = 0d;
		Double resultadoEsperado = 5d;
		Double resultadoAtual = OpMatematicas
				.divideDoisValoresReais(num1, num2);

		assertFalse("Falha - Os valores não são iguais ",
				resultadoEsperado != resultadoAtual);

	}

	@Test
	public static void testDivideDoisValoresReaisFalse() {
		Double num1 = 10d;
		Double num2 = 0d;
		Double resultadoEsperado = 5d;
		Double resultadoAtual = OpMatematicas
				.divideDoisValoresReais(num1, num2);

		assertFalse("Falha - Os valores não são iguais ",
				resultadoEsperado != resultadoAtual);

	}

	@Test
	public static void testMultiplicaDoisValoresReais() {
		Double num1 = 10d;
		Double num2 = 3d;
		Double resultadoEsperado = 30d;
		Double resultadoAtual = OpMatematicas.multiplicaDoisValoresReais(num1,
				num2);
		assertTrue("Falha - OS valores não são iguais ",
				resultadoEsperado == resultadoEsperado);
	}
	
	@Test
	public static void testMultiplicaDoisValoresEquals() {
		Double num1 = 5d;
		Double num2 = 3d;
		Double resultadoEsperado = 30d;// erro proposital para verificar a operação matemática
		Double resultadoAtual = OpMatematicas.multiplicaDoisValoresReais(num1,
				num2);
		assertEquals("Falha - Os valores não são iguais ",
				resultadoEsperado , resultadoAtual);
	}
	
	@Test
	public static void testMultiplicaDoisValoresTrue() {
		Double num1 = 5d;
		Double num2 = 3d;
		Double resultadoEsperado = 30d;// erro proposital para verificar a operação matemática
		Double resultadoAtual = OpMatematicas.multiplicaDoisValoresReais(num1,
				num2);
		assertTrue("Falha - Os valores não são iguais ",
				resultadoEsperado == resultadoAtual);
	}
	
	@Test
	public static void testMultiplicaDoisValoresFalse() {
		Double num1 = 5d;
		Double num2 = 3d;
		Double resultadoEsperado = 30d;
		Double resultadoAtual = OpMatematicas.multiplicaDoisValoresReais(num1,
				num2);
		assertFalse("Falha - Os valores não são iguais ",
				resultadoEsperado != resultadoAtual);
	}

	
	
}
