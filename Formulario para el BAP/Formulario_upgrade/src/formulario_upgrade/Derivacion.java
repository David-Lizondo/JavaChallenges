package formulario_upgrade;

import excepciones.FormularioException;

public class Derivacion {
    private int tipo;
    private int comuna;
    private int contencion;
    private String observaciones;

    public Derivacion() {
        this.observaciones = "";
    }

    public Derivacion(int tipo, int comuna, int contencion, String observaciones) {
        this.tipo = tipo;
        this.comuna = comuna;
        this.contencion = contencion;
        this.observaciones = observaciones;
    }

    // Getters y setters

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) throws FormularioException {
        if (tipo < 1 || tipo > 6) {
            throw new FormularioException("El tipo de derivación debe ser un número entre 1 y 6.");
        }
        this.tipo = tipo;
    }

    public int getComuna() {
        return comuna;
    }

    public void setComuna(int comuna) throws FormularioException {
        if (comuna < 1 || comuna > 15) {
            throw new FormularioException("El número de comuna debe estar entre 1 y 15.");
        }
        this.comuna = comuna;
    }

    public int getContencion() {
        return contencion;
    }

    public void setContencion(int contencion) throws FormularioException {
        if (contencion != 1 && contencion != 2) {
            throw new FormularioException("El valor de contención debe ser 1 para 'Evaluación' o 2 para 'Seguimiento'.");
        }
        this.contencion = contencion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

}
