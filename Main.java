import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		


		ArrayList<Scaun> scaune = new ArrayList<>();
		scaune.add(new Scaun("123A" , 78.99, 4, 2001));
		scaune.add(new Scaun("123B", 90.23, 2, 1998));
		scaune.add(new Scaun("123ABC", 98.23, 2, 1990));
		scaune.add(new Scaun("1234A", 120.23, 2, 2004));
		
		
		List<Scaun> scaune1 = new ArrayList<>();
		scaune1.add(new Scaun("123B", 90.23, 2, 1998));
		
		
		Scaun scaun1 = new Scaun("123BCD", 90.23, 2, 2002);
		
		
		for(Scaun a:scaune) {
			System.out.println(a);
			
		}
		System.out.println("===========");
		System.out.println("Afisare care testeaza anul de fabricatie:");

		for(Scaun a:scaune) {
			a.getAnFabricatePeste2000sauInainte(a);
			System.out.println(a);
		}
		
		System.out.println("============");
		System.out.println("Numarul de picioare pentru fiecare scaun:");
		
		for(Scaun a:scaune) {
			System.out.println("Numarul de picioare pentru scaunul " + a.getIDFabrica() + " este: " + a.getNrPicioare());
		}
		
		
		System.out.println("===========");
		System.out.println("Comparare intre scaune dupa pret: ");
		
		Collections.sort(scaune , new Comparator<Scaun>() {

			@Override
			public int compare(Scaun o1, Scaun o2) {
				if(o1.getPret() > o2.getPret()) {
					System.out.println("Scaunul " + o1.getIDFabrica() + " are pretul mai mare decat " + o2.getIDFabrica());
				}
				if(o1.getPret() < o2.getPret()) {
					System.out.println("Scaunul " + o2.getIDFabrica() + " are pretul mai mare decat " + o1.getIDFabrica());
				}
				return 0;
			}
		});
		
		System.out.println("=============");
		System.out.println("Afisare daca un scaun face parte din lista sau nu: ");
		
		for(Scaun a:scaune1) {
			a.getFaceParteDinLista(scaune1, scaun1);
			
		}
		
	
		
		Collections.sort(scaune, new Comparator<Scaun>() {

			@Override
			public int compare(Scaun o1, Scaun o2) {
				if(o1.getPret() > o2.getPret()) {
					return 1;
				}
				if(o1.getPret() < o2.getPret()) {
					return -1;
				}
				return 0;
			}
		});
		
		System.out.println("==========");
		System.out.println("Sortare afisata dupa pret: ");
		
		for(Scaun a:scaune) {
			System.out.println(a);	
		}
		
		Scaun prima_linie = scaune.get(0);
		
		System.out.println("=========");
		for(Scaun a : scaune) {
		    if (a != prima_linie) {
		        a.getAnFabricatePeste2000sauInainte(prima_linie);
		        break;
		    }
		}
		
		
		

	}

}
