package Interface.equipamentos.multifuncional;

import Interface.equipamentos.Copiadora.copiadora;
import Interface.equipamentos.Digitalizadora.digitalizadora;
import Interface.equipamentos.Impressora.impressora;

public class equipamentoMultifuncional implements copiadora, digitalizadora, impressora{
    public void copiar(){
        System.out.println("Copiando via equipamento multifuncional");
    }

    public void digitalizar(){
        System.out.println("Digitalizando via equipamento multifuncional");
    }

    public void imprimir(){
        System.out.println("Imprimindo via equipamento multifuncional");
    }
}
