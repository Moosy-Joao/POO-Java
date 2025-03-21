import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Criação da lista de funcionários
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("João", 2500.0, "TI"));
        funcionarios.add(new Funcionario("Maria", 3000.0, "Financeiro"));
        funcionarios.add(new Funcionario("Carlos", 2200.0, "TI"));
        funcionarios.add(new Funcionario("Ana", 1800.0, "Marketing"));
        funcionarios.add(new Funcionario("Pedro", 2800.0, "TI"));

        // Filtrar funcionários do departamento "TI"
        List<Funcionario> funcionariosTI = funcionarios.stream()
                .filter(f -> f.getDepartamento().equals("TI"))
                .collect(Collectors.toList());

        // Aplicar aumento de 10% nos salários dos funcionários do departamento "TI"
        List<Funcionario> funcionariosComAumento = funcionariosTI.stream()
                .map(f -> new Funcionario(f.getNome(), f.getSalario() * 1.1, f.getDepartamento()))
                .collect(Collectors.toList());

        // Exibir funcionários com aumento
        System.out.println("Funcionários do departamento TI com aumento de 10%:");
        for (Funcionario f : funcionariosComAumento) {
            System.out.println(f.getNome() + " - Salário: R$ " + f.getSalario());
        }

        // Criar um Map com o total dos salários por departamento
        Map<String, Double> totalSalariosPorDepartamento = funcionarios.stream()
                .collect(Collectors.groupingBy(Funcionario::getDepartamento,
                        Collectors.summingDouble(Funcionario::getSalario)));

        // Exibir o total dos salários por departamento
        System.out.println("\nTotal de salários por departamento:");
        for (Map.Entry<String, Double> entry : totalSalariosPorDepartamento.entrySet()) {
            System.out.println(entry.getKey() + ": R$ " + entry.getValue());
        }
    }
}
