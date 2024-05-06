public class App {
    public static void main(String[] args) throws Exception {
        Conta contaCliente = new Conta();

        contaCliente.sacar(5.0);
        contaCliente.imprimirSaldo();

        System.out.println("A dívida total em 5 meses, com 50R$ de parcela, é de: "+ contaCliente.calcularDividaExponencial()+"R$");
        
    }
}
