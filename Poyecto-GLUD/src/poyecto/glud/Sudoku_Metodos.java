/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poyecto.glud;

import javax.swing.JOptionPane;


public class Sudoku_Metodos {
    public int[][] matriz = new int[10][10];

    public int[][] cargar_juego() {
        
        matriz[1][3] = 1;
        matriz[1][4] = 7;
        matriz[2][2] = 2;
        matriz[2][4] = 6;
        matriz[2][8] = 7;
        matriz[2][9] = 4;
        matriz[3][4] = 2;
        matriz[3][6] = 9;
        matriz[3][7] = 6;
        matriz[3][9] = 1;
        matriz[4][1] = 5;
        matriz[4][3] = 9;
        matriz[4][4] = 8;
        matriz[4][5] = 7;
        matriz[5][2] = 8;
        matriz[5][8] = 5;
        matriz[5][9] = 9;
        matriz[6][6] = 2;
        matriz[6][7] = 4;
        matriz[7][1] = 6;
        matriz[7][4] = 9;
        matriz[7][6] = 8;
        matriz[7][7] = 5;
        matriz[7][9] = 7;
        matriz[8][1] = 3;
        matriz[8][2] = 7;
        matriz[8][6] = 5;
        matriz[8][8] = 2;
        matriz[9][2] = 9;
        matriz[9][5] = 2;
        matriz[9][6] = 7;
        matriz[9][7] = 1;
        return matriz;
    }
    
    
     // Metodo para comprobar valores.
    public boolean comprobar_valor(String valor1) {
        if (String.valueOf(valor1).equalsIgnoreCase("")) {
            return false;
        } else {
            //devuelve una conversion a valor entero
            int valor = Integer.valueOf(valor1);
            //evalua si el numero esta dentro del rango
            if (valor >= 0 && valor < 10) {
                return true;
            } else {
                //Si el numero se sale del rango la caja se formateará
                return false;
            }
        }
    }
    

    //Metodo para comprobar filas.
    public boolean existe_fila(int numero, int fila) {
        boolean resultado = false;
       /*Se realiza el recorrido a lo largo del arreglo (9 filas)
       *para comprobar si el numero se repite
       */ 
        for (int i = 1; i <= 9; i++) {
           /*Si el numero en la posicion matriz[fila][i] exise
            entonces el resultado boleano será 'true'*/
            if (matriz[fila][i] == numero) {
                resultado = true;
                break;
            }
        }
        return resultado;
    }

    //Metodo para comprobar columnas.
    public boolean existe_columna(int numero, int columna) {

       boolean resultado = false;
       /*
       *Se realiza el recorrido a lo largo del arreglo (9 columnas)
       *para comprobar si el numero se repite   matriz.length
       */ 
        for (int i = 1; i <= 9; i++) {
            /*Si el numero en la posicion matriz[i][columna] exise
              entonces el resultado boleano será 'true'*/
            if (matriz[i][columna] == numero) {
                resultado = true;
                break;
            }
        }
        return resultado;
    }

    //Metodo para evaluar los diferentes bloques de 3X3
    public boolean existe_caja(int valor, int fila, int columna) {
        //Variables para dererminar el rango
        int minimo_fila;
        int maximo_fila;
        int minimo_columna;
        int maximo_columna;
        boolean resultado = false;
         //Determinamos las filas del bloque
        if (fila >= 1 && fila < 4) {
            minimo_fila = 1;
            maximo_fila = 3;
        } else if (fila >= 4 && fila < 7) {
            minimo_fila = 4;
            maximo_fila = 6;
        } else {
            minimo_fila = 7;
            maximo_fila = 9;
        }

        //Deterinamos las columnas del bloque
        if (columna>=1 && columna <=3) {
            minimo_columna = 1;
            maximo_columna = 3;
        } else if (columna >= 4 && columna < 7) {
            minimo_columna = 4;
            maximo_columna = 6;
        } else {
            minimo_columna = 7;
            maximo_columna = 9;
        }
        //Recorremos la matriz en busqueda de un numero igual al ingresado.
        for (int f = minimo_fila; f <= maximo_fila; f++) {
            for (int c = minimo_columna; c <= maximo_columna; c++) {
                if (valor == 0) {
                } else {
                    if (matriz[f][c] == valor) {
                        resultado = true;
                        break;

                    }
                }
            }
        }
        //retornamos el resultado.
        return resultado;    
    }

    //Metodo para evaluar si el juego ha concluido. matriz[1].length
    public static boolean terminado( int[][] matriz ){
	boolean resultado = true;
	for ( int f = 1; f <= 9; f ++)
            for ( int c = 1; c <= 9 ; c ++)
		if ( matriz[f][c] == 0 )
                    resultado = false;
        
        if (resultado==true){
            JOptionPane.showMessageDialog(null, "El Juego ha concluido","¡Excelente!",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Usted no ha concluido el juego","¡ERROR!",JOptionPane.ERROR_MESSAGE);
        }        
        
        return resultado;
	}  
 
}
