package ar.edu.unlam.tallerweb.obras;

public class ObraDeArte implements Comparable<ObraDeArte> {
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((autorDeObraDeArte == null) ? 0 : autorDeObraDeArte
						.hashCode());
		result = prime
				* result
				+ ((nombreObraDeArte == null) ? 0 : nombreObraDeArte.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObraDeArte other = (ObraDeArte) obj;
		if (autorDeObraDeArte == null) {
			if (other.autorDeObraDeArte != null)
				return false;
		} else if (!autorDeObraDeArte.equals(other.autorDeObraDeArte))
			return false;
		if (nombreObraDeArte == null) {
			if (other.nombreObraDeArte != null)
				return false;
		} else if (!nombreObraDeArte.equals(other.nombreObraDeArte))
			return false;
		return true;
	}

	private String nombreObraDeArte;
	private Autor autorDeObraDeArte;
	
	public ObraDeArte(String nombreObra, Autor autorObra){
		this.nombreObraDeArte=nombreObra;
		this.autorDeObraDeArte=autorObra;
	}
	
	public String getNombre(){
		return this.nombreObraDeArte;
	}

	public int compareTo(ObraDeArte o) {
		return this.nombreObraDeArte.compareTo(o.nombreObraDeArte);
	}
	
}
