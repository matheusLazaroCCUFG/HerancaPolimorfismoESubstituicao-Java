public class Circulo extends Forma {
    /**
     * Área do Círculo = pi * raio²
     * @return
     */
    @Override
    public double calculaArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public String toString() {
        return "Área do círculo = " + String.format("%.2f", calculaArea()) + " cm²";
    }
}
