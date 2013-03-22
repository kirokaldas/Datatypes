package fr.miage.mesures;

public class MesureDistance {

	double quant;
	UniteDistance unit;
	
	
	public MesureDistance (double quant, UniteDistance unit ){
		this.unit=unit;
		this.quant=quant;
	}


	public double getQuant() {
		return quant;
	}


	public void setQuant(double quant) {
		this.quant = quant;
	}


	public UniteDistance getUnit() {
		return unit;
	}


	public void setUnit(UniteDistance unit) {
		this.unit = unit;
	}
	
	public MesureDistance conversion(UniteDistance unite){
		return new MesureDistance(quant*unit.facteurConversion(unite),unite);
	}
	
	
}
