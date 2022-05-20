/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Agencia;

/**
 *
 * @author jona
 */
public class EmpresaController {

    private Agencia ventas[][] = new Agencia[5][12];

    public Agencia[][] getVentas() {
        return ventas;
    }

    public void setVentas(Agencia[][] ventas) {
        this.ventas = ventas;
    }

    public EmpresaController() {

    }

    public void ingresar(int mes, int agen, Double dato) {
        Agencia aux = new Agencia();
        aux.setDato(dato);
        this.ventas[mes][agen] = aux;
    }

    public void total(int agencia) {

    }

    public void imprimir() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.print(ventas[i][j]);
            }
            System.out.println("");
        }
    }

//    public EmpresaController(Double[][] Venta) {
//        this.Venta = Venta;
//    }
    public Double[] calcular(Agencia nose[][]) {

        // Double n0 = 0.0, n1 = 0.0,n2=0.0, n3 = 0.0, n4 = 0.0;
        Double nani[] = {0.0, 0.0, 0.0, 0.0, 0.0};
        try {

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 12; j++) {
                    if (i == 0) {
                        if (nose[0][j] != null) {
                            nani[0] = nani[0] + Double.parseDouble(nose[0][j].toString());
                        }
                    }
                    if (i == 1) {
                        if (nose[1][j] != null) {
                            nani[1] = nani[1] + Double.parseDouble(nose[1][j].toString());
                        }
                    }
                    if (i == 2) {
                        if (nose[2][j] != null) {
                            nani[2] = nani[2] + Double.parseDouble(nose[2][j].toString());
                        }
                    }
                    if (i == 3) {
                        if (nose[3][j] != null) {
                            nani[3] = nani[3] + Double.parseDouble(nose[3][j].toString());
                        }
                    }
                    if (i == 4) {
                        if (nose[4][j] != null) {
                            nani[4] = nani[4] + Double.parseDouble(nose[4][j].toString());
                        }
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return nani;
    }

    public Double[] promedio(Agencia nose[][]) {

        // Double n0 = 0.0, n1 = 0.0,n2=0.0, n3 = 0.0, n4 = 0.0;
        Double nani[] = {0.0, 0.0, 0.0, 0.0, 0.0};
        Double promedio[] = {0.0, 0.0, 0.0, 0.0, 0.0};
        int cont[] = {0, 0, 0, 0, 0};
        try {

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 12; j++) {
                    if (i == 0) {
                        if (nose[0][j] != null) {
                            nani[0] = nani[0] + Double.parseDouble(nose[0][j].toString());
                            cont[0]++;
                            promedio[0] = nani[0] / cont[0];
                        }
                    }
                    if (i == 1) {
                        if (nose[1][j] != null) {
                            nani[1] = nani[1] + Double.parseDouble(nose[1][j].toString());
                            cont[1]++;
                            promedio[1] = nani[1] / cont[1];
                        }
                    }
                    if (i == 2) {
                        if (nose[2][j] != null) {
                            nani[2] = nani[2] + Double.parseDouble(nose[2][j].toString());
                            cont[2]++;
                            promedio[2] = nani[2] / cont[2];
                        }
                    }
                    if (i == 3) {
                        if (nose[3][j] != null) {
                            nani[3] = nani[3] + Double.parseDouble(nose[3][j].toString());
                            cont[3]++;
                            promedio[3] = nani[3] / cont[3];
                        }
                    }
                    if (i == 4) {
                        if (nose[4][j] != null) {
                            nani[4] = nani[4] + Double.parseDouble(nose[4][j].toString());
                            cont[4]++;
                            promedio[4] = nani[4] / cont[4];
                        }
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return promedio;
    }

    public void mayoragencia() {
    }

    public void vesmenorventasagencias(Agencia nose[][]) {
        Double nunmayo = 0.0;
        Double nunmeno = 0.0;
        Double mayorColumna[] = new Double[nose[0].length]; 
        for(int k = 0; k > nose[0].length; k++){
            mayorColumna[k] = Double.parseDouble(nose[0][k].toString());
        }

//        for (int i = 0; i < matriz1[0].length; i++) { //Cambio de columna
//            for (int j = 0; j < matriz.length; j++) { //Cambio de fila
//                if (matriz1[j][i] < menorColumna[i]) { //Encontrar el menor
//                    menorColumna[i] = matriz1[j][i];
//                }
//            }
//        }
        try {
            for (int x = 0; x < nose[0].length; x++) {
                for (int y = 0; y < 12; y++) {

                    if (Double.parseDouble(nose[x][y].toString()) > mayorColumna[x]) {
                       mayorColumna[x] =Double.parseDouble(nose[x][y].toString());
                        System.out.println("la agencia es" + x);
                    }

//                    if (y == 1) {
//                        if (Double.parseDouble(nose[x][1].toString()) > nunmayo) {
//                            nunmayo = Double.parseDouble(nose[x][1].toString());
//                            System.out.println("la agencia es" + x);
//                        }
//
//                    }
//                    if (y == 2) {
//                        if (Double.parseDouble(nose[x][2].toString()) > nunmayo) {
//                            nunmayo = Double.parseDouble(nose[x][2].toString());
//                            System.out.println("la agencia es" + x);
//                        }
//
//                    }
//                    if (y == 3) {
//                        if (Double.parseDouble(nose[x][3].toString()) > nunmayo) {
//                            nunmayo = Double.parseDouble(nose[x][3].toString());
//                            System.out.println("la agencia es" + x);
//                        }
//
//                    }
//                    if (y == 4) {
//                        if (Double.parseDouble(nose[x][4].toString()) > nunmayo) {
//                            nunmayo = Double.parseDouble(nose[x][4].toString());
//                            System.out.println("la agencia es" + x);
//                        }
//
//                    }

                }
            }
        } catch (Exception e) {
        }

    }

}
