package fr.miage.temporel;

import java.util.Date;

/*public class Intervalle<T extends Comparable<T>> {

	private final T debut;
	private final T fin;


	public Intervalle(){
	}
	
	public Intervalle(T min, T max) {
		debut = min;
		fin = max;

	}*/
public class Intervalle{
	private final  Date debut;
	private final  Date fin;
	
	public Intervalle(){
		debut=new Date();
		fin=new Date();
	}
	public Date getDebut() {
		return debut;
	}

	public Date getFin() {
		return fin;
	}
	
	/*
	 * public static void main(String [] args){ Date tata = new
	 * Date(2000,01,01); Date tata2 = new Date(2000,01,03);
	 * System.out.println(tata.compareTo(tata)); }
	 */

}
