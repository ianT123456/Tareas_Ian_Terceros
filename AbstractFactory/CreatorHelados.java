package AbstractMethod.AbstractFactory;

public class CreatorHelados {
    public enum typeHelados {
        HELADO_AGUA, HELADO_CREMA, HELADO_MIXTO
    }

    public static IHelado create(typeHelados type) {
        IHelado helado;
        switch (type) {
            case HELADO_AGUA:
                helado = new HeladoAgua();
                ((HeladoAgua) helado).setTamano("grande");
                ((HeladoAgua) helado).setForma("conica");
                ((HeladoAgua) helado).setFruta(new Fruta("Manzana","que pex","20bs","Pequenia"));
                break;
            case HELADO_CREMA:
                helado = new HeladoCrema();
                ((HeladoCrema) helado) .setCrema(new Crema("Frutilla","20bs","Panini"));
                ((HeladoCrema) helado).setForma("conica");
                ((HeladoCrema) helado).setFruta(new Fruta("Manzana","baron","30bs","gigante"));
                ((HeladoCrema) helado).setTamano("mediano");
                case HELADO_MIXTO:
                helado = new HeladoMixto();
                ((HeladoMixto) helado).setCrema(new Crema("bambi", "Naranja", "20 bs"));
                ((HeladoMixto) helado).setCosto("50bs");
                ((HeladoMixto) helado).setForma("Vaso");
                ((HeladoMixto) helado).setFruta(new Fruta("Platano","Cepillin","10bs","Enano"));
                ((HeladoMixto) helado).setTamano("Jumbo");
                default:
                helado = new HeladoAgua();


        }
        return helado;
    }
}
