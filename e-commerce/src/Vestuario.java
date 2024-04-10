public class Vestuario {
    private String material;
    private String cor;
    private String marca;
    private String preco;
    private String forma;
    private String genero;
    private int estoque;
    public Vestuario(String material, String cor, String marca, String preco, String forma, String genero, int estoque){
        this.material = material;
        this.cor = cor;
        this.marca = marca;
        this.preco = preco;
        this.forma = forma;
        this.genero = genero;
        this.estoque = estoque;
    }

    public int setEstoque(){
        return estoque;
    }
    public String setPreco(){
        return preco;
    }
}
