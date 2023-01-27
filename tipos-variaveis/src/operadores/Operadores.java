package operadores;
public class Operadores {
  public static void main(String[] args) {
    // Operadores.java
  boolean condicao1=true;

  boolean condicao2=true;

  /* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
  expressões. 
  É como se estivesse escrito:
  "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
  */

  if(condicao1 && condicao2)
	System.out.print("Os dois valores precisam ser verdadeiros");

  //Se condicao1 OU condicao2 for verdadeira, executar código.
  if(condicao1 || condicao2)
	System.out.print("Um dos valores precisa ser verdadeiro");
  }
}
