public class ParteSuperior extends Roupa{
    private String decote;
    private boolean gola;
    private boolean manga;

    public ParteSuperior(String material, String cor, String marca, String preco, String forma, String genero,
                         String tipoRoupa, String estampa, String tipoComprimento,
                         String decote, boolean gola, boolean manga){
        super(material, cor, marca, preco, forma, genero, tipoRoupa, estampa, tipoComprimento);
        this.decote = decote;
        this.gola = gola;
        this.manga = manga;
    }

}
