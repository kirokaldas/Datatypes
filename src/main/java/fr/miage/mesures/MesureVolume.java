package fr.miage.mesures;

public class MesureVolume {

	double quant;
	
	UniteVolume unit;
	
	
	public MesureVolume (double quant, UniteVolume unit ){
		this.unit=unit;
		this.quant=quant;
	}


	public double getQuant() {
		return quant;
	}


	public void setQuant(double quant) {
		this.quant = quant;
	}


	public UniteVolume getUnit() {
		return unit;
	}


	public void setUnit(UniteVolume unit) {
		this.unit = unit;
	}
	
	public MesureVolume conversion(UniteVolume unite){
		return new MesureVolume(quant*unit.facteurConversion(unite),unite);
	}
	

	
	
}
