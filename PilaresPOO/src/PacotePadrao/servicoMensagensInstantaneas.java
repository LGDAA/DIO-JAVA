package PacotePadrao;

public class servicoMensagensInstantaneas {
       public void enviarMensagem(){
            validarConectadoInternet();

            System.out.println("Enviando mensagem...");

            salvarHistoricoMensagem();
       }
       public void receberMensagem(){
        System.out.println("Recebendo mensagem...");

        salvarHistoricoMensagem();
       }
       private void validarConectadoInternet(){
        System.out.println("Validando se você está conectado");
       }
       private void salvarHistoricoMensagem(){
        System.out.println("Salvando histórico de mensagens");
       }

       
    }
