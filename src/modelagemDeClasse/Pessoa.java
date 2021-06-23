package modelagemDeClasse;

public class Pessoa {

    //atributos,
    private String nome;
    private String CPF;
    private int idade;
    private String sobrenome;
    //metodos (ações),
    public void cadastroPessoa(String nome, String CPF, int idade){

        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
    }
    public String getNome(){
        return this.nome;
    }
    public String getCPF(){
        return this.CPF;

    }
    public int getIdade(){

        return this.idade;

    }
}
