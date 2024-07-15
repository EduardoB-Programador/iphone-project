package funcionalidades;

public interface RealizarLigacoes {

    void ligar(String numero);
    void desligar();
    void salvarContato(String numero, String nome);
    String getContatos();
}
