package fr.miage.mesures;

public class MesureMasse {

	double quant;
	UniteMasse unit;
	
	
	public MesureMasse (double quant, UniteMasse unit ){
		this.unit=unit;
		this.quant=quant;
	}


	public double getQuant() {
		return quant;
	}


	public void setQuant(double quant) {
		this.quant = quant;
	}


	public UniteMasse getUnit() {
		return unit;
	}


	public void setUnit(UniteMasse unit) {
		this.unit = unit;
	}
	
	public MesureMasse conversion(UniteMasse unite){
		return new MesureMasse(quant*unit.facteurConversion(unite),unite);
	}
	

	
	
}
