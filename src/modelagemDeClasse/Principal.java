package modelagemDeClasse;

public class Principal {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.cadastroPessoa("Juliano", "1234", 10);
        System.out.println("O nome da pessoa e:" + pessoa.getNome());
        System.out.println("O CPF da pessoa e:" + pessoa.getCPF());
        System.out.println("A idade da pessoa e:" + pessoa.getIdade());


        Pessoa p2 = new Pessoa();
        p2.cadastroPessoa("Fabricio", "5678", 20);
        System.out.println("O nome da pessoa e:" + p2.getNome());
        System.out.println("O CPF da pessoa e:" + p2.getCPF());
        System.out.println("A idade da pessoa e:" + p2.getIdade());
    }
}
