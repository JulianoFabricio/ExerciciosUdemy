package proInterface;

public class Funcionario {

    private double salario = 0;
    private CalculoAumento listener;

    public Funcionario(){

    }

    public void novoSalario(){

        if(listener != null){

            salario *= 1.1;

            listener.calcularAumento(salario);

        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public CalculoAumento getListener() {
        return listener;
    }

    public void setListener(CalculoAumento listener) {
        this.listener = listener;
    }
}
