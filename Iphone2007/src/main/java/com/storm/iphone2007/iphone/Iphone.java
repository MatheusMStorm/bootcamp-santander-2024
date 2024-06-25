package com.storm.iphone2007.iphone;

import com.storm.iphone2007.aplicativos.AparelhoTelefonico;
import com.storm.iphone2007.aplicativos.NavegadorInternet;
import com.storm.iphone2007.aplicativos.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar(String musica) {
        System.out.println("TOCANDO " + musica + " NO SEU IPHONE 2007");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MÚSICA");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("SELECIONANDO MÚSICA");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("LIGANDO PARA " + numero);    
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO...");    
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");    
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("ACESSANDO " + url);    
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA");    
    }   
    
}
