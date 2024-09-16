package Desafios;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio_1 {
    public static void main(String[] args) {

        //Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.

        List<Integer> numeros = Arrays.asList(9, 0, 7, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosOrdenados = numeros.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(numerosOrdenados);
    }

}
