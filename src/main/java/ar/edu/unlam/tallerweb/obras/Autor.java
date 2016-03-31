package ar.edu.unlam.tallerweb.obras;

public class Autor {

	private String nombreAutor;
	
	public Autor(String nombre){
		this.nombreAutor=nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((nombreAutor == null) ? 0 : nombreAutor.hashCode());
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
		Autor other = (Autor) obj;
		if (nombreAutor == null) {
			if (other.nombreAutor != null)
				return false;
		} else if (!nombreAutor.equals(other.nombreAutor))
			return false;
		return true;
	}
}
