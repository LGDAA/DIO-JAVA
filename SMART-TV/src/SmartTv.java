public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 20;

    public void trocarCanalMais(){
        canal++;
        System.out.println("O canal agora é: " + canal);
    }
    public void trocarCanalMenos(){
        canal--;
        System.out.println("O canal agora é: " + canal);
    }
    public void trocarCanalNum(int num){
        canal = num;
        System.out.println("O canal agora é: " + canal);
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }
    public void diminuirVolume() {
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
    }
    public void ligar(){
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }


}