/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author jona
 */
public class Agencia {
    private Object dato;
    private Double []Promedios;
    private Double []total;

    public Object getDato() {
        return dato;
    }

    public Double[] getPromedios() {
        return Promedios;
    }

    public void setPromedios(Double[] Promedios) {
        this.Promedios = Promedios;
    }

    public Double[] getTotal() {
        return total;
    }

    public void setTotal(Double[] total) {
        this.total = total;
    }
    
    

    public void setDato(Object dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return dato.toString();
    }
    
}
