public class Circulo extends Forma {
    /**
     * Área do Círculo = pi * raio²
     */
    @Override
    public double calculaArea() {
        return Math.PI * Math.pow(getRaio(), 2);
    }

    @Override
    public String toString() {
        return "Área do círculo = " + String.format("%.2f", calculaArea()) + " cm²";
    }
}
