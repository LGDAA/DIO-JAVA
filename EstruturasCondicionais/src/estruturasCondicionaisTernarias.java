public class estruturasCondicionaisTernarias {
    public static void main(String[] args) {
        System.out.println("1º CASO - Condição ternária");
        int nota2 = 6;
        String resultado = nota2 >= 7 ? "APROVADO!": "REPROVADO!"; 
        System.out.println(resultado);

        System.out.println("2º CASO - Condição ternária");
        int nota3 = 7;
        String resultado2 = nota3 >= 7 ? "APROVADO!": nota3 >= 5 && nota3 <7 ? "RECUPERAÇÃO!": "REPROVADO!";
        System.out.println(resultado2);
    }
}
