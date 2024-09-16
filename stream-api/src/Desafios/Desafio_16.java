package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio_16 {
    public static void main(String[] args) {
        //Utilize a Stream API para agrupar os números em duas listas separadas,
        //uma contendo os números pares e outra contendo os números ímpares da lista original, e exiba os resultados no console.

        List<Integer> numeros = Arrays.asList(9, 0, 7, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPares = numeros.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        List<Integer> numerosImpares = numeros.stream().filter(n -> n % 2 == 1).collect(Collectors.toList());

        System.out.println("Lista de números pares: " + numerosPares);
        System.out.println("Lista de números impares: " + numerosImpares);

    }
}
