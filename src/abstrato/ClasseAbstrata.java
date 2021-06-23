package abstrato;

public class ClasseAbstrata {

    public static void main(String[] args) {

        Diretor diretor = new Diretor();

        double novoSalario = diretor.calculoAumento(4000);

        System.out.println("O novo salario e: " + novoSalario);

    }
}
