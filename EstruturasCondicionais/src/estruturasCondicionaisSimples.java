public class estruturasCondicionaisSimples {
    public static void main(String[] args) throws Exception {
        Double saldo = 25.0;
        Double valorSacado = 15.0;

        //Estrutura condicional simples
        if (valorSacado < saldo) {
            saldo = saldo - valorSacado;

            System.out.println(saldo);
        }
    }
}
