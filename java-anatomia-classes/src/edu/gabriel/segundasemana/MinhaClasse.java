package edu.gabriel.segundasemana;

public class MinhaClasse {

public static void main(String[] args) {

    String primeroNome = "Gabriel";
    String segundoNome = "Souza";

    String nomeCompleto = nomeCompleto (primeroNome,segundoNome);

    System.out.println(nomeCompleto);

}
    
public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
}

}
