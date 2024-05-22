package Interface.estabelecimento;

import Interface.equipamentos.Copiadora.copiadora;
import Interface.equipamentos.Digitalizadora.digitalizadora;
import Interface.equipamentos.Impressora.deskjet;
import Interface.equipamentos.Impressora.laserjet;
import Interface.equipamentos.multifuncional.equipamentoMultifuncional;
import Interface.equipamentos.Impressora.impressora;

public class fabrica {
    public static void main(String[] args) {
        equipamentoMultifuncional em = new equipamentoMultifuncional();
        impressora Impressora = em;
        digitalizadora Digitalizadora = em;
        copiadora Copiadora = em; 

        Digitalizadora.digitalizar();
        Copiadora.copiar();
        Impressora.imprimir();
    }
}
