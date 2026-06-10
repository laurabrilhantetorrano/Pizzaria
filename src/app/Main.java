package app;

import model.Pizza;
import enums.TipoMassa;
import enums.Tamanho;

// Classe principal responsável pelos testes do sistema
public class Main {

    public static void main(String[] args) {

        // Criando o primeiro objeto Pizza
        Pizza pizza1 = new Pizza(
                "Calabresa",
                40,
                25,
                TipoMassa.TRADICIONAL,
                Tamanho.GRANDE,
                8,
                true
        );

        // Criando o segundo objeto Pizza
        Pizza pizza2 = new Pizza(
                "Frango com Catupiry",
                35,
                20,
                TipoMassa.FINA,
                Tamanho.MEDIA,
                6,
                false
        );

        // TESTES DA PRIMEIRA PIZZA
        System.out.println("===== PIZZA 1 =====");

        // Método sobrescrito (override)
        pizza1.prepararPedido();

        // Método sobrescrito de exibição
        pizza1.exibirFicha();

        // Método sobrescrito calcularPreco()
        System.out.println("Preço final: R$ "
                + pizza1.calcularPreco());

        // Método sobrecarregado (overload)
        System.out.println("Preço com adicionais: R$ "
                + pizza1.calcularPreco(3));

        System.out.println();

        // TESTES DA SEGUNDA PIZZA
        System.out.println("===== PIZZA 2 =====");

        pizza2.prepararPedido();

        pizza2.exibirFicha();

        System.out.println("Preço final: R$ "
                + pizza2.calcularPreco());

        System.out.println("Preço com adicionais: R$ "
                + pizza2.calcularPreco(2));

        System.out.println();

        // COMPARAÇÃO ENTRE OBJETOS
        System.out.println("===== COMPARAÇÃO =====");

        if (pizza1.calcularPreco() > pizza2.calcularPreco()) {

            System.out.println(
                    pizza1.getNome() + " é mais cara."
            );

        } else {

            System.out.println(
                    pizza2.getNome() + " é mais cara."
            );
        }
    }
}