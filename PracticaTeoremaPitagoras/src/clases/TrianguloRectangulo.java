package clases;

public class TrianguloRectangulo {
	//Propiedades de clase
	private int a;
	private int b;
	private double c;
	
	/*
	 * Constructor por defecto
	 */
	public TrianguloRectangulo() {
		this.a = 1;
		this.b = 1;
	}
	
	/*
	 * Constructor que recibe 2 catetos.
	 * Si recibe catetos inferiores a 0 lanza excepción.
	 * @param recibe 2 parametros que representan catetos.
	 * @throws IllegalArgumentException si el numero introducido x parametros es menor o igual a 0
	 */
	public TrianguloRectangulo(int cateto1, int cateto2) {
		if(cateto1 <= 0 || cateto2 <= 0) throw new IllegalArgumentException("El cateto introducido x parametro no es valido");
		this.a = cateto1;
		this.b = cateto2;
	}
	
	/*
	 * Metodo que devuelve el calcula el area de un TrianguloRectangulo.
	 * @return devuelve (a*b)/2.
	 */
	public int area() {
		int area = (this.a*this.b)/2;
		return area;
	}
	
	/*
	 * Metodo que devuelve el calculo de la hipotenusa de un TrianguloRectangulo.
	 * @return devuelve la raiz cuadrada de (a*a)+(b*b) para optener la hipotenusa.
	 */
	public double hipotenusa() {
		this.c = Math.sqrt((this.a*this.a)+(this.b*this.b));
		return Math.round(this.c * 100.0) / 100.0;
	}
	
	/*
	 * Metodo que devuelve el calculo del perimetro de un TrianguloRectangulo.
	 * @return devuleve la suma de (A + B) + hipotenusa(), el cual se debe de calcular previamente
	 */
	public double perimetro() {
		double perimetro =  (this.a+this.b) + hipotenusa();
		return Math.round(perimetro * 100.0) / 100.0;
	}

	//Metodos Getters y Setters
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	//Metodo toString
	@Override
	public String toString() {
		return "TrianguloRectangulo [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	

	
	
	
	
	
	

}
