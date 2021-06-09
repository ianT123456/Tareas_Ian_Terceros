package Command;

public class Shoot implements iComandosJuego {

    private Juego juego;

    public Shoot(Juego juego){this.juego=juego;}

    @Override
    public void execute() {
        System.out.println("Matrix sod");
        this.juego.setEscudoActivado(false);
        this.juego.disparar();
    }
}