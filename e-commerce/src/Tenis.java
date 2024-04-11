public class Tenis extends Calcado{
    private boolean cadarco;
    private float tamanhoPlataforma;

    public Roupa(String material, String cor, String marca, String preco, String forma, String genero, int estoque, String nome, int numero, boolean cadarco, float tamanhoPlataforma){
        super(material, cor, marca, preco, forma, genero, estoque, nome, numero);
        this.cadarco = cadarco;
        this.tamanhoPlataforma = tamanhoPlataforma;
    }

}
