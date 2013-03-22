package fr.miage.temporel;

import java.util.Date;

public class Duree {
	Intervalle inter=new Intervalle();
	
	public int duree(Date date1,Date date2){
	//	date1=inter.getDebut();
	//	date2=inter.getFin();
		int diffInDays = (int)( (date2.getTime() - date1.getTime()) 
				/ (1000 * 60 * 60 * 24) );
		return diffInDays;
	}

	public static void main(String [] args){
		Duree duree =new Duree();
		Date tata = new Date(2000,01,01); 
		Date tata2 = new Date(2001,01,01);
		System.out.println(duree.duree(tata, tata2));
		
	}

}
