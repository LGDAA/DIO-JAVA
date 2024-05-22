package Polimorfismo;

public abstract class servicoMensagensInstantaneas {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void validarConectadoInternet(){
        System.out.println("Validando se está conectado à internet.");
    }
}
