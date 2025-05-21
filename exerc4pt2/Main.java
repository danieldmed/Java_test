import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Chocolate> chocolates = new ArrayList<>();
 
        chocolates.add(new ChocolateAoLeite("ao leite classico", 45, 100.0, "Integral"));
        chocolates.add(new ChocolateAmargo("amargo intenso", 80, 90.0, 7));
        chocolates.add(new ChocolateAoLeite("ao leite cremoso", 40, 120.0, "Condensado"));
        chocolates.add(new ChocolateAmargo("amargo premium", 90, 85.0, 9));
 
        for (Chocolate choco : chocolates) {
            choco.exibirInformacoes();
            System.out.println();
        }
 
        System.out.println("Detalhado:");
        ChocolateAoLeite leiteDetalhado = new ChocolateAoLeite("Leite Especial", 50, 110.0, "Desnatado");
        leiteDetalhado.exibirInformacoes(true);
    }
}