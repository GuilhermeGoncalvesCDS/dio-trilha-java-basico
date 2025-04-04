package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    // Atributos
    private int cargaHoraria;

    public Curso() {
    }

    public double calcularXp() {
        return XP_PADRAO + 10d * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

}
