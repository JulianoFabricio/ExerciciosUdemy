package construtor;

public class Animal {

    private String nome;

    public Animal(String nome){
        this.nome = nome;

    }

    public void falar(){

        System.out.println("Olá, eu sou o: " + nome);
    }
}

