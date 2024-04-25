package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Series;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(8);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(9);
        var novofilme = new Filme("Interestelar", 2014);
        novofilme.avalia(10);
        Series lost = new Series("lost", 2006);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(novofilme);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        //Método lambda forEach: nomes.forEach(nome -> System.out.println(nome));
        lista.forEach(System.out::println); //Expressão lambda reduzida chamada Method Reference
        for (Titulo item: lista) { //expressão anterior pelo laço For
                System.out.println("For_Filme: " + item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Robert Willians");
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Tom Hanks");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        Collections.sort(lista);
        System.out.println("Lista de titulos ordenados");
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
