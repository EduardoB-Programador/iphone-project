package dispositivos;

import funcionalidades.Internet;
import funcionalidades.RealizarLigacoes;
import funcionalidades.ReprodutorMusical;

import java.util.ArrayList;

public class IPhone extends Dispositivo implements Internet, RealizarLigacoes, ReprodutorMusical {
    private ArrayList<String> contatos = new ArrayList<>(), contatosNome = new ArrayList<>();
    private ArrayList<String> playlists = new ArrayList<>(), musicasFavoritas = new ArrayList<>();
    private ArrayList<String> sites = new ArrayList<>();

    private String numeroPessoal;

    public IPhone(String numeroPessoal) {
        this.numeroPessoal = numeroPessoal;
    }

    public String getNumeroPessoal() {
        return this.numeroPessoal;
    }

    //Internet
    @Override
    public void navegar(String site) {
        System.out.println("Navegando para o site: " + site);
    }

    @Override
    public void salvarSite(String site) {
        System.out.println("Salvando o site: " + site);
        this.sites.add(site);
    }

    @Override
    public String getSitesSalvos() {
        StringBuilder sites = new StringBuilder();
        int i = 1;

        for (String site : this.sites) {
            sites.append(i).append(" - ").append(site).append("\n");
            i++;
        }

        return "Sites salvos:\n\n" + sites;
    }

    //Telefone
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    @Override
    public void desligar() {
        System.out.println("Desligando a chamada");
    }

    @Override
    public void salvarContato(String numero, String nome) {
        System.out.println("Salvando o número " + numero + " como " + nome);
        this.contatos.addLast(numero);
        this.contatosNome.addLast(nome);
        System.out.println("O contato " + nome + " " + numero + " foi salvo.");
    }

    @Override
    public String getContatos() {
        StringBuilder contatos = new StringBuilder();

        for (int i = 0; i < this.contatos.size() && i < this.contatosNome.size(); i++) {
            contatos.append(this.contatosNome.toArray()[i]).append(" - ").append(this.contatos.toArray()[i]).append("\n");
        }

        return "Contatos:\n\n" + contatos;
    }

    //Reprodutor musical
    @Override
    public void iniciarMusica(String musica) {
        System.out.println("Iniciando música: " + musica);
    }

    @Override
    public void pararMusica() {
        System.out.println("Parando música.");
    }

    @Override
    public void criarPlaylist(String[] musicas) {
        StringBuilder texto = new StringBuilder();
        int i = 1;

        for (String musica : musicas) {
            texto.append(i).append(" - ").append(musica).append("\n");
            i++;

        }

        System.out.println("Criado a playlist com as músicas:\n\n" + texto);

        this.playlists.add(texto.toString());
    }

    @Override
    public void adicionarMusicaAosFavoritos(String musica) {
        System.out.println("Adicinado a música \"" + musica + "\" aos favoritos.");
        this.musicasFavoritas.add(musica);
    }

    @Override
    public String getMusicasFavoritas() {
        StringBuilder musicas = new StringBuilder();
        int i = 1;

        for (String musica : this.musicasFavoritas) {
            musicas.append(i).append(" - ").append(musica).append("\n");
            i++;
        }

        return "Suas musicas favoritas são:\n" + musicas;
    }

    @Override
    public String getPlaylists() {
        StringBuilder playlists = new StringBuilder();
        int i = 1;

        for (String playlist : this.playlists) {
            playlists.append(i).append("° playlist -\n").append(playlist).append("\n");
            i++;
        }

        return "Suas playlists são:\n\n" + playlists;
    }
}
