package Desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio_10 {
    public static void main(String[] args) {
        //Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(9, 0, 7, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> listaMultiplos = numeros.stream().filter(n -> n % 2 != 0).filter(n -> n % 3 == 0 || n % 5 == 0).collect(Collectors.toList());

        System.out.println(listaMultiplos);
    }
}
