package formulario_upgrade;

public class SituacionDiaria {
    private String duerme;
    private String almuerza;
    private String tiempoEncalle;

    public SituacionDiaria() {
    }

    public SituacionDiaria(String duerme, String almuerza, String tiempoEncalle) {
        this.duerme = duerme;
        this.almuerza = almuerza;
        this.tiempoEncalle = tiempoEncalle;
    }

    public String getDuerme() {
        return duerme;
    }

    public void setDuerme(String duerme) {
        this.duerme = duerme;
    }

    public String getAlmuerza() {
        return almuerza;
    }

    public void setAlmuerza(String almuerza) {
        this.almuerza = almuerza;
    }

    public String getTiempoEncalle() {
        return tiempoEncalle;
    }

    public void setTiempoEncalle(String tiempoEncalle) {
        this.tiempoEncalle = tiempoEncalle;
    }
}
