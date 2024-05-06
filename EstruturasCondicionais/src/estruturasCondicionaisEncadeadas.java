public class estruturasCondicionaisEncadeadas {
    public static void main(String[] args) {
        //Estruturas condicionais encadeadas
        int nota1 = 6;
        System.out.println("2º CASO");
        if (nota1 < 5) {
            System.out.println("REPROVADO!");
        }
        else if (nota1 >= 5 && nota1 <=7){
            System.out.println("RECUPERAÇÃO!");
        }
        else {
            System.out.println("APROVADO!");
        }
    }
}