package Command;

public class Juego {
    private Impala jugador;
    private Antagonista enemigo;



    private boolean escudoActivado;
    private int gunHitTimes;

    public Juego(Impala jugador, Antagonista enemigo) {
        this.jugador=jugador;
        this.enemigo=enemigo;
    }

    public Impala getJugador() {
        return jugador;
    }

    public void setJugador(Impala jugador) {
        this.jugador = jugador;
    }

    public Antagonista getEnemigo() {
        return enemigo;
    }

    public void setEnemigo(Antagonista enemigo) {
        this.enemigo = enemigo;
    }

    public boolean isEscudoActivado() {
        return escudoActivado;
    }

    public void setEscudoActivado(boolean escudoActivado) {
        this.escudoActivado = escudoActivado;
    }

    public int getGunHitTimes() {
        return gunHitTimes;
    }

    public void setGunHitTimes(int gunHitTimes) {
        this.gunHitTimes = gunHitTimes;
    }



    public int damagePointsDealt(String type){
        int deal=0;
        if (type.equals("Punta")){
            deal=this.jugador.getDePunta();
        } else if (type.equals("Dabest")){
            deal=this.jugador.getGrancoPts();
        }
        int total=(this.jugador.getLevel()*deal*((int)(0.3*deal)-(int)(0.50*enemigo.getDefensePoints())))/enemigo.getDefensePoints();
        return total;
    }


    public void atacar(){
        System.out.println(jugador.getNombreJugador()+" consumed "+jugador.getPunta()+" against ");
        enemigo.setHP(enemigo.getHP()-damagePointsDealt("Punta"));
        System.out.println (damagePointsDealt("Punta")+" given");
        this.showPlayerStats();
        this.showEnemyStats();
        this.check();
    }

    public void defenderse(){
        int damageReceived=enemigo.getPower()-jugador.getDefensePoints();
        jugador.setHP(jugador.getHP()-damageReceived);
        System.out.println(jugador.getNombreJugador());
        System.out.println(jugador.getNombreJugador()+" - "+damageReceived);
        this.showPlayerStats();
        this.showEnemyStats();
        this.check();
    }

    public void disparar(){
        this.gunHitTimes=2+(int)(Math.random()*((7-2)+1));
        System.out.println(jugador.getNombreJugador()+"consumed "+jugador.getFranco()+" against ");
        System.out.println(this.gunHitTimes);
        enemigo.setHP(enemigo.getHP()-damagePointsDealt("range")*this.gunHitTimes);
        System.out.println (damagePointsDealt("dabest")*this.gunHitTimes+" given ");
        this.showPlayerStats();
        this.showEnemyStats();
        this.check();
    }

    public void check(){
        if (jugador.getHP()<=0){
            System.out.println("EINHALH");
            System.exit(0);
        } else if (enemigo.getHP()<=0){
            System.out.println("SOlido");
            System.exit(0);
        }
    }


    public void showPlayerStats() {
        System.out.println(jugador.getNombreJugador()+"NVL"+jugador.getLevel());
        System.out.println("HP: "+jugador.getHP()+"Escudo"+jugador.getDefensePoints());
        System.out.println("Punta "+jugador.getPunta()+ "(Attack: "+jugador.getDePunta()+")");
        System.out.println("Fire "+jugador.getFranco()+ "(Attack: "+jugador.getGrancoPts()+")");
        System.out.println("Whit escodo "+escudoActivado);
        System.out.println("--");
    }
    public void showEnemyStats() {
        System.out.println(enemigo.getNombreEnemigo()+" NVL "+enemigo.getLevel());
        System.out.println("L "+enemigo.getHP()+"escodo "+enemigo.getDefensePoints());
        System.out.println("GIven "+enemigo.getPower());
    }
}