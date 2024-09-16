package Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio_18 {
    public static void main(String[] args) {
        //Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(3, 3, 3, 3, 3, 3, 3, 3, 3, 3 ,3 ,3 ,3 ,3);

        boolean ListaIgual = numeros.stream().allMatch(n -> n.equals(numeros.get(0)));

        if (ListaIgual) {
            System.out.println("A lista tem apenas numeros iguais!");
        } else {
            System.out.println("A lista tem numeros diferentes!");
        }

    }
}
