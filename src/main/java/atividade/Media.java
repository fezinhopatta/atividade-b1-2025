package atividade;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Media{
    private long id;
    private String titulo;
    private int anoLancamento;
    private String cassificacaoIndicativa;
    private LocalDate dadaAquisicao;
    private String observacoes;


    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return this.anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getCassificacaoIndicativa() {
        return this.cassificacaoIndicativa;
    }

    public void setCassificacaoIndicativa(String cassificacaoIndicativa) {
        this.cassificacaoIndicativa = cassificacaoIndicativa;
    }

    public LocalDate getDadaAquisicao() {
        return this.dadaAquisicao;
    }

    public void setDadaAquisicao(LocalDate dadaAquisicao) {
        this.dadaAquisicao = dadaAquisicao;
    }

    public String getObservacoes() {
        return this.observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

}
