package PacotePadrao;

public class PcPedrinho {
    public static void main(String[] args) {
        FacebookMessenger facebookMSN = new FacebookMessenger();
        System.out.println("Utilizando Facebook Messenger");
        facebookMSN.enviarMensagem();
        facebookMSN.receberMensagem();
        System.out.println("======================");
        System.out.println("\t");
        MSN msn = new MSN();
        System.out.println("Utilizando MSN");
        msn.enviarMensagem();
        msn.receberMensagem();
        System.out.println("======================");
        System.out.println("\t");
    
        Telegram telegram = new Telegram();
        System.out.println("Utilizando Telegram");
        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
}
