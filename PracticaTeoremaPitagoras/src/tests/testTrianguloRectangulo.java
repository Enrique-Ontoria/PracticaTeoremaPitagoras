package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.TrianguloRectangulo;

class testTrianguloRectangulo {
	TrianguloRectangulo T1 = new TrianguloRectangulo(5,8);
	TrianguloRectangulo T2 = new TrianguloRectangulo();
	
	//-------TEST TRIANGULO X DEFECTO-------//

	@Test
	void testHipotenusaTrianguloDefecto() {
		double valorEsperado = 1.41;
		double valorObtenido = T2.hipotenusa();
		assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	void testareaTrianguloDefecto() {
		double valorEsperado = 0;
		double valorObtenido = T2.area();
		assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	void testPerimetroTrianguloDefecto() {
		double valorEsperado = 3.41;
		double valorObtenido = T2.perimetro();
		assertEquals(valorEsperado,valorObtenido);
	}
	
	//------TEST TRIANGULO C/ PARAMETROS ------//
	
	@Test
	void testHipotenusaTrianguloParam() {
		double valorEsperado = 9.43;
		double valorObtenido = T1.hipotenusa();
		assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	void testAreaTrianguloParam() {
		double valorEsperado = 20;
		double valorObtenido = T1.area();
		assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	void testPerimetroTrianguloParam() {
		double valorEsperado = 22.43;
		double valorObtenido = T1.perimetro();
		assertEquals(valorEsperado,valorObtenido);
	}
	
	//------TEST TRIANGULO EXCEPCIONES ------//
	
	@Test
	void crearObjetoNoValido() {
		TrianguloRectangulo T3 = new TrianguloRectangulo(4,-9);
	}
	
	




}
