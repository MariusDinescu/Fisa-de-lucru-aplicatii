package Exercitiul3;

public class Produs {

	private String id;
	private String tip;
	private String nume;
	private String descriere;
	private String producator;

	

	public Produs(String id, String tip, String nume, String descriere, String producator) {
		super();
		this.id = id;
		this.tip = tip;
		this.nume = nume;
		this.descriere = descriere;
		this.producator = producator;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getDescriere() {
		return descriere;
	}

	public void setDescriere(String descriere) {
		this.descriere = descriere;
	}

	public String getProducator() {
		return producator;
	}

	public void setProducator(String producator) {
		this.producator = producator;
	}

	@Override
	public String toString() {
		return "Produs [id=" + id + ", tip=" + tip + ", nume=" + nume + ", descriere=" + descriere + ", producator="
				+ producator + "]";
	}

	

}
