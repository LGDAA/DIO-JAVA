public class tiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500; //atribui valor 2 mil e 500
        double salarioMinimoErrado = 2.500; //atribui 2 e 50

        byte idade = 123;
		short ano = 2021;
		int cep = 21070333; // se começar com zero, talvez tenha que ser outro tipo
		long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo
		float pi = 3.14F;
		double salario = 1275.33;

        // TiposEVariaveis.java

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // Não tem como converter short para int

        int numero = 1;
        numero = 2; // mudou

        System.out.println(numero);

        //Exemplo de variável
        numero = 5;

		/*
		 * na linha abaixo iremos alterar o valor do varíavel para 10 observe que o tipo
		 * não é mais necessário, pois a variável já foi declarada anteriormente
		 */
		numero = 10;

		System.out.print(numero);
        System.out.println();
		
		/*
		 * ao usar a palavra reservada final, você determina que jamais
		 * esta variavel poderá obter outro valor;
		 * logo vai apresentar um erro de compilação
		 * isso é considerado uma CONSTANTE na linguagem Java
		 */
		final double VALOR_DE_PI = 3.14; 
		
		//VALOR_DE_PI=3.15; //Esta linha vai apresentar erro de compilação!

        String meuNome = "Luiz Gustavo";

        System.out.println(meuNome);
    }
}
