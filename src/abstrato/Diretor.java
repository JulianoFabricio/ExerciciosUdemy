package abstrato;

public class Diretor extends Funcionario {

    @Override
    double calculoAumento(double salario) {

        double aumento = salario * 1.2 + 1000;

        return aumento;
    }
}
