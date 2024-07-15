package dispositivos;

public abstract class Dispositivo {
    private boolean estado;

    public Dispositivo() {
        this.estado = false;
    }

    public void ligarDesligar() {
        this.estado = !this.estado;
    }

    public String getEstado() {
        return this.estado ? "Ligado" : "Desligado";
    }

}
