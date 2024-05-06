public class Debugg {
    public static void main(String[] args) throws Exception {
        System.out.println("Entrou no método main");
        a();
        System.out.println("Saiu do método main");
    }

    static void a() {
        System.out.println("Entrou no método a");
        b();
        System.out.println("Saiu do método a");
    }
    static void b() {
        System.out.println("Entrou no método b");
        for (int i =0; i<= 4; i++)
            System.out.println(i);
        c();
        System.out.println("Saiu do método b");
    }
    static void c() {
        System.out.println("Entrou no método c");
        
        System.out.println("Saiu do método c");
    }
}

//Método stack Trace se lê de baixo para cima