package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio_14 {
    public static void main(String[] args) {
        //Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(9, 0, 7, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> maiorNumeroPrimo = numeros.stream()
                .filter(Desafio_14::isPrime)
                .max(Integer::compare);

        if (maiorNumeroPrimo.isPresent()) {
            System.out.println("O maior número primo da lista é: " + maiorNumeroPrimo.get());
        } else {
            System.out.println("Não há números primos na lista.");
        }
    }

    // Método para verificar se um número é primo
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
