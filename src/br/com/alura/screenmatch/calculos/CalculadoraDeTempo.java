package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private  int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme f) {
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Series s) {
//        tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo) {
        System.out.println("Adicionando duração em minutos de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
