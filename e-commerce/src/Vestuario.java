public class Vestuario {
    private String material;
    private String cor;
    private String marca;
    private String preco;
    private String forma;
    private String genero;
    private int estoque;

    public Vestuario(String material, String cor, String marca, String preco, String forma, String genero, int estoque) {
        this.material = material;
        this.cor = cor;
        this.marca = marca;
        this.preco = preco;
        this.forma = forma;
        this.genero = genero;
        this.estoque = estoque;
    }

    public int getEstoque() {
        return estoque;
    }

    public String getPreco() {
        return preco;
    }

    public String getMaterial() {
        return material;
    }

    public String getForma() {
        return forma;
    }

    public String getGenero() {
        return genero;
    }

    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    public void descricao(){
        String espaco = "-------------------------";
        System.out.println(espaco);
        System.out.println("         Descrição        ");
        System.out.println(espaco);
        System.out.println("Cor: "+ getCor()+
                "\nMarca: "+ getMarca()+
                "\nPreço: "+ getPreco()+
                "\nForma: "+ getForma()+
                "\nGênero: "+ getGenero()+
                "\nEstoque: "+ getEstoque()+
                "\nMaterial: "+ getMaterial());
    }
}



