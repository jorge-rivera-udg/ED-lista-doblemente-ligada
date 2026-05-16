/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

import common.NodoGenerico;

/**
 *
 * @author jra
 */
public class DLLGenerico<T>  {
    private NodoGenerico cabeza;
    private int contador=0;

    public void insertarAlPrincipio(T dato) {
        NodoGenerico nuevoNodo= new NodoGenerico<>(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cabeza.abajo = cabeza.arriba = nuevoNodo;
            contador++;
        } else {
            insertarAntes(cabeza,nuevoNodo);
            cabeza = nuevoNodo;
        }
    }

    public void insertarAlFinal(T dato) {
        NodoGenerico nuevoNodo = new NodoGenerico(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cabeza.abajo = cabeza.arriba = nuevoNodo;
            contador++;
        } else {
            insertarDespues(cabeza.arriba,nuevoNodo);
        }
    }
    
    public void insertarDespues(NodoGenerico curr, NodoGenerico nuevo) {
        nuevo.abajo = curr.abajo;
        nuevo.arriba = curr;
        curr.abajo.arriba = nuevo;
        curr.abajo = nuevo;
        contador++;
    }

    public void insertarAntes(NodoGenerico curr, NodoGenerico nuevo) {
        nuevo.arriba = curr.arriba;
        nuevo.abajo = curr;
        curr.arriba.abajo = nuevo;
        curr.arriba = nuevo;
        contador++;
    }
    
    public void eliminarInicio(){
        if(cabeza==null) return;
        
        if(cabeza.abajo == cabeza){
            cabeza = null;
        } else {
            cabeza.arriba.abajo = cabeza.abajo;
            cabeza.abajo.arriba = cabeza.arriba;
            cabeza = cabeza.abajo;
        }
        contador --;
    }
    
    public void eliminarFinal() {
        if(cabeza==null)return;
        
        if(cabeza.arriba == cabeza){
            cabeza = null;
        } else {
            cabeza.arriba.arriba.abajo = cabeza;
            cabeza.arriba = cabeza.arriba.arriba;
        }
        contador --;
    }
    
    public void vaciarLista() {
        cabeza = null;
        contador = 0;
    }

    public void eliminar(NodoGenerico nodo) {
        if (nodo == null || cabeza == null) {
            contador = 0;
            return;
        }

        if (nodo.abajo == nodo) { // Un solo nodo en la lista
            cabeza = null;
        } else {
            nodo.arriba.abajo = nodo.abajo;
            nodo.abajo.arriba = nodo.arriba;
            if (nodo == cabeza) {
                cabeza = nodo.abajo;
            }
        }
        contador--;
    }
    
    public boolean estaVacía() {
        return contador<=0;
    }

    public NodoGenerico buscar(T dato) {
        NodoGenerico actual = cabeza;
        do {
            if (actual.elem.equals(dato)) {
                return actual;
            }
            actual = actual.abajo;
        } while (actual != cabeza);
        return null;
    }

    public String recorrerHaciaAdelante() {
        NodoGenerico actual = cabeza;
        int i = 1;
        String elementos = "";//actual.elem + "\n";
        do {
            System.out.println("imprimiendo elemento: "+i);
            elementos += actual.elem + "\n";
            actual = actual.abajo;
            System.out.println(actual.elem);
            i++;
        }while (actual != cabeza);
        return elementos;
    }

    public String recorrerHaciaAtras() {
        int i = 1;
        NodoGenerico actual = cabeza.arriba;
        String elementos = "";//actual.elem + "\n";
        do {
            System.out.println("imprimiendo elemento: "+i);
            elementos += actual.elem + "\n";
            System.out.println(actual.elem);
            actual = actual.arriba;
            i++;
        }while (actual != cabeza.arriba);
        return elementos;
    }
    
    public String mostrar(NodoGenerico nodo) {
        return nodo!=null?nodo.elem.toString():"";
    }
    
    public int tamano() {
        return contador;
    }
    
    public String mostrarPrimero() {
        return cabeza!=null?cabeza.elem.toString():"";
    }
    
    public String nostrarUltimo() {
        return cabeza!= null?cabeza.arriba.elem.toString():"";
    }

    public void invertir() {
        NodoGenerico actual = cabeza;
        do {
            NodoGenerico temp = actual.arriba;
            actual.arriba = actual.abajo;
            actual.abajo = temp;
            actual = actual.arriba;
        } while (actual != cabeza);
        cabeza = cabeza.arriba;
    }
}
