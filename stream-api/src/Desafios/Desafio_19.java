package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio_19 {
    public static void main(String[] args) {
        //Com a Stream API, encontre a soma dos números da lista que são divisíveis tanto por 3 quanto por 5 e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(9, 0, 7, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaMultiplos = numeros.stream().filter(n -> n % 3 == 0 || n % 5 == 0)
                .mapToInt(Integer::intValue).sum();

        System.out.println(somaMultiplos);
    }
}
