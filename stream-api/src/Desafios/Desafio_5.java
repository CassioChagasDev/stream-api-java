package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio_5 {
    public static void main(String[] args) {
        //Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(9, 0, 7, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        double mediaNumeros = numeros.stream().filter(n -> n > 5).mapToInt(n -> n).average().getAsDouble();

        System.out.println(mediaNumeros);

    }
}
