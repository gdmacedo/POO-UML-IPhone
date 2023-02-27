package Funcoes.TocarMusica;

import Equipamentos.iPhone2007.Radio.Tocar;
import Equipamentos.iPhone2007.Radio.Selecionar;
import Equipamentos.iPhone2007.Radio.Pausar;

public class tocarMusica implements Tocar, Pausar, Selecionar {
    public void tocandoMusica() {
        System.out.println("1.1 - Tocando música.");
    }
    public void pausandoMusica() {
        System.out.println("1.2 - Pausando a música.");
    }
    public void selecionandoMusica() {
        System.out.println("1.3 - Selecionando uma música.");
    }
}
