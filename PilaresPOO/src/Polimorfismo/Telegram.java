package Polimorfismo;

public class Telegram extends servicoMensagensInstantaneas{
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
    }
   public void receberMensagem(){
    System.out.println("Recebendo mensagem pelo Telegram");
   }
}
