package fr.miage.mesures;

public enum UniteDistance 
{
	METRE(1),MILIMETRE(0.001),CENTIMETRE(0.01),KILOMETRE(1000),PIED(0.2),POUCE(0.03),LIEU(5000),MILES(1400);
	double factor;
	
	private UniteDistance(double unit){
		this.factor=unit;
	}
	public double getFactor(){
		return this.factor;
	}
	
	public double facteurConversion(UniteDistance unite) {
		
		return this.getFactor()/unite.getFactor();
	}

}
