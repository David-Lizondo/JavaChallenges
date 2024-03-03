package formulario_upgrade;

public class Subsidio {
    private boolean habitacional;
    private boolean ciudadania;
    private boolean auh;
    private boolean discapacidad;
    private boolean jubilacion;
    private boolean changas;

    public Subsidio() {
    }

    // Getters y setters

    public boolean isHabitacional() {
        return habitacional;
    }

    public void setHabitacional(boolean habitacional) {
        this.habitacional = habitacional;
    }

    public boolean isCiudadania() {
        return ciudadania;
    }

    public void setCiudadania(boolean ciudadania) {
        this.ciudadania = ciudadania;
    }

    public boolean isAuh() {
        return auh;
    }

    public void setAuh(boolean auh) {
        this.auh = auh;
    }

    public boolean isDiscapacidad() {
        return discapacidad;
    }

    public void setDiscapacidad(boolean discapacidad) {
        this.discapacidad = discapacidad;
    }

    public boolean isJubilacion() {
        return jubilacion;
    }

    public void setJubilacion(boolean jubilacion) {
        this.jubilacion = jubilacion;
    }

    public boolean isChangas() {
        return changas;
    }

    public void setChangas(boolean changas) {
        this.changas = changas;
    }
}
