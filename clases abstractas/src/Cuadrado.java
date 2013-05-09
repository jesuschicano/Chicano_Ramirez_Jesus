public class Cuadrado extends Figura {

	private int lado;

	public Cuadrado() {
		this.lado = 0;
	}

	@Override
	void dibuja() {
		lado = 5;
		System.out.println(getSoyFigura() + ": un cuadrado");
	}

	@Override
	void area() {
		System.out.println("El área del cuadrado es: " + lado * 2);
	}
}
