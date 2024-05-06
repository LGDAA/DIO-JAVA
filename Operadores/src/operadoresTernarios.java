public class operadoresTernarios{
    public static void main(String[] args) {
        // Operadores ternários
        int a, b;

        a = 7;
        b = 6;

        /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
        resultado = "verdadeiro";
        else
        resultado = "falso";
        */

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNARIO
        String resultado = (a==b) ? "verdadeiro" : "false";

        System.out.println(resultado);
    }

}