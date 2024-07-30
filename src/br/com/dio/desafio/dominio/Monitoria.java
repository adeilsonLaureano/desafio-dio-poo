package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Monitoria extends Curso{
    private LocalDate data;
    public Monitoria() {

    }

    public Monitoria(LocalDate data) {
        this.data = data;
    }


    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }


    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

}

   
