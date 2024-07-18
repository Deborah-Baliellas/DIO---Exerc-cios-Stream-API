import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio02 extends Desafio01 {

    /*
     * Desafio 2 - Imprima a soma dos números pares da lista:
     * Utilizando a Stream API, realize a soma dos números pares da lista e exiba o
     * resultado no console.
     */

    public void resolverDesafio02() {
        int somaPares = numeros.stream()
        .filter(n -> n % 2 == 0)
        .mapToInt(Integer::intValue)
        .sum();

        System.out.println("A soma dos números pares desta lista é: " + somaPares);       

    }

    public static void main(String[] args) throws Exception {
        Desafio02 desafio02 = new Desafio02();

        desafio02.resolverDesafio02();

    }

}
