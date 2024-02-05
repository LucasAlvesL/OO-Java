package br.com.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;

    // Getters
    public String getNome(){
        return nome;
    }
    public int getAnoDeLancamento(){
        return anoDeLancamento;
    }
    public boolean getIncluidoNoPlano(){
        return incluidoNoPlano;
    }
    public double getSomaDasAvaliacoes(){
        return somaDasAvaliacoes;
    }
    public int getTotalDeAvaliacoes(){
        return totalAvaliacoes;
    }
    public int getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }

    // Setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setAnoDeLancamento(int anoDeLancamento){
        this.anoDeLancamento = anoDeLancamento;
    }
    public void setIncluidoNoPlano(boolean incluidoNoPlano){
        this.incluidoNoPlano = incluidoNoPlano;
    }
    public void setSomaDasAvaliacoes(double somaDasAvaliacoes){
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }
    public void setTotalDeAvaliacoes(int totalAvaliacoes){
        this.totalAvaliacoes = totalAvaliacoes;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }
    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalAvaliacoes++;
    }
    public double obterMedia(){
        return somaDasAvaliacoes / totalAvaliacoes;
    }
}
