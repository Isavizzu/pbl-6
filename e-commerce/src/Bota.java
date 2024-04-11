public class Bota extends Calcado{
    private boolean salto;
    private int tamanhoCano;

    public Roupa(String material, String cor, String marca, String preco, String forma, String genero, int estoque, String tipoCalcado, int numero, boolean salto, float tamanhoCano){
        super(material, cor, marca, preco, forma, genero, estoque, tipoCalcado, numero);
        this.salto = salto;
        this.tamanhoCano = tamanhoCano;
    }

    public boolean setSalto(){
        return  salto;
    }

    public int setTamanhoCano(){
        return tamanhoCano;
    }

    public void estoque(){
        if (salto == true ) {
            System.out.println("Há " + setEstoque() + " calçados de " + setTipoCalcado() + ", com salto no estoque!");
        }
        else {
            System.out.println("Há " + setEstoque() + " calçados de " + setTipoCalcado() + ", sem salto no estoque!");
        }
    }


}
