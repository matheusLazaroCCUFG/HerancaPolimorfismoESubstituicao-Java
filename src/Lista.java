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
     * @param forma
     * @return
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
        String areas = "Áreas das formas";
        int numCirculos = 0;
        int numCilindros = 0;

        Iterator<Forma> i = forma.iterator();
        Forma f;

        while(i.hasNext()){
            f = (Forma) i.next();
            if(f instanceof Circulo){
                areas += "\nÁrea do Círculo "+ (numCirculos+1) + " = " +  String.format("%.2f", f.calculaArea()) + " cm²";
                numCirculos++;
            }
            if(f instanceof Cilindro){
                areas += "\nÁrea do Cilindro "+ (numCilindros+1) + " = " +  String.format("%.2f", f.calculaArea()) + " cm²";
                numCilindros++;
            }
        }
        return areas;
    }

    public String mostraVolumes(){
        Iterator<Forma> i = forma.iterator();
        Forma f;
        String str = "Volumes dos Cilindros";
        int numCilindros = 0;

        while(i.hasNext()){
            f = (Forma) i.next();
            if(f instanceof Cilindro){
                str += "\nCilindro " + (numCilindros+1) + " = " + String.format("%.2f", ((Cilindro) f).calculaVolume()) + " cm³";
                numCilindros++;
            }
        }
        return str;
    }
}
