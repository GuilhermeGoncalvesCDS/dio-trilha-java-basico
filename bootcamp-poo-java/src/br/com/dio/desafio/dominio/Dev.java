package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
    private int xpTotal = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public int getXpTotal() {
        return xpTotal;
    }

    public void setXpTotal(int xpTotal) {
        this.xpTotal = xpTotal;
    }

    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos, xpTotal);
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Dev))
            return false;
        Dev dev = (Dev) o;
        return xpTotal == dev.xpTotal && Objects.equals(nome, dev.nome)
                && Objects.equals(conteudosInscritos, dev.conteudosInscritos)
                && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public String toString() {
        return "Dev{" +
                "nome='" + nome + '\'' +
                ", conteudosInscritos=" + conteudosInscritos +
                ", conteudosConcluidos=" + conteudosConcluidos +
                ", xpTotal=" + xpTotal +
                '}';
    }

    public double calcularTotalXp() {
        return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXp).sum();
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
            this.xpTotal += conteudo.get().calcularXp();
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public void visualizarConteudo() {
        // Implementar lógica para visualizar o conteúdo
        // Exemplo: System.out.println(this.conteudoInscrito);
    }

    public void visualizarConteudoInscrito() {
        // Implementar lógica para visualizar o conteúdo inscrito
        // Exemplo: System.out.println(this.conteudoInscrito);
    }

    public void visualizarXpTotal() {
        // Implementar lógica para visualizar o total de XP
        // Exemplo: System.out.println(this.xpTotal);
    }
}
