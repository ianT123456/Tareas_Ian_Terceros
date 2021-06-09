package Command;

public class Attack implements iComandosJuego {

    private Juego juego;

    public Attack(Juego juego){this.juego=juego;}

    @Override
    public void execute() {
        System.out.println("Puntazo");
        this.juego.setEscudoActivado(false);
        this.juego.atacar();
    }
}