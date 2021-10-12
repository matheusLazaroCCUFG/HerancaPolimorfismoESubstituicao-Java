public abstract class Forma {
    private double raio;
    private double altura;

    public abstract double calculaArea();

    public abstract String toString();

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
