package fr.miage.mesures;

public enum UniteMasse {
	KILOGRAMME(1000),GRAMME(1),MILIGRAMME(0.001),TONNE(1000000);

	double factor;
	private UniteMasse(double unite){
		this.factor=unite;
	}
	public double getFactor(){
		
		return factor;
		
	}
	public double facteurConversion(UniteMasse unite) {
		
		return this.getFactor()/unite.getFactor();
	}


}