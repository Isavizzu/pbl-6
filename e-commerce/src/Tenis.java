public class Tenis extends Calcado{
    private boolean cadarco;
    private float tamanhoPlataforma;

    public Roupa(String material, String cor, String marca, String preco, String forma, String genero, int estoque, String tipoCalcado, int numero, boolean cadarco, float tamanhoPlataforma){
        super(material, cor, marca, preco, forma, genero, estoque, tipoCalcado, numero);
        this.cadarco = cadarco;
        this.tamanhoPlataforma = tamanhoPlataforma;
    }

    public void estoque(){
        if (cadarco == true ) {
            System.out.println("Há " + setEstoque() + " calçados de " + setTipoCalcado() + ", com cardaço no estoque!");
        }
        else {
            System.out.println("Há " + setEstoque() + " calçados de " + setTipoCalcado() + ", sem cardaço no estoque!");
        }
    }

}
