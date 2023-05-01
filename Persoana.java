package Exercitiul2;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Persoana {

	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getCnp() {
		return cnp;
	}
	public void setCnp(String cnp) {
		this.cnp = cnp;
	}


	private String nume;
	private String cnp;
	public Persoana(String nume, String cnp) {
		super();
		this.nume = nume;
		this.cnp = cnp;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cnp);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persoana other = (Persoana) obj;
		return Objects.equals(cnp, other.cnp) && Objects.equals(nume, other.nume);
	}
	
	
	public static Set<Persoana> intersectie(Set<Persoana> s1 , Set<Persoana> s2){
	
		Set<Persoana> intersectie = new HashSet<>();
		
		for(Persoana p:s1) {
			if(s2.contains(p)) {
				intersectie.add(p);
			}
		}
		return intersectie;
		
	}
	
	
	
	
	
}
