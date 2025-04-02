package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // Criando um curso
        Curso curso = new Curso();
        curso.setTitulo("Curso de Java");
        curso.setDescricao("Aprenda Java do zero ao avançado");
        curso.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Aprenda js do zero ao avançado");
        curso2.setCargaHoraria(8);

        // Criando uma mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTítulo("Mentoria de Java");
        mentoria.setDescricao("Tire suas dúvidas sobre Java");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTítulo("Mentoria de Js");
        mentoria2.setDescricao("Tire suas dúvidas sobre Js");
        mentoria2.setData(LocalDate.now());

        // Exibindo os detalhes do curso e da mentoria
        System.out.println(curso);
        System.out.println(mentoria);
        System.out.println(curso2);
        System.out.println(mentoria2);
    }
}
