public class operadoresConcatenando {
    public static void main(String[] args) throws Exception {
        //Operador de adição faz a concatenação entre strings
        String palavra_completa = "LINGUAGEM" + " " + "JAVA";
        //Também funciona com variáveis
        String palavra1 = "LINGUAGEM";
        String palavra2 = "PYTHON";
        System.out.println(palavra_completa);
        System.out.println(palavra1 + " " + palavra2);

        // Vendo melhor a concatenação
        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1"; // 3 + STR(1)
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1; 
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1"; 
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1; // STR(1) + 111
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1); // STR(1) + 3
        System.out.println(concatenacao);
    }
}
