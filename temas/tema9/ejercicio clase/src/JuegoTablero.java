public interface JuegoTablero {
    //metodos
    int filas();

    char columnas();

    /**
     * @param indice Pasara un indice numerico a su letra correspondiente del tablero
     * @return una letra
     */
    char indiceAPosicion(int indice){
        String letras = "ABCDEFGH";
        return letras.charAt(indice);
    }

    /**
     * @param indice pasará un índice numérico a su posición numérica del tablero
     * @return un numero
     */
    int indiceAPosicionN(int indice){

    }

    /**
     * @param posicion pasará una letra que indica una posición en el tablero a su correspondiente índice
     * @return un numero
     */
    int posicionAIndice(char posicion){

    }

    /**
     * @param posicion pasará una posición númerica en el tablero a su correspondiente índice
     * @return un numero
     */
    int posicionAIndice(int posicion){

    }

}
