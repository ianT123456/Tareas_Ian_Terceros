package AbstractMethod.AbstractFactory;

public class Client {
    public  static void main (String[]args){
     HeladoCrema h1= (HeladoCrema) CreatorHelados.create(CreatorHelados.typeHelados.HELADO_CREMA);
     h1.crear();
     HeladoMixto hm1= (HeladoMixto) CreatorHelados.create(CreatorHelados.typeHelados.HELADO_MIXTO);
     hm1.crear();
     HeladoAgua ha1=(HeladoAgua) CreatorHelados.create(CreatorHelados.typeHelados.HELADO_AGUA);
     ha1.crear();



    }
}
