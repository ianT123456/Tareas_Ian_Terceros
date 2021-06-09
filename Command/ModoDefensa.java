package Command;

public class ModoDefensa implements iComandosJuego {

    private Juego juego;

    public ModoDefensa(Juego juego){this.juego=juego;}

    @Override
    public void execute() {
        System.out.println("Escudo");
        this.juego.setEscudoActivado(true);
        this.juego.defenderse();
    }
}