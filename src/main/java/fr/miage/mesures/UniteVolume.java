package fr.miage.mesures;

public enum UniteVolume {
	
	CENTIMETRECUBE(1),LITRE(1000),METRECUBE(1000000);
	
	double factor;
	private UniteVolume(double unit){
		this.factor=unit;
	}
	
	public double getFactor(){
		
		return factor;
	}
	
	public double facteurConversion(UniteVolume unite) {
		
		return this.getFactor()/unite.getFactor();
	}


}