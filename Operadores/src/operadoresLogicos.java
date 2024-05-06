public class operadoresLogicos {
    public static void main(String[] args) {
        /*
        && Operador Lógico "E"
        || Operador Lógico "OU"
        */

        boolean condicao1 = false;
        boolean condicao2 = false;

        if (condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras.");
        }
        else if (condicao1 || condicao2){
            System.out.println("Uma das duas condições é verdadeira.");
        }
        System.out.println("Nenhuma das condições é verdadeira");
        System.out.println("Fim.");
    }
}
