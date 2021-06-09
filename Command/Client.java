package Command;

public class Client {
    public static void main(String[]args){
        Juego juego=new Juego(new Impala("Tilin",300,100,100),new Antagonista("Esternocleidomastoideo",4000,2000,200,40));
        juego.getJugador().setDePunta(Impala.ArmaMelee.LATIGO);
        juego.getJugador().setGrancoPts(Impala.Carga.LANZA);


        Attack atacar=new Attack(juego);
        ModoDefensa defenderse=new ModoDefensa(juego);
        Shoot disparar=new Shoot(juego);
        ModoDefensa defenderse1=new ModoDefensa(juego);

        LaunchMoveset launchMoveset=new LaunchMoveset();
        launchMoveset.ingresaComando(atacar);
        launchMoveset.ingresaComando(defenderse);
        launchMoveset.ingresaComando(disparar);
        launchMoveset.ingresaComando(defenderse1);

        launchMoveset.ejecutarElMoveset();
    }
}
