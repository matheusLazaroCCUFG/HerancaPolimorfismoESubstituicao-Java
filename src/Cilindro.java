public class Cilindro extends Forma{
    /**
     * Área do cilindro total = Área lateral + Área da base =
     *  = 2 * π * getRaio() * h + 2 * π * getRaio()²
     */
    @Override
    public double calculaArea() {
        return (
            2 * Math.PI * getRaio() * getAltura() +
            2 * Math.PI * Math.pow(getRaio(), 2)
        );
    }

    /**
     * Volume do cilindro = π * r² * h
     */
    public double calculaVolume(){
        return Math.PI * Math.pow(getRaio(), 2) * getAltura();
    }

    @Override
    public String toString() {
        return(
            "Área total do cilindro = 2*π*getRaio()*h + 2*π*r² = " +
            String.format("%.2f", calculaArea())  + " cm²" +
            "\nVolume do cilindro = π*getRaio()²*h = " +
            String.format("%.2f", calculaVolume()) + " cm³"
        );
    }
}
