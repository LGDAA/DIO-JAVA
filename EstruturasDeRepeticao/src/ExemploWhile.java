// ExemploWhile.java
import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
public static void main(String[] args) {
    int qtdDoces = 0;
	int mesada = 50;
    System.out.println("Mesada: " + mesada+"R$");
        while(mesada>0) {
            int valorDoce = valorAleatorio();
            if(valorDoce > mesada){
                valorDoce = mesada;
            }
            System.out.println("Doce de valor " + valorDoce+ "R$" + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
            qtdDoces ++;
        }
        System.out.println("Mesada: " + mesada +"R$");
        System.out.println("Joãozinho gastou toda a sua mesada em doces.");
        System.out.println("A quantidade de doces comprados foi de: " + qtdDoces);
        /*
        * Não se preocupe quanto a formatação de valores
        * Iremos explorar os recursos de formatação em breve !!
        */
   }
   private static int valorAleatorio() { //criando classe para gerar valor aleatório entre 2 e 8
	return ThreadLocalRandom.current().nextInt(2, 8);
   }
}
