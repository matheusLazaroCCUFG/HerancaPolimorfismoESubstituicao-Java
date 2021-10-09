public class Cilindro extends Forma{
    /**
     * Área do cilindro total = Área lateral + Área da base =
     *  = 2 * π * raio * h + 2 * π * raio²
     * @return
     */
    @Override
    public double calculaArea() {
        return (
            2 * Math.PI * raio * altura +
            2 * Math.PI * Math.pow(raio, 2)
        );
    }

    /**
     * Volume do cilindro = π * r² * h
     * @return
     */
    public double calculaVolume(){
        return Math.PI * Math.pow(raio, 2) * altura;
    }

    @Override
    public String toString() {
        return(
            "Área total do cilindro = 2*π*raio*h + 2*π*r² = " +
            String.format("%.2f", calculaArea())  + " cm²" +
            "\nVolume do cilindro = π*raio²*h = " +
            String.format("%.2f", calculaVolume()) + " cm³"
        );
    }
}
