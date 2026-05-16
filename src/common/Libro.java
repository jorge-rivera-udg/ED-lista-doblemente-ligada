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
public class Libro extends Trabajo {

    public Libro() {
    }

    public Libro(String autor, String titulo, String anio) {
        super(titulo, anio, autor);
    }

    @Override
    public String toString() {
        return """
               Libro {
               Autor :""" + autor
                + ",\nTitulo: " + titulo
                + ",\nAño: " + anio
                + "\n}";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.autor);
        hash = 37 * hash + Objects.hashCode(this.titulo);
        hash = 37 * hash + Objects.hashCode(this.anio);
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
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.anio, other.anio)) {
            return false;
        }
        if (!Objects.equals(this.autor, other.autor)) {
            return false;
        }
        return Objects.equals(this.titulo, other.titulo);
    }
}
