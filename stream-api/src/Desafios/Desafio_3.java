package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio_3 {
    public static void main(String[] args) {
        //Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(-1, 9, 0, 7, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean numeroPositivo = numeros.stream().allMatch(num -> num >= 0);

        if (numeroPositivo) {
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }
    }
}
