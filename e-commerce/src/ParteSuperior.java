public class ParteSuperior extends Roupa{
    private String decote;
    private boolean gola;
    private boolean manga;

    public ParteSuperior(String material, String cor, String marca, String preco, String forma, String genero, int estoque,
                         String tipoRoupa, String estampa, String tipoComprimento,
                         String decote, boolean gola, boolean manga){
        super(material, cor, marca, preco, forma, genero, estoque, tipoRoupa, estampa, tipoComprimento);
        this.decote = decote;
        this.gola = gola;
        this.manga = manga;
    }
    public void estoque(){
        if (manga == true && gola == true) {
            System.out.println("Há " + setEstoque() + " peças de " + setTipoRoupa() + ", com o decote de tipo:" +
                    decote + " e com gola e mangas, no estoque!");
        }
        else if (manga){
            System.out.println("Há " + setEstoque() + " peças de " + setTipoRoupa() + ", com o decote de tipo:" +
                    decote + " e sem gola, mas com mangas, no estoque!");
        }
        else if (gola){
            System.out.println("Há " + setEstoque() + " peças de " + setTipoRoupa() + ", com o decote de tipo:" +
                    decote + " e com gola, mas sem mangas, no estoque!");
        }
        else {
            System.out.println("Há " + setEstoque() + " peças de " + setTipoRoupa() + ", com o decote de tipo:" +
                    decote + " e sem gola e sem mangas, no estoque!");
        }
    }

}
