public class ChocolateAmargo extends Chocolate {
    private int amargor;
 
    public ChocolateAmargo(String nome, int porcentagemCacau, double peso, int amargor) {
        super(nome, porcentagemCacau, peso);
        this.amargor = amargor;
    }
 


    public int getAmargor() {
        return amargor;
    }
    public void setAmargor(int amargor) {
        this.amargor = amargor;
    }
 

    //Sobrescritaaaa
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Nível de Amargor: " + amargor);
    }
}