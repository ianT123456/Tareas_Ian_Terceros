package Command;

public class Impala {
    private String nombreJugador;
    private int HP;
    private int DefensePoints;
    private int Level;
    private String punta;
    private String franco;
    private int dePunta;
    private int grancoPts;

    public enum ArmaMelee{
        LATIGO, EMPALAMIENTO, PALO;
    }

    public enum Carga {
        CEBO, LANZA, AK47;
    }

    public Impala(String nombreJugador, int HP, int defensePoints, int level) {
        this.nombreJugador = nombreJugador;
        this.HP = HP;
        DefensePoints = defensePoints;
        Level = level;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getDefensePoints() {
        return DefensePoints;
    }

    public void setDefensePoints(int defensePoints) {
        DefensePoints = defensePoints;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public String getPunta() {
        return punta;
    }

    public void setPunta(String punta) {
        this.punta = punta;
    }

    public String getFranco() {
        return franco;
    }

    public void setFranco(String franco) {
        this.franco = franco;
    }

    public int getDePunta() {
        return dePunta;
    }

    public int getGrancoPts() {
        return grancoPts;
    }

    public void setDePunta(ArmaMelee armaMelee) {
        switch (armaMelee){
            case LATIGO:
                this.dePunta =40;
                punta ="LATIGO";
                break;
            case PALO:
                this.dePunta =25;
                punta ="PALO";
                break;
            case EMPALAMIENTO:
                this.dePunta =15;
                punta ="INHERED IMPALA";
                break;
        }
    }

    public void setGrancoPts(Carga carga){
        switch (carga){
            case CEBO:
                this.grancoPts =40;
                franco ="CEBO";
                break;
            case LANZA:
                this.grancoPts =60;
                franco ="LANZA";
                break;
            case AK47:
                this.grancoPts =55;
                franco ="AK$&";
                break;
        }
    }


}
