package Polimorfismo;
import java.util.Scanner;

public class PcPedrinho {
    public static void main(String[] args) {
        servicoMensagensInstantaneas smi = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o app escolhido: MSN/TLG/FCB");
        String appEscolhido = scanner.next();

        if (appEscolhido.equals("MSN")) {
            MSN msn = new MSN();
            msn.enviarMensagem();
            msn.receberMensagem();
        }
        if (appEscolhido.equals("TLG")) {
            Telegram telegram = new Telegram();
            telegram.enviarMensagem();
            telegram.receberMensagem();
        }
        else if (appEscolhido.equals("FCB")) {
            FacebookMessenger fcb = new FacebookMessenger();
            fcb.enviarMensagem();
            fcb .receberMensagem();
        }
    scanner.close();
    }
        
}