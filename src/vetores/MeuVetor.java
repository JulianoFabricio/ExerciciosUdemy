package vetores;

public class MeuVetor {

    public static void main(String[] args) {

        int vec[] = new int[5];
		/*
		vec[0] = 5;
		vec[1] = 7;

		System.out.println("A posição 0 do vec é: " + vec[0]);
		System.out.println("A posição 1 do vec é: " + vec[1]);
		*/
		/*
		for(int i=0; i < 5; i++){
			vec[i] = i;
		}
		for(int i=0; i < 5; i++){
			System.out.println("O valor do vetor é:" + vec[i]);
		}*/

        int aux = 4;
        for(int i=0; i < 5; i++){
            vec[i] = aux;
            aux--;
        }
        for(int i=0; i < 5; i++){
            System.out.println("O valor do vetor é:" + vec[i]);
        }
    }
}
