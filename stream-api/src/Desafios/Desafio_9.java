package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio_9 {
    public static void main(String[] args) {
        //Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(9, 0, 7, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosDistintos = numeros.size() == numeros.stream().distinct().count();

        if (todosDistintos) {
            System.out.println("Todos os números são distintos.");
        } else {
            System.out.println("Nem todos os números são distintos.");
        }
    }
}
