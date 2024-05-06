public class operadoresRelacionais {
    public static void main(String[] args) {
        /*
         == Quando desejamos verificar se uma variável é IGUAL A outra.
         != Quando desejamos verificar se uma variável é DIFERENTE da outra.
         > Quando desejamos verificar se uma variável é MAIOR QUE a outra.
         >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
         < Quando desejamos verificar se uma variável é MENOR QUE outra.
         <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.
         */
        String meuNome = "Luiz"; 
        String nome1 = "Luiz"; 
        String nome = "Matheus";
        String outroNome = new String("Matheus"); // é outro endereço de objeto

        System.out.println(meuNome == nome1);
        //System.out.println(nome == outroNome); Para resolver utiliza-se método .equal
        System.out.println(nome.equals(outroNome)); // True

        int num1 = 2;
        int num2 = 4;

        boolean simNao = num1 == num2;
        System.out.println("Número 1 é igual a número 2? " + simNao);
        simNao = num1 != num2;
        System.out.println("Número 1 é diferente de número 2? " + simNao);
        simNao = num1 > num2;
        System.out.println("Número 1 é maior que número 2? " + simNao);


    }
}
