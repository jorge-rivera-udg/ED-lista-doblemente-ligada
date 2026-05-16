/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

import java.util.Objects;

/**
 *
 * @author jra
 */
public class Revista extends Trabajo {

    private String editorial;
    private String edicion;

    public Revista() {
    }

    public Revista(String titulo, String editorial, String edicion, String autor, String anio) {
        super(titulo, anio, autor);
        this.editorial = editorial;
        this.edicion = edicion;
    }

    public Revista(String titulo, String anio, String autor) {
        super(titulo, anio, autor);
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    @Override
    public String toString() {
        return """
               Revista{
               titulo: """ + titulo
                + ", \nautor: " + autor
                + ", \neditorial: " + editorial
                + ", \nedicion: " + edicion
                + ", \naño publicacion: " + anio
                + "\n}";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.editorial);
        hash = 67 * hash + Objects.hashCode(this.edicion);
        hash = 67 * hash + Objects.hashCode(this.titulo);
        hash = 67 * hash + Objects.hashCode(this.autor);
        hash = 67 * hash + Objects.hashCode(this.anio);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Revista other = (Revista) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.editorial, other.editorial)) {
            return false;
        }
        return Objects.equals(this.edicion, other.edicion);
    }

}
