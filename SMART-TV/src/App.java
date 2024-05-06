public class App {
    public static void main(String[] args) throws Exception { // executa todo o código

        SmartTv smartTv = new SmartTv();

        System.out.println("A tv está ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("A TV agora está ligada " + smartTv.ligada);
        //System.err.println(smartTv.ligada); true
        //smartTv.desligar();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.trocarCanalNum(20);
        smartTv.trocarCanalNum(51);
        smartTv.diminuirVolume();
    }
}
