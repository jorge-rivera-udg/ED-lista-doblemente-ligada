/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;

/**
 *
 * @author jra
 */
public class DLLNodoGenerico<T> {
    T dato;
    DLLNodoGenerico anterior;
    DLLNodoGenerico siguiente;

    public DLLNodoGenerico(T dato) {
        this.dato = dato;
        this.anterior = null;
        this.siguiente = null;
    }
}