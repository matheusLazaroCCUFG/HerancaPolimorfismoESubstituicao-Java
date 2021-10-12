import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Lista lista = new Lista();
        int opt;
        double raio, altura;
        Forma forma;

        while(true){
            System.out.println(
                "------------- Sistema de Formas Geométricas-------------------\n" +
                "Digite:\n1 - A forma é Círculo.\n2 - A forma é um Cilindro.\n" +
                "0 - para Sair.\n" +
                "--------------------------------------------------------------"
            );
            opt = scan.nextInt();

            if(opt == 1){
                System.out.print("Raio do Círculo em cm = ");
                raio = Double.parseDouble(scan.next());
                forma = new Circulo();
                forma.setRaio(raio);
                System.out.println(forma.toString());
                if (lista.add(forma)) {
                    System.out.println("Forma adicionada à lista com sucesso!");
                }else{
                    System.out.println("Erro ao criar adicionar a Forma");
                }
            }else
            if(opt == 2){
                System.out.print("Raio do Cilindro em cm = ");
                raio = Double.parseDouble(scan.next());
                System.out.print("Altura do Cilindro em cm = ");
                altura = Double.parseDouble(scan.next());

                forma = new Cilindro();
                forma.setRaio(raio);
                forma.setAltura(altura);
                System.out.println(forma.toString());
                if (lista.add(forma)) {
                    System.out.println("Forma adicionada à lista com sucesso!");
                }else{
                    System.out.println("Erro ao criar adicionar a Forma");
                }
            }else
            if(opt == 0){
                break;
            }else{
                System.out.println("Valor inválido!");
            }
        }

        System.out.println("Lista de Formas:");
        System.out.println(lista.mostraAreas());
        System.out.println(lista.mostraVolumes());
        System.out.print("\nQuantidade de Circulos = " + lista.qtdeCirculos() + "\n");
        System.out.print("Quantidade de Cilindros = " + lista.qtdeCilindros() + "\n");
    }
}
