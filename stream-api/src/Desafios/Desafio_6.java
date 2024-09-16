package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio_6 {
    public static void main(String[] args) {
        //Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(21, 9, 0, 7, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean numeroMaiorQue10 = numeros.stream().anyMatch(n -> n > 10);

        if (numeroMaiorQue10) {
            System.out.println("Há um numero maior que 10");
        } else {
            System.out.println("Não há um numero maior que 10");
        }

    }
}
