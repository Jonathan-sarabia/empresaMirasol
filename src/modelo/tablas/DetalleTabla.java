/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.tablas;

import javax.swing.table.AbstractTableModel;
import modelo.Agencia;

/**
 *
 * @author jona
 */
public class DetalleTabla extends AbstractTableModel {

    private Double[][] dato;

    public Double[][] getDato() {
        return dato;
    }

    public void setDato(Double[][] dato) {
        this.dato = dato;
    }
    

    @Override
    public int getRowCount() {
        return 2;
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
            return dato[rowIndex][columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Agencia 1";
            case 1:
                return "Agencia 2";
            case 2:
                return "Agencia 3";
            case 3:
                return "Agencia 4";
            case 4:
                return "Agencia 5";
            default:
                return null;
        }
    }

}
