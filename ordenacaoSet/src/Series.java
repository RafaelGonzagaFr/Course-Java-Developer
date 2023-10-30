import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;


public class Series {
    public static void main(String[] args) throws Exception {

        System.out.println("HashSet"); 

        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comedia", 20));
        }};


        for (Serie serie: minhasSeries) System.out.println(serie.getNome() + " " + serie.getGenero() + " " + serie.getTempoEpisodio());


        System.out.println("\nLinkedHashSet");

        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comedia", 20));
        }};

       

        for (Serie serie: minhasSeries1) System.out.println(serie.getNome() + " " + serie.getGenero() + " " + serie.getTempoEpisodio());

        System.out.println("\nTreeSet");

        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie: minhasSeries2) System.out.println(serie.getNome() + " " + serie.getGenero() + " " + serie.getTempoEpisodio());

        System.out.println("\nTreeSet com Compare");

        Set<Serie> minhasSeries3 = new TreeSet<>(new CompareNomeGeneroEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie: minhasSeries3) System.out.println(serie.getNome() + " " + serie.getGenero() + " " + serie.getTempoEpisodio());

    }
}

class Serie implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio){
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }
    
    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{nome}="+nome+", genero="+genero+", tempoEpisodio="+tempoEpisodio+"}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Serie serie = (Serie) obj;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }


    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;

        return this.getGenero().compareToIgnoreCase(serie.getGenero());

    }


}

class CompareNomeGeneroEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {

        int nome = s1.getNome().compareToIgnoreCase(s2.getNome());
        if(nome != 0 ) return nome;

        int genero = s1.getGenero().compareToIgnoreCase(s2.getGenero());
        if(genero != 0 ) return genero;

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }

}
