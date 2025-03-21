import java.util.*;
import java.util.stream.*;

public class Main {
        public static void main(String[] args) {
                // Criando um ArrayList de alunos
                ArrayList<Aluno> alunos = new ArrayList<>();
                alunos.add(new Aluno("João", 8.5, 20));
                alunos.add(new Aluno("Maria", 6.5, 22));
                alunos.add(new Aluno("Pedro", 9.0, 21));
                alunos.add(new Aluno("Ana", 7.0, 23));

                // Criando uma lista intermediária com alunos aprovados (nota >= 7)
                List<Aluno> alunosAprovados = alunos.stream()
                                .filter(aluno -> aluno.getNota() >= 7)
                                .sorted(Comparator.comparing(Aluno::getNota).reversed()
                                                .thenComparing(Aluno::getIdade))
                                .collect(Collectors.toList());

                // Transformando a lista de alunos em uma lista de nomes
                List<String> nomesAlunos = alunosAprovados.stream()
                                .map(Aluno::getNome)
                                .collect(Collectors.toList());

                // Exibindo os resultados
                System.out.println("Alunos aprovados ordenados:");
                alunosAprovados.forEach(aluno -> System.out.println("Nome: " + aluno.getNome() + ", Nota: "
                                + aluno.getNota() + ", Idade: " + aluno.getIdade()));

                System.out.println("\nNomes dos alunos aprovados:");
                nomesAlunos.forEach(System.out::println);
        }
}
