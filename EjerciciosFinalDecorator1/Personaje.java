package EjerciciosFinalDecorator1;

public class Personaje implements IPersonaje {
    private String nombre;
    private int nivel;
    private String armas;
    private int valorArmadura;
    private int valorDefensa;
    private int valorAtaque;
    private int valorRegeneracion;

    public Personaje(String nombre) {
        this.nombre = nombre;
        nivel = 1;
        armas = "";
        valorArmadura = 1;
        valorDefensa = 1;
        valorAtaque = 1;
        valorRegeneracion = 1;
    }

    @Override
    public String nombre() {
        return nombre;
    }

    @Override
    public int nivel() {
        return nivel;
    }

    @Override
    public void AumentarNivel(int niveles) {
        nivel += niveles;
    }

    @Override
    public String armas() {
        return armas;
    }

    @Override
    public void equiparArma(String arma) {
        this.armas = arma;
    }

    @Override
    public int valorArmadura() {
        return this.valorArmadura;
    }

    @Override
    public int puntosAtaque() {
        return this.valorAtaque;
    }

    @Override
    public int puntosDefensa() {
        return this.valorDefensa;
    }

    @Override
    public int puntosRegeneracion() {
        return this.valorRegeneracion;
    }

    @Override
    public void aumentarArmadura(int porcentaje) {
        this.valorArmadura += porcentaje;

    }

    @Override
    public void aumentarAtaque(int puntos) {
        this.valorAtaque += puntos;

    }

    @Override
    public void aumentarDefensa(int puntos) {
        this.valorDefensa += puntos;
    }

    @Override
    public void IncrementarRegeneracion(int puntos) {
        this.valorRegeneracion += puntos;

    }

    @Override
    public void info() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        if (!armas.isEmpty()) {
            System.out.println("Equipamiento: " + armas);
        } else {
            System.out.println("Sin equipamiento");
        }
        System.out.println("Valor de armadura: " + valorArmadura);
        System.out.println("Valor defensa: " + valorDefensa);
        System.out.println("Valor ataque: " + valorAtaque);
        System.out.println("Valor regeneracion: " + valorRegeneracion);

    }

}