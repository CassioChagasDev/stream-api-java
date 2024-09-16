package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Desafio_17 {
    public static void main(String[] args) {
        //Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(9, 0, 7, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> ListaNumerosPrimo = numeros.stream().filter(Desafio_17::isPrime).collect(Collectors.toList());

        System.out.println(ListaNumerosPrimo);

    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
