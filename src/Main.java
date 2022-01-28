import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.curso;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        curso curso1 = new curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulos("Mentoria de java");
        mentoria.setDescricao("Desrição mentoria java");
        mentoria.setData(LocalDate.now());

        curso curso2 = new curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(4);

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
