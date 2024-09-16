package Desafios;

import com.sun.jdi.IntegerValue;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Desafio_2 {
    public static void main(String[] args) {
        //Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(9, 0, 7, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        int somaPares = numeros.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(somaPares);

    }

}
