package ejemplos;

public class metodo {
    public int repetidos(int[] arrayOriginal) {
        int[] numerosContados = new int[arrayOriginal.length];
        int [] arrayConRepeticiones=new int [arrayOriginal.length];
        int numeroDeRepeticiones , //numero de veces que se repite un numero
                indiceComparativo,//es el numero que nos sirve para ir comparando con i en el array y revisar si ya se conto
                indiceContado = 0, // es el indice que ya se conto en el array
                numeroDeNumConRepeticiones=0; //numero de coincidencias
        boolean contado;

        for (int i = 0; i < arrayOriginal.length; i++) { //for 1

            //revisamos si el valor de la casilla ya fue contado
            numeroDeRepeticiones = 1;
            contado = false;
            indiceComparativo = 0;
            while ((!contado) && (indiceComparativo < indiceContado)) { //mientras contado es falso y k e menor que top
                if (arrayOriginal[i] == numerosContados [indiceComparativo]) { // si son iguales
                    contado = true;
                }
                indiceComparativo++; //k aumenta en cada paso
            }

            //si no ha sido contado revisamos si tiene parecido con algun otro
            if (!contado) { //si contado es falso
                numerosContados[indiceContado] = arrayOriginal[i];
                indiceContado++;
                for (int j = 0; j < arrayOriginal.length; j++) {
                    if (j != i) {
                        if (arrayOriginal[i] == arrayOriginal[j]) {
                            numeroDeRepeticiones++;
                        }
                    }
                }
               // System.out.println(a[i] + " Se repite " + numeroDeRepeticiones);
            }
            arrayConRepeticiones[i]=numeroDeRepeticiones;
        } //fin for 1

        for(int i=0; i<arrayConRepeticiones.length;i++){
        if(arrayConRepeticiones[i]>1){
            numeroDeNumConRepeticiones++;
        }
        }

        return numeroDeNumConRepeticiones;
    }
}



