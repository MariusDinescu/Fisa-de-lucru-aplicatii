package Exercitiul6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Tastatura {

	private static final int Butoane = 0;
	private String IDFabrica;
	private double pret;
	private List<Butoane> ListaButoane;
	private int anFabricatie;





	public Tastatura(String iDFabrica, double pret, List<Butoane> listaButoane, int anFabricatie) {
		super();
		IDFabrica = iDFabrica;
		this.pret = pret;
		ListaButoane = listaButoane;
		this.anFabricatie = anFabricatie;
	}



	@Override
	public String toString() {
		return "Tastatura [IDFabrica=" + IDFabrica + ", pret=" + pret + ", ListaButoane=" + ListaButoane
				+ ", anFabricatie=" + anFabricatie + "]";
	}



	public String getIDFabrica() {
		return IDFabrica;
	}

	public void setIDFabrica(String iDFabrica) {
		IDFabrica = iDFabrica;
	}

	public double getPret() {
		return pret;
	}

	public void setPret(double pret) {
		this.pret = pret;
	}


	
	public int getAnFabricatie() {
		return anFabricatie;
	}

	public void setAnFabricatie(int anFabricatie) {
		this.anFabricatie = anFabricatie;
	}

	public void IntervalAnFabricatie(int a, int b) {
		if (getAnFabricatie() >= a && getAnFabricatie() <= b) {
			System.out.println("Tastatura "+ this.IDFabrica + " se afla in intervalul dat." + "(" + a + "," + b + ")");

		} else {
			System.out.println("Tastatura " + this.IDFabrica + " nu se afla in intervalul dat." + "(" + a + "," + b + ")");
		}
	}
	
	public void getNumarButoane(Tastatura obj) {
		System.out.println("Numarul de butoane pentru tastatura " + obj.IDFabrica + " este :"  + obj.ListaButoane);
		
	}
	
	public void getComparare(Tastatura other) {

		if((this.pret == other.pret) && (this.anFabricatie == other.anFabricatie) && (this.ListaButoane == other.ListaButoane)){
			System.out.println("Tastaturile sunt la fel!");
		}else {
			System.out.println("Tastaturile nu sunt la fel!");
		}
}
	
	public String afiseazaCaracteristiciButoane() {
        String caracteristici = "";
        for (Butoane buton : this.ListaButoane) {
            caracteristici += "Pozitie: " + buton.getPozitie() + "\n";
            caracteristici += "Denumire: " + buton.getDenumire() + "\n\n";
        }
        return caracteristici;
    }
	
	public static boolean isListaButoaneValida(List<Butoane> listaButoane) {
	    if (listaButoane == null || listaButoane.isEmpty()) {
	        return false;
	    }
	     
	    // Verifica daca toate butoanele au pozitii valide
	    for (Butoane buton : listaButoane) {
	        if (buton.getPozitie() < 1 || buton.getPozitie() > 50) {
	            return false;
	        }
	    }
	     
	    // Verifica daca lista este unica
	    Set<Butoane> setButoane = new HashSet<>(listaButoane);
	    return setButoane.size() == listaButoane.size();
	}
	
	
	
	
}

class Butoane {

	private int pozitie;
	private String denumire;
	
	
	
	public Butoane(int pozitie, String denumire) {
		super();
		this.pozitie = pozitie;
		this.denumire = denumire;
	}



	@Override
	public String toString() {
		return "Butoane [pozitie=" + pozitie + ", denumire=" + denumire + "]";
	}



	public int getPozitie() {
		return pozitie;
	}



	public String getDenumire() {
		return denumire;
	}



	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}
	
	public void setPozitie(int pozitie) {
        if (pozitie >= 1 && pozitie <= 50) {
            this.pozitie = pozitie;
        } else {
            throw new IllegalArgumentException("Numărul trebuie să fie între 1 și 50.");
        }
    }
	
	public void getEsteUnic(List<Butoane> butoane) {
		
		
		
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(denumire, pozitie);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Butoane other = (Butoane) obj;
		return Objects.equals(denumire, other.denumire) && pozitie == other.pozitie;
	}



	public static List<Butoane> stergeDuplicateSiInvalide(List<Butoane> listaButoane) {
	    Set<Butoane> setButoane = new HashSet<>();
	     
	    
	    // Elimina butoanele cu pozitii invalide
	    for (Butoane buton : listaButoane) {
	        if (buton.getPozitie() >= 1 && buton.getPozitie() <= 50) {
//	            setButoane.add(buton);
	        	if (!setButoane.equals(buton)) {
	        		setButoane.add(buton);
	        	}
	        	
	        	
	        }
	        
	    }

	     
	    return new ArrayList<>(setButoane);
	}
}

	
	
	

