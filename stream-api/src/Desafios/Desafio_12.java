package Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio_12 {
    public static void main(String[] args) {
        //Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(9, 7, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Long resultado = numeros.stream().mapToLong(Integer::longValue).reduce(1L, (a, b) -> a * b);

        System.out.println(resultado);
    }
}
