package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio_7 {
    public static void main(String[] args) {
        //Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(9, 0, 7, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosUnicosOrdenados = numeros.stream()
                .distinct()
                .sorted((a, b) -> b - a)
                .collect(Collectors.toList());

        if (numerosUnicosOrdenados.size() >= 2) {
            Integer segundoMaior = numerosUnicosOrdenados.get(1);
            System.out.println("O segundo maior número é: " + segundoMaior);
        } else {
            System.out.println("Não há números suficientes para determinar o segundo maior.");
        }
    }

}
