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
public class Articulo extends Trabajo {

    protected String revista;

    public Articulo(String titulo, String autor, String anio, String revista) {
        super(titulo, anio, autor);
        this.revista = revista;
    }

    public Articulo(String titulo, String anio, String autor) {
        super(titulo, anio, autor);
    }

    public Articulo() {
    }

    public String getRevista() {
        return revista;
    }

    public void setRevista(String revista) {
        this.revista = revista;
    }

    @Override
    public String toString() {
        return """
               Articulo{
               Titulo: """ + titulo
                + ",\nAutor: " + autor
                + ",\nRevista: " + revista
                + ",\nAño publicación: " + anio
                + "\n}";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.revista);
        hash = 11 * hash + Objects.hashCode(this.titulo);
        hash = 11 * hash + Objects.hashCode(this.autor);
        hash = 11 * hash + Objects.hashCode(this.anio);
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
        final Articulo other = (Articulo) obj;
        if (!Objects.equals(this.revista, other.revista)) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return Objects.equals(this.anio, other.anio);
    }

}
