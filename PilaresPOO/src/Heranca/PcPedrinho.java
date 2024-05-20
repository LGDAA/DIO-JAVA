package Heranca;

public class PcPedrinho {
    public static void main(String[] args) {
        MSN msn = new MSN();

        msn.enviarMensagem();
        msn.receberMensagem();

        Telegram telegram = new Telegram();

        telegram.enviarMensagem();
        telegram.receberMensagem();

        FacebookMessenger fcb = new FacebookMessenger();

        fcb.enviarMensagem();
        fcb.receberMensagem();
    }
}
