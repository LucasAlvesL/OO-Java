package br.com.screenmatch.calculo;
import br.com.screenmatch.modelos.Movie;

public class CalculadorDeTempo {
    private int tempoTotal;

    public int getTempoTotal(){
        return tempoTotal;
    }

    public void inclui(Movie filme){
        tempoTotal += filme.getDuracaoEmMinutos();
    }
}
