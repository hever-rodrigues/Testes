package br.senai.teste;

import org.junit.Test;

import br.senai.teste.software.ValidadorCPF;
import junit.framework.TestCase;

public class TesteValidadorCPF extends TestCase {

	@Test
	public static void testRetiraCaracterInvalido() {

		String cpfParaValidar = "833.853.878-76";
		String cpfAtual = ValidadorCPF
				.retiraCaracteresInvalidos(cpfParaValidar);
		String cpfEsperado = "83385387876";
		assertEquals("Teste Invalido", cpfEsperado, cpfAtual);
	}

	@Test
	public static void testRetiraCaracterInvalidoEquals() {

		String cpfParaValidar = "833.853.878-76";
		String cpfAtual = ValidadorCPF
				.retiraCaracteresInvalidos(cpfParaValidar);
		String cpfEsperado = "83385387870";// erro proposital
		assertEquals("Teste Invalido", cpfEsperado, cpfAtual);

	}

	@Test
	public static void testRetiraCaracterInvalidoTrue() {

		String cpfParaValidar = "833.853.878-76";
		String cpfAtual = ValidadorCPF
				.retiraCaracteresInvalidos(cpfParaValidar);
		String cpfEsperado = "83385387876";
		assertTrue("Teste Invalido", cpfEsperado != cpfAtual);

	}

	@Test
	public static void testRetiraCaracterInvalidoFalse() {

		String cpfParaValidar = "833.853.878-76";
		String cpfAtual = ValidadorCPF
				.retiraCaracteresInvalidos(cpfParaValidar);
		String cpfEsperado = "83385387876";
		assertFalse("Teste Invalido", cpfEsperado == cpfAtual);

	}

	public static void testIsCPFPadrao() {
		String cpfPadrao = "00000000000";
		String[] listCpfPadrao = new String[10];
		for (int i = 0; i < listCpfPadrao.length; i++) {
			listCpfPadrao[i] = (i + "" + i + "" + i + "" + i + "" + i + "" + i
					+ "" + i + "" + i + "" + i + "" + i + "" + i).toString();
		}

		boolean isPadrao = false;
		for (int i = 0; i < listCpfPadrao.length; i++) {
			if (listCpfPadrao[i].contains(cpfPadrao)) {
				isPadrao = true;
			}
		}
		assertTrue(isPadrao);

	}

	
	
}

/*
 * 
 * @Test public static void testMultiplicaDoisValoresFalse() { Double num1 = 5d;
 * Double num2 = 3d; Double resultadoEsperado = 30d; Double resultadoAtual =
 * OpMatematicas.multiplicaDoisValoresReais(num1, num2);
 * assertFalse("Falha - Os valores não são iguais ", resultadoEsperado !=
 * resultadoAtual); }
 * 
 * }
 */