package com.exemplo;

public class iPhone {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public iPhone() {
        this.reprodutorMusical = new ReprodutorMusical();
        this.aparelhoTelefonico = new AparelhoTelefonico();
        this.navegadorInternet = new NavegadorInternet();
    }

    // Métodos para usar os recursos das classes associadas
    public void usarReprodutorMusical() {
        reprodutorMusical.exemploMetodo1();
        reprodutorMusical.exemploMetodo2("Música exemplo");
    }

    public void usarAparelhoTelefonico() {
        aparelhoTelefonico.exemploMetodo1();
        aparelhoTelefonico.exemploMetodo2("Ligação exemplo");
    }

    public void usarNavegadorInternet() {
        navegadorInternet.exemploMetodo1();
        navegadorInternet.exemploMetodo2("www.exemplo.com");
    }

    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();
        meuIphone.usarReprodutorMusical();
        meuIphone.usarAparelhoTelefonico();
        meuIphone.usarNavegadorInternet();
    }
}

