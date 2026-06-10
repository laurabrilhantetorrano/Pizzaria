package model;

import enums.TipoMassa;
import enums.Tamanho;

// HERANÇA
// Classe que representa uma pizza da pizzaria
public class Pizza extends Prato {

    // Atributos próprios da subclasse
    private int qtdFatias;
    private boolean possuiBorda;

    // Construtor da subclasse
    public Pizza(String nome,
                 double precoBase,
                 int tempoPreparoMin,
                 TipoMassa tipoMassa,
                 Tamanho tamanho,
                 int qtdFatias,
                 boolean possuiBorda) {

        // HERANÇA
        // Chamada do construtor da superclasse
        super(nome, precoBase, tempoPreparoMin,
                tipoMassa, tamanho);

        this.qtdFatias = qtdFatias;
        this.possuiBorda = possuiBorda;
    }

    // OVERRIDE
    // Sobrescrevendo o método abstrato da superclasse
    @Override
    public void prepararPedido() {

        System.out.println("A pizza está sendo preparada...");
    }

    // OVERRIDE
    // Sobrescrevendo método concreto da superclasse
    @Override
    public double calcularPreco() {

        double preco = super.calcularPreco();

        // Se possuir borda recheada adiciona valor extra
        if (possuiBorda) {

            preco += 15;
        }

        return preco;
    }

    // OVERLOAD
    // Método com mesmo nome e parâmetros diferentes
    public double calcularPreco(int qtdAdicionais) {

        return calcularPreco() + (qtdAdicionais * 5);
    }

    // OVERRIDE
    // Sobrescrevendo método de exibição
    @Override
    public void exibirFicha() {

        // Chamada do método da superclasse
        super.exibirFicha();

        System.out.println("Quantidade de fatias: "
                + qtdFatias);

        System.out.println("Possui borda recheada: "
                + possuiBorda);
    }

    // Getter da quantidade de fatias
    public int getQtdFatias() {
        return qtdFatias;
    }

    // Getter da borda recheada
    public boolean isPossuiBorda() {
        return possuiBorda;
    }
}