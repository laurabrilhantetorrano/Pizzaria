package enums;

// ENUM COMPLETO
// Cada tamanho possui diâmetro e multiplicador de preço
public enum Tamanho {

    PEQUENA(25, 1.0),
    MEDIA(35, 1.5),
    GRANDE(45, 2.0);

    // Atributos do enum
    private final int diametroCm;
    private final double multiplicadorPreco;

    // Construtor do enum
    Tamanho(int diametroCm, double multiplicadorPreco) {

        this.diametroCm = diametroCm;
        this.multiplicadorPreco = multiplicadorPreco;
    }

    // Getter do diâmetro
    public int getDiametroCm() {
        return diametroCm;
    }

    // Getter do multiplicador
    public double getMultiplicador() {
        return multiplicadorPreco;
    }
}