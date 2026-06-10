package model;

import enums.TipoMassa;
import enums.Tamanho;

// CLASSE ABSTRATA
// Representa um prato genérico da pizzaria
public abstract class Prato {

    // Atributos privados
    private String nome;
    private double precoBase;
    private int tempoPreparoMin;

    // ENUMS
    private TipoMassa tipoMassa;
    private Tamanho tamanho;

    // Construtor da superclasse
    public Prato(String nome,
                 double precoBase,
                 int tempoPreparoMin,
                 TipoMassa tipoMassa,
                 Tamanho tamanho) {

        this.nome = nome;
        this.precoBase = precoBase;
        this.tempoPreparoMin = tempoPreparoMin;
        this.tipoMassa = tipoMassa;
        this.tamanho = tamanho;
    }

    // MÉTODO ABSTRATO
    // Cada subclasse deverá implementar sua forma de preparo
    public abstract void prepararPedido();

    // Método concreto
    // Calcula o preço base do prato
    public double calcularPreco() {

        return precoBase * tamanho.getMultiplicador();
    }

    // Método concreto
    // Exibe as informações do prato
    public void exibirFicha() {

        System.out.println("Nome: " + nome);

        System.out.println("Preço Base: R$ "
                + precoBase);

        System.out.println("Tempo de preparo: "
                + tempoPreparoMin + " minutos");

        System.out.println("Tipo de massa: "
                + tipoMassa);

        System.out.println("Tamanho: "
                + tamanho);
    }

    // Getter do nome
    public String getNome() {
        return nome;
    }

    // Getter do preço base
    public double getPrecoBase() {
        return precoBase;
    }

    // Getter do tempo de preparo
    public int getTempoPreparoMin() {
        return tempoPreparoMin;
    }

    // Getter do tipo de massa
    public TipoMassa getTipoMassa() {
        return tipoMassa;
    }

    // Getter do tamanho
    public Tamanho getTamanho() {
        return tamanho;
    }
}