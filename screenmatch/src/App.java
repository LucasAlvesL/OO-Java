import br.com.screenmatch.calculo.CalculadorDeTempo;
import br.com.screenmatch.modelos.Movie;
import br.com.screenmatch.modelos.Serie;

public class App {
    public static void main(String[] args) throws Exception {
        Movie filme1 = new Movie();
        filme1.setNome("O poderoso chefao");
        filme1.setAnoDeLancamento(1970);
        filme1.setDuracaoEmMinutos(180);
        System.out.println("Duracao do filme: "+ filme1.getDuracaoEmMinutos());

        filme1.exibeFichaTecnica();
        filme1.avalia(8);
        filme1.avalia(5);
        filme1.avalia(10);
        System.out.println(filme1.getTotalDeAvaliacoes());
        System.out.println(filme1.obterMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        lost.exibeFichaTecnica();
        System.out.println("Duracao da serie: " + lost.getDuracaoEmMinutos());

        Movie filme2 = new Movie();
        filme1.setNome("Top Gun");
        filme1.setAnoDeLancamento(2022);
        filme1.setDuracaoEmMinutos(200);

        CalculadorDeTempo calculadora = new CalculadorDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        System.out.println(calculadora.getTempoTotal());
    }
}
