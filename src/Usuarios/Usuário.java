package Usuarios;

// Seleciona abaixo qual será o import, de acordo com a operação a ser realiada.
//import Equipamentos.iPhone2007.Fone.Ligar;
//import Equipamentos.iPhone2007.Fone.Atender;
//import Equipamentos.iPhone2007.Fone.ICVoz;
//import Funcoes.Telefone.telefone;

//import Equipamentos.iPhone2007.Navegador.Adicionar;
//import Equipamentos.iPhone2007.Navegador.Atualizar;
//import Equipamentos.iPhone2007.Navegador.Exibir;
//import Funcoes.Navegador.navegador;

//import Equipamentos.iPhone2007.Radio.Tocar;
import Equipamentos.iPhone2007.Radio.Pausar;
//import Equipamentos.iPhone2007.Radio.Selecionar;
import Funcoes.TocarMusica.tocarMusica;


public class Usuário {
    public static void main(String[] args){

/*---------------------------------------------------------------------------------------------Iniciando da operação de Telefone*/
        // Operação a ser realizada
        // Configuração da operação a ser realizada

        // Realiando a operação.
        // Se Desejar fazer uma ligação
        // final Ligar telefone = new telefone();
        // telefone.ligando();

        //Se desejar atendeter o telefone
        // final Atender telefone = new telefone();
        // telefone.atendendo();

        // Se desejar iniciar correio de voz.
        // final ICVoz telefone = new telefone();
        // telefone.IniciarCorreioVoz();
/*---------------------------------------------------------------------------------------------Final da operação de Telefone*/

/*---------------------------------------------------------------------------------------------Iniciando Navegador na Internet*/
        // Operação a ser realizada
        // Configuração da operação a ser realizada
        // -----------------------------------------------Para operação no Telefone
        // final Ligar telefone = new telefone();
        // final Atender telefone = new telefone();


        // -----------------------------------------------Para operação no Navegador
        // Realiando a operação.
        // Se Desejar Exibir uma Página no Navegador
        // final Exibir navegador = new navegador();
        // navegador.exibindoPagina();

        //Se desejar adicionar uma Nova Página no Navegador.
        // final Adicionar navegador = new navegador();
        // navegador.adicionandoPagina();

        // Se desejar atualizar a página no Navegador.
        // final Atualizar navegador = new navegador();
        // navegador.atulizandoPagina();
/*-------------------------------------------------------------------------------------------------Final Navegador na Internet */

/*---------------------------------------------------------------------------------------------Iniciando o Rádio para tocar música.*/
        // Operação a ser realizada
        // Configuração da operação a ser realizada
        // -----------------------------------------------Para operação no Navegador
        // Realiando a operação.
        // Se Desejar Tocar um música no rádio
        // final Tocar tocarMusica = new tocarMusica();
        // tocarMusica.tocandoMusica();

        // Se desejar atualizar a página no Navegador.
        final Pausar tocarMusica = new tocarMusica();
        tocarMusica.pausandoMusica();

        //Se desejar adicionar uma Nova Página no Navegador.
        //final Selecionar tocarMusica = new tocarMusica();
        //tocarMusica.selecionandoMusica();

/*-------------------------------------------------------------------------------------------------Final Navegador na Internet */


   }
}
