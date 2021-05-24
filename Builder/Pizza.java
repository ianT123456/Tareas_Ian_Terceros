package PresentacionEjercicios.Builder;

public class Pizza {
    private String ingredientes;
    private String tipoMasa;
    private String tipoQueso;

    public Pizza(){}

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        ingredientes = ingredientes;
    }

    public String getTipoMasa() {
        return tipoMasa;
    }

    public void setTipoMasa(String tipoMasa) {
        this.tipoMasa = tipoMasa;
    }

    public String getTipoQueso() {
        return tipoQueso;
    }

    public void setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
    }

}
