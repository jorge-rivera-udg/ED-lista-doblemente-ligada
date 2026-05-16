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
public class Trabajo {

    protected String titulo;
    protected String anio;
    protected String autor;

    public Trabajo() {
    }

    public Trabajo(String titulo, String anio, String autor) {
        this.titulo = titulo;
        this.anio = anio;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.titulo);
        hash = 97 * hash + Objects.hashCode(this.anio);
        hash = 97 * hash + Objects.hashCode(this.autor);
        return hash;
    }
    
    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        System.out.println("comparando valores independientes");
        if (this == obj) {
            return true;
        }
        System.out.println("elem null");
        if (obj == null) {
            return false;
        }
        final Trabajo other = (Trabajo) obj;
        System.out.println("titulo");
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        System.out.println("año");
        if (!Objects.equals(this.anio, other.anio)) {
            return false;
        }
        System.out.println("autor");
        return Objects.equals(this.autor, other.autor);
    }
}
