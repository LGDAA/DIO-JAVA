public class estruturasCondicionaisCompostas {
    public static void main(String[] args) {

        // Estruturas condicionais compostas
        int nota = 6;

        System.out.println("1º CASO");
        if (nota >= 7){
            System.out.println("APROVADO!");
        }
        else {
            System.out.println("REPROVADO!");
        }
        //Condicional ternária 2º Caso
        System.out.println("2º CASO - Condição ternária");
        int nota3 = 7;
        String resultado2 = nota3 >= 7 ? "APROVADO!": nota3 >= 5 && nota3 <7 ? "RECUPERAÇÃO!": "REPROVADO!";
        System.out.println(resultado2);
    }   
}
