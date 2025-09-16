package atividade;

public class Livro extends Media{
    private String autor;
    private String editora;
    private int numPaginas;


    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return this.editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getNumPaginas() {
        return this.numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getInformacoes(){
        String mensagem = "Titulo: " + this.getTitulo();
        mensagem += "Autor: " + this.getAutor();
    }
}