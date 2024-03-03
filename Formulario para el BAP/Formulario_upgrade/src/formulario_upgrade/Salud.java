package formulario_upgrade;

import excepciones.FormularioException;
import java.util.Scanner;

public class Salud {
    private String estadoSalud;
    private String medicacion;
    private String tratamiento;
    private String diagnostico;
    private String nombreMedicacion;

    public Salud() {
        estadoSalud = "";
        medicacion = "";
        tratamiento = "";
        diagnostico = "";
        nombreMedicacion = "";
    }

    public String getEstadoSalud() {
        return estadoSalud;
    }

    public void setEstadoSalud(String estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    public String getMedicacion() {
        return medicacion;
    }

    public void setMedicacion(String medicacion) {
        this.medicacion = medicacion;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getNombreMedicacion() {
        return nombreMedicacion;
    }

    public void setNombreMedicacion(String nombreMedicacion) {
        this.nombreMedicacion = nombreMedicacion;
    }

    public void llenarSalud(String estadoSalud, Scanner teclado) throws FormularioException {
        this.estadoSalud = estadoSalud;
        if (!estadoSalud.equalsIgnoreCase("buena")) {
            System.out.println("¿Está tomando alguna medicación? (si/no)");
            String respuesta = teclado.next();
            if (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
                throw new FormularioException("La respuesta debe ser 'si' o 'no'");
            }
            if (respuesta.equalsIgnoreCase("si")) {
                System.out.print("Nombre de la medicación: ");
                nombreMedicacion = teclado.next();
            }
            System.out.print("Tratamiento: ");
            tratamiento = teclado.next();
            System.out.print("Diagnóstico: ");
            diagnostico = teclado.next();
        }
    }

    public void imprimirDatosSalud() {
        System.out.println("Estado de salud: " + estadoSalud);
        if (!estadoSalud.equalsIgnoreCase("buena")) {
            System.out.println("Nombre de la medicación: " + nombreMedicacion);
            System.out.println("Tratamiento: " + tratamiento);
            System.out.println("Diagnóstico: " + diagnostico);
        }
    }

    public boolean isMedicacion() {
        return !nombreMedicacion.isEmpty();
    }

    public void editarMedicacion(Scanner teclado) {
        if (isMedicacion()) {
            System.out.println("El nombre actual del medicamento es: " + nombreMedicacion);
            System.out.println("¿Desea modificar el nombre del medicamento? (Si/No)");
            String modificar = teclado.next();
            if (modificar.equalsIgnoreCase("si")) {
                System.out.print("Nuevo nombre del medicamento: ");
                nombreMedicacion = teclado.next();
            }
        } else {
            System.out.println("No hay medicación registrada para editar.");
        }
    }
}
