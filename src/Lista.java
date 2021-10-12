import java.util.Iterator;
import java.util.LinkedList;

public class Lista {
    private LinkedList<Forma> forma;

    Lista(){
        forma = new LinkedList<>();
    }

    /**
     * Verifica se o objeto passado como parâmetro existe,
     * caso positivo, ele é adicionado à lista encadeada "forma", que é do
     * tipo Forma; então retorna-se true; caso contrário, retorna-se false.
     */
    public boolean add(Forma forma){
        if(forma != null){
            this.forma.add(forma);
            return true;
        }else{
            return false;
        }
    }

    public int qtdeCirculos(){
        int num = 0;
        
        Iterator<Forma> i = forma.iterator();
        Forma f;
        
        while(i.hasNext()){
            f = (Forma) i.next();
            if(f instanceof Circulo) num++;
        }
        return num;
    }

    public int qtdeCilindros(){
        int num = 0;

        Iterator<Forma> i = forma.iterator();
        Forma f;

        while(i.hasNext()){
            f = (Forma) i.next();
            if(f instanceof Cilindro) num++;
        }
        return num;
    }

    public String mostraAreas(){
        StringBuilder areas = new StringBuilder("Áreas das formas");
        int numCirculos = 0;
        int numCilindros = 0;

        Iterator<Forma> i = forma.iterator();
        Forma f;

        while(i.hasNext()){
            f = (Forma) i.next();
            if(f instanceof Circulo){
                areas.
                    append("\nÁrea do Círculo ").append(numCirculos + 1).
                    append(" = ").append(String.format("%.2f", f.calculaArea())).
                    append(" cm²");
                numCirculos++;
            }
            if(f instanceof Cilindro){
                areas.
                    append("\nÁrea do Cilindro ").
                    append(numCilindros + 1).append(" = ").
                    append(String.format("%.2f", f.calculaArea())).
                    append(" cm²");
                numCilindros++;
            }
        }
        return areas.toString();
    }

    public String mostraVolumes(){
        Iterator<Forma> i = forma.iterator();
        Forma f;
        StringBuilder str = new StringBuilder("Volumes dos Cilindros");
        int numCilindros = 0;

        while(i.hasNext()){
            f = (Forma) i.next();
            if(f instanceof Cilindro){
                str.
                    append("\nCilindro ").
                    append(numCilindros + 1).
                    append(" = ").
                    append(String.format("%.2f", ((Cilindro) f).calculaVolume())).
                    append(" cm³");
                numCilindros++;
            }
        }
        return str.toString();
    }
}
