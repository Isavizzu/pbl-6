public class Calcado extends Vestuario {
    protected String tipoCalcado;
    protected int numero;

    public Calcado(String material, String cor, String marca, String preco, String forma, String genero, int estoque, String tipoCalcado, int numero){
        super(material, cor, marca, preco, forma, genero. estoque);
        this.tipoCalcado = tipoCalcado;
        this.numero = numero;
    }


    public String setTipoCalcado(){
        return  tipoCalcado;
    }
    
}
