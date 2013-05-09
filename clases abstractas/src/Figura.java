
abstract class Figura {
	private String soyFigura;
	
	Figura(){
		this.soyFigura= new String (" soy una figura en 2D ");
	}
	
	String getSoyFigura(){
		return soyFigura;
	}
	
	abstract void dibuja();
	abstract void area();
}
