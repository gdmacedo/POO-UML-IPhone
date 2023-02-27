package Funcoes.Telefone;

import Equipamentos.iPhone2007.Fone.Ligar;
import Equipamentos.iPhone2007.Fone.Atender;
import Equipamentos.iPhone2007.Fone.ICVoz;

public class telefone implements Ligar, Atender, ICVoz {
    public void ligando() {
        System.out.println("2.1 - Realizando um ligação telefônica.");
    }
    public void atendendo() {
        System.out.println("2.2 - Atendendo um Ligação Telefonica.");
    }
    public void IniciarCorreioVoz() {
        System.out.println("2.3 - Inicializando Correio de Voz.");
    }
}
