package ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        List<Funcionarios> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionarios("Joao", 20, 5000));
        funcionarios.add(new Funcionarios("flavio", 41, 2000));
        funcionarios.add(new Funcionarios("maria", 21, 1500));
        funcionarios.add(new Funcionarios("pedro", 34, 3000));
        funcionarios.add(new Funcionarios("camily", 22, 4200));

        List<Funcionarios> FuncionarioSalarioAcima5000 = funcionarios.stream()
                .filter(propriedade -> propriedade.getSalario() > 5000)
                .sorted((prop1, prop2) -> Double.compare(prop2.getSalario(), prop1.getSalario()))
                .collect(Collectors.toList());


        FuncionarioSalarioAcima5000.forEach(prop->System.out.println(prop.getNome()+ " " +prop.getIdade()+ " anos " + prop.getSalario()+ " Reais "));

    }



}
