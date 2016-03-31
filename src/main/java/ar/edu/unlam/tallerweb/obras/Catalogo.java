package ar.edu.unlam.tallerweb.obras;

import java.util.TreeSet;

public class Catalogo {

    private TreeSet<ObraDeArte> listaObrasDeArte = new TreeSet<ObraDeArte>();

    public void agregarObra(ObraDeArte nuevaObraDeArte) throws Exception {
        if (this.listaObrasDeArte.add(nuevaObraDeArte) == false) {
            throw new Exception("No se puede agregar el objeto");
        }
    }

    public int ontenerCantidadObras() {
        return this.listaObrasDeArte.size();
    }

    public boolean existeObra(ObraDeArte obraDeArteBuscada) {
        return this.listaObrasDeArte.contains(obraDeArteBuscada);
    }

    public TreeSet<ObraDeArte> getObras() {
        return this.listaObrasDeArte;
    }
}
