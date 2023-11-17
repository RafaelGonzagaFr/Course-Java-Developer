import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Spring Boot");
        curso.setDescricao("Java Web");
        curso.setCargaHoraria(40);

        Curso curso1 = new Curso();
        curso1.setTitulo("Collections");
        curso1.setDescricao("Coleções em java");
        curso1.setCargaHoraria(40);

        Mentoria mentoria = new Mentoria();
       

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devRafael = new Dev();
        devRafael.setNome("Rafael");
        devRafael.inscreverBootcamp(bootcamp);
        System.out.println(devRafael.getConteudosInscritos());
        devRafael.progredir();
        System.out.println(devRafael.getConteudosConcluidos());
        System.out.println(devRafael.calcularTotalXp());


        Dev devWesley = new Dev();
        devWesley.setNome("Wesley");
        devWesley.inscreverBootcamp(bootcamp); 
        System.out.println(devWesley.getConteudosInscritos());
        devWesley.progredir();
        System.out.println(devRafael.getConteudosConcluidos());
        System.out.println(devWesley.calcularTotalXp());
    }
}
