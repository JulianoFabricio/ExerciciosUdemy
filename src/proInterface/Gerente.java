package proInterface;
public class Gerente implements CalculoAumento {

    public Gerente(double salario){

        Funcionario func = new Funcionario();
        func.setSalario(salario);
        func.setListener(this);
        func.novoSalario();
    }
    @Override
    public double calcularAumento(double salario) {

        salario *= 1.2;

        System.out.println("Aumento do Gernte: " + salario);

        return salario;
    }
}





