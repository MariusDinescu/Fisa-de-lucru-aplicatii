import java.util.List;

public class Scaun {

	private String IDFabrica;
	private double pret;
	private int nrPicioare;
	private int anFabricatie;
	
	public Scaun(String iDFabrica, double pret, int nrPicioare, int anFabricatie) {
		/* super(); */
		IDFabrica = iDFabrica;
		this.pret = pret;
		this.nrPicioare = nrPicioare;
		this.anFabricatie = anFabricatie;
	}

	@Override
	public String toString() {
		return "Scaun [IDFabrica=" + IDFabrica + ", pret=" + pret + ", nrPicioare=" + nrPicioare + ", anFabricatie="
				+ anFabricatie + "]";
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

	public int getNrPicioare() {
		return nrPicioare;
	}

	public void setNrPicioare(int nrPicioare) {
		this.nrPicioare = nrPicioare;
	}

	public int getAnFabricatie() {
		return anFabricatie;
	}

	public void setAnFabricatie(int anFabricatie) {
		this.anFabricatie = anFabricatie;
	}
	
	public void getAnFabricatePeste2000sauInainte(Scaun obj) {
		if(obj.getAnFabricatie() > 2000) {
			System.out.println("Anul de fabricatie al scaunului " + obj.getIDFabrica() + " este mai mare de 2000");
		}else{
			System.out.println("Anul de fabricatie al scaunului " + obj.getIDFabrica() + " este mai mic de 2000");
		}
		
	}
	
	public void getFaceParteDinLista(List<Scaun> scaune, Scaun obj) {
		if(scaune.contains(obj))  {
			System.out.println("Scaunul face parte din lista de scaune!");
			
		}else {
			System.out.println("Scaunul nu face parte din lista de scaune!");
		}
	}
	
	
	
	
}
