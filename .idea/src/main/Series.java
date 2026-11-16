package main;

public class Series {
    private String nome;
    private String plataforma;
    private double nota;

    public Series(String nome, String plataforma) {
        this.nome = nome;
        this.plataforma = plataforma;
    }

    public Series(String nome) {
        this.nome = nome;
        this.plataforma = "Plataforma Indefinida.";
    }

    @Override
    public String toString() {
        return "Series{" +
                "nome='" + nome + '\'' +
                ", plataforma='" + plataforma + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if(this.nota >= 0 && this.nota <= 10){
            this.nota = nota;
        }
        else{
            System.out.println("Nota invalida!");
        }
    }
}