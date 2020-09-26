import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Curso {

private String nome;
private int alunos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAlunos() {
        return alunos;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public void setAlunos(int alunos) {
        this.alunos = alunos;
    }

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }
}

class ExemploCursos {

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("Javascript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparing(Curso::getAlunos));

        List<Curso> cursosFiltrados =
                cursos.stream().filter(c -> c.getAlunos() > 100).collect(Collectors.toList());

        System.out.println("Cursos maiores de 100 alunos " +  cursosFiltrados );

        int total = cursos.stream().filter(c -> c.getAlunos() > 100).mapToInt(Curso::getAlunos).sum();
        System.out.println(" Somatório de alunos " + total);

    }

}
