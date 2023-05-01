package Exercitiul3;

import java.util.Comparator;

public class ComparatorProdusID implements Comparator<Produs> {

	@Override
	public int compare(Produs o1, Produs o2) {
		int id = Integer.parseInt(o1);
		int id2 = Integer.parseInt(o2.getId());
		
		
		if(o1.getId() > o2.getId()) 
			return 1;
		if(o1.getId() < o2.getId()) 
			return -1;
		
		return 0;
	}
	
	

	

	}


