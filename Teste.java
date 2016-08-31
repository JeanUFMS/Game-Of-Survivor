package teste;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Teste {
    int x;
    void Vetor(){
        Scanner ler= new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor");
        x=ler.nextInt();
         ler.nextLine();
        int numeros[]=new int[x];
        for(int i=0;i<x;i++){
            numeros[i]=i;
        }
        System.out.println("Antes de embaralhar"+Arrays.toString(numeros));
        Random random = new Random();
        for (int k=0; k< (numeros.length - 1); k++) {
             //sorteia um índice
             int j = random.nextInt(numeros.length); 
            //troca o conteúdo dos índices i e j do vetor
             int temp = numeros[k];
             numeros[k] = numeros[j];
             numeros[j] = temp;
		}
        System.out.println(Arrays.toString(numeros));
        System.out.println("Pressione enter para sortear um número");
         ler.nextLine();
        System.out.println(numeros[3]);
}
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler= new Scanner(System.in);
       Teste  VemMetodo = new Teste();
        System.out.println("É funcionou!");
        VemMetodo.Vetor();
    }
}
