package Exercitiul4;

public class Camera {

	private String id;
	private double latime;
	private double inaltime;
	private double lungime;
	private Culoare culoare;
	
	
	
	
	public Camera(String id, double latime, double inaltime, double lungime, Culoare culoare) {
		super();
		this.id = id;
		this.latime = latime;
		this.inaltime = inaltime;
		this.lungime = lungime;
		this.culoare = culoare;
	}

	public void afisare() {
//		System.out.println("Latimea camerei este: " + latime);
//		System.out.println("Inaltimea camerei este " + inaltime );
//		System.out.println("Lungimea camerei este: " + lungime);
		System.out.println("Suprafata camerei este:" + suprafataCamerei());
		System.out.println("Volumul camerei este: " + volumulCamerei());
	}
	
	public double suprafataCamerei() {
		return latime * lungime;
	}
	public double volumulCamerei() {
		return latime*lungime*inaltime;
	}

	

	

	@Override
	public String toString() {
		return "Camera [id=" + id + ", latime=" + latime + ", inaltime=" + inaltime + ", lungime=" + lungime
				+ ", culoare=" + culoare + "]";
	}

	public double getInaltime() {
		return inaltime;
	}

	public void setInaltime(double inaltime) {
		this.inaltime = inaltime;
	}
	
	public double getVolumulCamerei() {
		return volumulCamerei();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	
	
}

class Culoare{
	 
	private String IDCuloare;
	private String tipCuloare;
	
	
	
	public Culoare(String iDCuloare, String tipCuloare) {
		super();
		IDCuloare = iDCuloare;
		this.tipCuloare = tipCuloare;
	}



	@Override
	public String toString() {
		return "Culoare [IDCuloare=" + IDCuloare + ", tipCuloare=" + tipCuloare + "]";
	}



	public String getIDCuloare() {
		return IDCuloare;
	}



	public void setIDCuloare(String iDCuloare) {
		IDCuloare = iDCuloare;
	}



	public String getTipCuloare() {
		return tipCuloare;
	}



	public void setTipCuloare(String tipCuloare) {
		this.tipCuloare = tipCuloare;
	}
	
	
	
	
}
