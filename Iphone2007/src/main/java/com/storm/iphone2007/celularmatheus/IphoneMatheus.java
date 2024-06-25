package com.storm.iphone2007.celularmatheus;

import com.storm.iphone2007.iphone.Iphone;

public class IphoneMatheus {
    
    public static void main(String[] args) {
        
        String musica = "You Me At Six - Lived a Lie";
        String numero = "(71) 98300-3190";
        String url = "https://web.dio.me/lab/desafio-de-projeto-1/learning/undefined";
        
        Iphone iphoneMatheus = new Iphone();
        
        // REPRODUTOR MUSICAL
        iphoneMatheus.tocar(musica);
        iphoneMatheus.pausar();
        iphoneMatheus.selecionarMusica();
        
        // APARELHO TELEFÔNICO
        iphoneMatheus.ligar(numero);
        iphoneMatheus.atender();
        iphoneMatheus.iniciarCorreioVoz();
        
        // NAVEGADOR DE INTERNET
        iphoneMatheus.exibirPagina(url);
        iphoneMatheus.adicionarNovaAba();
        iphoneMatheus.atualizarPagina();
    }
}
