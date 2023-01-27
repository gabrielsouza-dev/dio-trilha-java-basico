public class Comentarios {
    public static void main(String[] args) {
        // Comentário de uma linha

        /* Exemplo
        * de
        * comentário
        * com várias linhas
        */

    }

    /** 
    * Comentário onde os
    * asteriscos representam 
    * destinação de documentação
    * sobre o método
    **/
    public void metodo() {
        
    }

    //Exemplo do que não fazer:

    /*
    * Este método foi elaborado as pressas
    * por isso eu abrevei o nome das variáveis
    * mas olha, ele tem a finalidade de somar ou multiplicar
    * dois números
    */
    public int somaMultiplica (int n, int x, String m){
        int r = 0; // r é igual ao resultado
        if (m == "M"){ // M= multiplicação
        r= n * x;
    }else{
        // se não soma mesmo
        r = n + x;
    }
    return r;
    }
}    
