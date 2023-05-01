package Exercitiul1;

public class Carte {

	private String titlu;
	private String autor;
	private int numar_de_pagini;
	
	
	public Carte(String titlu, String autor, int numar_de_pagini) {
		super();
		this.titlu = titlu;
		this.autor = autor;
		this.numar_de_pagini = numar_de_pagini;
	}


	@Override
	public String toString() {
		return "Carte [titlu=" + titlu + ", autor=" + autor + ", numar_de_pagini=" + numar_de_pagini + "]";
	}
	
	public boolean comparare(Carte obj) {
		
		if(titlu.equalsIgnoreCase(obj.titlu)  && autor.equalsIgnoreCase(obj.autor) && numar_de_pagini == numar_de_pagini  ) {
			return true;
		}
		return false;
	}
	
	
}
