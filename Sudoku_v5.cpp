#include<stdlib.h>
#include<iostream>
#include <time.h>

using namespace std;

//inicializamos la matriz e ceros
int llenado_martiz(int _sudoku[][9]){
	for(int filas=0;filas<9;filas++){
		for(int columnas=0;columnas<9;columnas++){					
			_sudoku[filas][columnas]=0; 
		}	
	}	
}

//Función generador de números aleatorios
int numero_aleatorio(){	
	//Numeros aleatorios comprendidosentr 1-9	
	int variable=1+rand()%9;    
    return variable;
}


bool validando_bloque(int _sudoku[][9],int valor, int fila, int columna) {
        //Variables para dererminar el rango
        int minimo_fila;
        int maximo_fila;
        int minimo_columna;
        int maximo_columna;
        bool resultado = false;
        //determinamos las filas del bloque
        if (fila >= 0 && fila < 3) {
            minimo_fila = 0;
            maximo_fila = 2;
        } else if (fila >= 3 && fila < 6) {
            minimo_fila = 3;
            maximo_fila = 5;
        } else {
            minimo_fila = 6;
            maximo_fila = 8;
        }
        //Deterinamos las columnas del bloque
        if (columna >= 0 && columna < 3) {
            minimo_columna = 0;
            maximo_columna = 2;
        } else if (columna >= 3 && columna < 6) {
            minimo_columna = 3;
            maximo_columna = 5;
        } else {
            minimo_columna = 6;
            maximo_columna = 8;
        }
        //Recorremos la matriz en busqueda de un numero igual al ingresado.
        for (int f = minimo_fila; f <= maximo_fila; f++) {
            for (int c = minimo_columna; c <= maximo_columna; c++) {
                if (valor == 0) {
                	
                } else {
                    if (_sudoku[f][c] == valor) {
                        resultado = true;
                        break;
                    }					
                }
            }
        }
        //retornamos el resultado.
        return resultado;    
    }


bool validando_fila(int _sudoku[][9],int _numero, int _fila) {
        bool resultado = false;
       /*Se realiza el recorrido a lo largo del arreglo (9 filas)
       *para comprobar si el numero se repite
       */ 
        for (int i = 0; i < 9; i++) {            
            /*Si el numero en la posicion matriz[fila][i] exise
            entonces el resultado boleano será 'true'*/
            if (_sudoku[_fila][i] == _numero) {
                resultado = true;
                break;
            }           
        }
        return resultado;
	}

bool validando_columna(int _sudoku[][9],int _numero, int _columna) {

       bool resultado = false;
       /*
       *Se realiza el recorrido a lo largo del arreglo (9 columnas)
       *para comprobar si el numero se repite
       */ 
        for (int i = 0; i < 9; i++) {
            /*Si el numero en la posicion matriz[i][columna] exise
              entonces el resultado boleano será 'true'*/
            if (_sudoku[i][_columna] == _numero) {
                resultado = true;
                break;
            }            
        }
        return resultado;
    }
    
bool recorrido(int _sudoku[][9]){
    for(int filas=0;filas<9;filas++){
		for(int columnas=0;columnas<9;columnas++){
			if(_sudoku[filas][columnas]==0){
				return true;
			}		
		}
	}    	
}

int main(){
	/*
	*Num. especial= sirve para validar numero y comprobar que sea unico en cada fila y columna
	*/
	int filas,columnas,NumeroEspecial, contador;
	int sudoku[9][9];
	srand(time(NULL));	//Nuero aleatorio	
	
	//llenado matriz con ceros
	llenado_martiz(sudoku);	
	NumeroEspecial=numero_aleatorio();
	//Llenado de la matriz con numeros diferentes
	for(filas=0;filas<9;filas++){
		for(columnas=0;columnas<9;columnas++){					
			do{
				NumeroEspecial=numero_aleatorio();
				if (validando_fila(sudoku,NumeroEspecial,filas)== true) {
	            	contador++;	            
		        } else {
		            //Evaluamos si el numero se repite en la columna
		            if (validando_columna(sudoku,NumeroEspecial,columnas)== true) {
		                contador++;
		            } else {
		                //Evaluamos si el numero se repite en el bloque correspondiente de 3X3
		                if (validando_bloque(sudoku,NumeroEspecial,filas,columnas)==true) {
		                    contador++;
		                } else {
		                    /*
		                    *En caso de que no este repetido en ningun caso añadimo
		                    *el numero en la casilla 
		                    */
		                    sudoku[filas][columnas] = NumeroEspecial;
		                    contador=0;
		                }
		            }
		        }
								
		    }while((contador>0 && contador<4) && (sudoku[filas][columnas]==0));	
		}   
	}									
			
	//Generamos la salida por pantalla del arreglo
    cout<<"\n\n\n\t***------------------------------*** SUDOKU ***------------------------------***\n\n\n"<<endl;;
    //Generamos la salida por pantalla del arreglo
    for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
        	cout<<"\t"<<sudoku[i][j];        	
        	if(((j+1)%3)==0){
        		cout<<"\t"; 
			}
        }           
        cout<<"\n\n";  
		if(((i+1)%3)==0){
        	cout<<"\n\n"; 
		}  
    }
    cout<<"\n\n\n";

	system("PAUSE");
	return 0;  
}
