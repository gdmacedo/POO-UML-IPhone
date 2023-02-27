package Funcoes.Navegador;

import Equipamentos.iPhone2007.Navegador.Exibir;
import Equipamentos.iPhone2007.Navegador.Adicionar;
import Equipamentos.iPhone2007.Navegador.Atualizar;

public class navegador implements Exibir, Adicionar, Atualizar {
    public void exibindoPagina() {
        System.out.println("3.1 - Exibindo um página no navegador.");
    }
    public void adicionandoPagina() {
        System.out.println("3.2 - Adicionando uma Nova Aba no navegador.");
    }
    public void atulizandoPagina() {
        System.out.println("3.3 - Atualizando a página no navegador.");
    }
}