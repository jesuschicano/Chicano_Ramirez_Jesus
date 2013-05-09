public class Triangulo extends Figura {

	private int base;
	private int altura;

	public Triangulo() {
		// TODO Auto-generated constructor stub
		this.base = 0;
		this.altura = 0;
	}

	@Override
	void dibuja() {
		// TODO Auto-generated method stub
		base = 15;
		altura = 30;
		System.out.println(getSoyFigura() + " : un triangulo ");
	}

	@Override
	void area() {
		// TODO Auto-generated method stub
		System.out.println("El área del triángulo es: " + (base * altura) / 2);
	}

}
