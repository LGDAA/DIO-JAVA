package Polimorfismo;

public class FacebookMessenger extends servicoMensagensInstantaneas{
    public void enviarMensagem(){
        validarConectadoInternet();
        
        System.out.println("Enviando mensagem pelo Facebook messenger");
   }
   public void receberMensagem(){
    System.out.println("Recebendo mensagem pelo Facebook messenger");
   }
}
