package funcionalidades;

public interface ReprodutorMusical {

    void iniciarMusica(String musica);
    void pararMusica();
    void criarPlaylist(String[] musicas);
    void adicionarMusicaAosFavoritos(String musica);
    String getPlaylists();
    String getMusicasFavoritas();
}
