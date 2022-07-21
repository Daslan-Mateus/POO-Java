public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    // OVERLOAD

    public void avaliar() {
        this.filme.setAvaliacao(5);
    }

    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }

    public void avaliar(float porc) {
        int cont = 0;
        if (porc <= 30) {
            cont = 3;
        } else if (porc <= 50) {
            cont = 5;
        } else if (porc <= 90) {
            cont = 8;
        } else {
            cont = 10;
        }
        this.filme.setAvaliacao(cont);
    }

    // CONSTRUCTOR
    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
    }

    // GETTERS AND SETTERS
    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao [espectador=" + espectador + ", filme=" + filme + "]";
    }

}
