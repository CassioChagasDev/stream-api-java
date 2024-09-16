package Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio_11 {
    public static void main(String[] args) {
        //Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(9, 0, 7, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int resultado = numeros.stream().mapToInt(num -> num * num).sum();

        System.out.println(resultado);
    }
}
