package EjerciciosFinalDecorator1;

public interface IPersonaje {
    public String nombre();

    public int nivel();

    public void AumentarNivel(int niveles);

    public String armas();

    public void equiparArma(String arma);

    public int valorArmadura();

    public void aumentarArmadura(int porcentaje);

    public int puntosAtaque();

    public void aumentarAtaque(int puntos);

    public int puntosDefensa();

    public void aumentarDefensa(int puntos);

    public int puntosRegeneracion();

    public void IncrementarRegeneracion(int puntos);

    public void info();

}