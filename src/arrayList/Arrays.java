package arrayList;

import java.util.ArrayList;

public class Arrays {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Juliano");
        list.add("Fabricio");
        list.add("Java");
        list.add("Alice");
        list.add("Julio");

        System.out.println("Primeiro item: " + list.get(4));

        System.out.println("Tamanho = " + list.size());

        if(list.contains("Java")){
            System.out.println("Existe Java");
        }else{
            System.out.println("Não existe Java");
        }
        //list.remove(2);

        System.out.println("Tamanho = " + list.size());
        if(list.contains("Java")){
            System.out.println("Existe Java");
        }else{
            System.out.println("Não existe Java");
        }
    }
}
