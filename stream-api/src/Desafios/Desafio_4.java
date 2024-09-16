package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio_4 {
    public static void main(String[] args) {
        //Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.

        List<Integer> numeros = Arrays.asList(9, 0, 7, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> semImpares = numeros.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        System.out.println(semImpares);
    }
}
