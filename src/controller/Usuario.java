package controller;

import dispositivos.IPhone;

public class Usuario {
    public static void main(String[] args) {
        IPhone iphone = new IPhone("998746288");

        //Ligando o Iphone
        System.out.println(iphone.getEstado());
        iphone.ligarDesligar();
        System.out.println(iphone.getEstado());

        //Usando a internet
        iphone.navegar("https://google.com");
        iphone.salvarSite("https://google.com");
        iphone.salvarSite("https://youtube.com");
        iphone.salvarSite("https://www.dio.me");
        System.out.println(iphone.getSitesSalvos());

        //Realizando ligações telefonicas
        iphone.ligar("992453214");
        iphone.desligar();
        iphone.salvarContato("978624580", "Luiza");
        iphone.salvarContato("974284521", "Marcos");
        iphone.salvarContato("998421094", "Maurício");
        System.out.println(iphone.getContatos());

        //Reproduzindo músicas
        iphone.iniciarMusica("Balakirev : Islamey");
        iphone.pararMusica();

        String[] musicas1 = {"Clair de Lune", "Gaspard de la nuit, M.55: I. Ondine", "Csardas", "Mazeppa",
                "Große Konzertfantasie über spanische Weisen", "Spanish Rhapsody", "Liebestraum"};

        String[] musicas2 = {"&", "A Lady", "The Bidding", "Hidden in the sand", "You & Me", "This is (not) the end",
                "classic j dies and goes to hell part 1"};

        String[] musicas3 = {"Katyusha", "Korobeiniki", "Norma / Act 2 Scene 3: \"Deh non volerli vittime\"",
                "Lilium", "Der Doppelgänger"};

        iphone.criarPlaylist(musicas1);
        iphone.criarPlaylist(musicas2);
        iphone.criarPlaylist(musicas3);

        System.out.println(iphone.getPlaylists());

        iphone.adicionarMusicaAosFavoritos("Große Konzertfantasie über spanische Weisen");
        iphone.adicionarMusicaAosFavoritos("Réminiscences de Norma, S. 394 (after V. Bellini)");
        iphone.adicionarMusicaAosFavoritos("Norma / Act 2 Scene 3: \"Deh non volerli vittime\"");

        System.out.println(iphone.getMusicasFavoritas());
    }
}
