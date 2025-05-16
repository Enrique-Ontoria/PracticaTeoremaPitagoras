package app;

import clases.TrianguloRectangulo;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciar objetos
		TrianguloRectangulo T1 = new TrianguloRectangulo(5,8);
		TrianguloRectangulo T2 = new TrianguloRectangulo();
		
		//Calculos para T1
		int areaT1 = T1.area();
		double perimetroT1 = T1.perimetro();
		
		//Calculos para T2
		int areaT2 = T2.area();
		double perimetroT2 = T2.perimetro();
		
		T1.area();
		
		
		
		

	}

}
