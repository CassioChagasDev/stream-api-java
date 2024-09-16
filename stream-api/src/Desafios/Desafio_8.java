package Desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio_8 {
    public static void main(String[] args) {
        //Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.

        List<Integer> numeros = Arrays.asList(9, 0, 7, 5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDosDigitos = numeros.stream()
                .mapToInt(numero ->
                        Integer.toString(numero) // Converte o número para uma String
                                .chars() // Obtém um IntStream de códigos de caracteres
                                .map(Character::getNumericValue) // Converte cada código de caractere em um valor numérico
                                .sum() // Soma os valores numéricos
                )
                .sum(); // Soma os resultados de todos os números

        System.out.println("A soma dos dígitos de todos os números é: " + somaDosDigitos);
    }
}
