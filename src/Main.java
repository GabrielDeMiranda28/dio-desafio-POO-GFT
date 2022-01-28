import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.curso;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        curso curso1 = new curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        curso curso2 = new curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Desrição mentoria java");
        mentoria.setData(LocalDate.now());


       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGabriel = new Dev();
        devGabriel.setNome("Gabriel");
        devGabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Gabriel" + devGabriel.getConteudosInscritos());
        devGabriel.progredir();
        devGabriel.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Gabriel" + devGabriel.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Gabriel" + devGabriel.getConteudosConcluidos());
        System.out.println("Xp:" + devGabriel.calcularXp());

        System.out.println("-------");

        Dev devGuilherme = new Dev();
        devGuilherme.setNome("Guilherme");
        devGuilherme.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Guilherme" + devGuilherme.getConteudosInscritos());
        devGuilherme.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Guilherme" + devGuilherme.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Guilherme" + devGuilherme.getConteudosConcluidos());
        System.out.println("Xp:" + devGuilherme.calcularXp());
    }
    
}
