package debug;

public class DadsPessoa {

       public static void main(String[] args) {

        String nome = "Julio";
        int idade = 10;
        double salario = 1000;
        double resultado = 0;


        salario = +500;
        nome = "Alice";
        idade = 20;

        salario = somaSalario(salario);

        System.out.println("O nome e:" + nome + " A idade e:" + idade + " O salario e:" + salario);
    }

    public static double somaSalario(double salario) {

        return salario + 1000;
    }
}
