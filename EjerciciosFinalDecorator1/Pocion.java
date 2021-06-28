package EjerciciosFinalDecorator1;

public class Pocion implements IPersonaje {
    IPersonaje personaje;

    public Pocion(IPersonaje personaje) {
        this.personaje = personaje;
        this.IncrementarRegeneracion(80);
    }

    @Override
    public String nombre() {

        return personaje.nombre();
    }

    @Override
    public int nivel() {
        return personaje.nivel();
    }

    @Override
    public void AumentarNivel(int niveles) {
        personaje.AumentarNivel(niveles);

    }

    @Override
    public String armas() {
        return personaje.armas();
    }

    @Override
    public void equiparArma(String arma) {
        personaje.AumentarNivel(personaje.nivel());

    }

    @Override
    public int valorArmadura() {
        return personaje.valorArmadura();
    }

    @Override
    public void aumentarArmadura(int porcentaje) {
        personaje.aumentarArmadura(porcentaje);
    }

    @Override
    public int puntosAtaque() {
        return personaje.puntosAtaque();
    }

    @Override
    public void aumentarAtaque(int puntos) {
        personaje.aumentarAtaque(puntos);
    }

    @Override
    public int puntosDefensa() {
        return personaje.puntosDefensa();
    }

    @Override
    public void aumentarDefensa(int puntos) {
        personaje.aumentarDefensa(puntos);
    }

    @Override
    public int puntosRegeneracion() {
        return personaje.puntosRegeneracion();
    }

    @Override
    public void IncrementarRegeneracion(int puntos) {
        personaje.IncrementarRegeneracion(puntos);
    }

    @Override
    public void info() {
        System.out.println("Pocion adquirida");
        personaje.info();
    }

}
