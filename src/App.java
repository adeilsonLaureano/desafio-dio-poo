import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Monitoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso("introdução a java", "descricao");
        Curso curso2 = new Curso("introdução a poo", "descricao");
        Curso curso3 = new Curso("introdução a springboot", "descricao");

        Bootcamp javaBootcamp = new Bootcamp();
        javaBootcamp.setNome("bootcamp de java básico");
        javaBootcamp.setDescricao("bootcamp de java básico");
        javaBootcamp.setTempo(84);
        javaBootcamp.getCursos().add(curso1);
        javaBootcamp.getCursos().add(curso2);
        javaBootcamp.getCursos().add(curso3);

        Dev dev1 = new Dev();
        dev1.setNome("hunter");
        dev1.inscreverBootcamp(javaBootcamp);
        System.out.println("cursos Inscritos hunter:" + dev1.getCursosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println("cursos Inscritos hunter:" + dev1.getCursosInscritos());
        System.out.println("cursos Concluídos hunter:" + dev1.getCursosConcluidos());

    }
}
