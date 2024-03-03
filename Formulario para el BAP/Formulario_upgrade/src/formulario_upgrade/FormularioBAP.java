package formulario_upgrade;

import excepciones.FormularioException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FormularioBAP {
    private Scanner teclado;
    private Subsidio subsidio;
    private Persona persona;
    private Salud salud;
    private SituacionDiaria situacionDiaria;
    private List<Derivacion> derivaciones;
    private String observaciones;

    public FormularioBAP() {
        teclado = new Scanner(System.in);
        subsidio = new Subsidio();
        persona = new Persona();
        salud = new Salud();
        situacionDiaria = new SituacionDiaria();
        derivaciones = new ArrayList<>();
        observaciones = "";
    }

    public void iniciarFormulario() {
        try {
            llenarDatosPersonales();
            llenarSalud();
            llenarSubsidios();
            llenarSituacionDiaria();
            llenarDerivaciones();
            agregarObservaciones();
            imprimirInforme();
        } catch (FormularioException e) {
            System.out.println("Error en el formulario: " + e.getMessage());
        }
    }

    private void llenarDatosPersonales() {
        System.out.println("Ingrese los datos personales:");
        System.out.print("Nombre: ");
        persona.setNombre(teclado.nextLine());
        System.out.print("Apellido: ");
        persona.setApellido(teclado.nextLine());
        System.out.print("DNI: ");
        persona.setDni(leerEntero());
        System.out.print("Nacionalidad: ");
        persona.setNacionalidad(teclado.nextLine());
        System.out.print("Fecha de nacimiento (DD/MM/AA): ");
        persona.setFechaNacimiento(teclado.nextLine());
        System.out.print("Edad: ");
        persona.setEdad(leerEntero());
        System.out.print("Estado civil: ");
        persona.setEstadoCivil(teclado.nextLine());
        System.out.print("Estudios: ");
        persona.setEstudios(teclado.nextLine());
        System.out.print("Nivel de estudio (completo/incompleto/cursando): ");
        persona.setNivelEstudio(teclado.nextLine());
        System.out.print("Ingresos: ");
        persona.setIngresos(leerEntero());
    }

   private void llenarSalud() throws FormularioException {
    System.out.println("¿Cómo está de salud? (buena/mala)");
    salud.setEstadoSalud(teclado.nextLine());
    while (!salud.getEstadoSalud().equalsIgnoreCase("buena") && !salud.getEstadoSalud().equalsIgnoreCase("mala")) {
        System.out.println("Debe responder 'buena' o 'mala'. Inténtelo de nuevo:");
        salud.setEstadoSalud(teclado.nextLine());
    }
    if (!salud.getEstadoSalud().equalsIgnoreCase("buena")) {
        System.out.println("¿Está tomando alguna medicación? (si/no)");
        String respuesta = teclado.next();
        while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no")) {
            System.out.println("La respuesta debe ser 'si' o 'no'. Inténtelo de nuevo:");
            respuesta = teclado.next();
        }
        salud.setMedicacion(respuesta.equalsIgnoreCase("si") ? "si" : "no");
        if (salud.isMedicacion()) {
            System.out.print("Nombre de la medicación: ");
            salud.setNombreMedicacion(teclado.next());
        }
        System.out.print("Tratamiento: ");
        salud.setTratamiento(teclado.next());
        System.out.print("Diagnóstico: ");
        salud.setDiagnostico(teclado.next());
    }
}


    private void llenarSubsidios() throws FormularioException {
    System.out.println("Cobra subsidio habitacional: Si / No");
    subsidio.setHabitacional(leerRespuestaBooleana());
    System.out.println("Cobra subsidio Ciudadanía Porteña: Si / No");
    subsidio.setCiudadania(leerRespuestaBooleana());
    System.out.println("Cobra subsidio AUH: Si / No");
    subsidio.setAuh(leerRespuestaBooleana());
    System.out.println("¿Recibe subsidio por discapacidad? (Si/No)");
    subsidio.setDiscapacidad(leerRespuestaBooleana());
    System.out.println("¿Recibe jubilación? (Si/No)");
    subsidio.setJubilacion(leerRespuestaBooleana());
    System.out.println("¿Realiza changas? (Si/No)");
    subsidio.setChangas(leerRespuestaBooleana());
}

    private boolean leerRespuestaBooleana() {
        String respuesta;
        do {
            respuesta = teclado.next();
            if (respuesta.equalsIgnoreCase("si")) {
                return true;
            } else if (respuesta.equalsIgnoreCase("no")) {
                return false;
            } else {
                System.out.println("Por favor, responda con 'si' o 'no'.");
            }
        } while (true);
    }

    private void llenarSituacionDiaria() {
        System.out.println("Ingrese la situación diaria:");
        System.out.print("¿Duerme bien? (si/no): ");
        situacionDiaria.setDuerme(teclado.next());
        System.out.print("¿Almuerza adecuadamente? (si/no): ");
        situacionDiaria.setAlmuerza(teclado.next());
        System.out.print("¿Pasa tiempo encalle? (si/no): ");
        situacionDiaria.setTiempoEncalle(teclado.next());
    }

    private void llenarDerivaciones() throws FormularioException {
        boolean continuar = true;
        while (continuar) {
            try {
                Derivacion derivacion = new Derivacion();
                System.out.println("Que tipo de intervención se hizo:");
                System.out.println("Elija una opción y coloque el número\n" + "de la opción elegida");
                System.out.println("1-Derivación para subsidio habitacional");
                System.out.println("2-Derivación para Ciudadanía Porteña");
                System.out.println("3-Derivación para Nuestra familia");
                System.out.println("4-Derivación para comuna");
                System.out.println("5-Derivación a Parador");
                System.out.println("6-Derivación para Derecho a la identidad");
                System.out.print("Opción elegida: ");
                derivacion.setTipo(leerEntero());

                if (derivacion.getTipo() == 4) {
                    System.out.println("Coloque el número de comuna:");
                    derivacion.setComuna(leerEntero());
                }

                System.out.println("Contención a modo de: \n1- Evaluación\n2- Seguimiento");
                System.out.print("Contención: ");
                derivacion.setContencion(leerContencion());

                
                derivaciones.add(derivacion);

                System.out.println("¿Desea agregar otra derivación? (Si/No)");
                String respuesta = teclado.next();
                continuar = respuesta.equalsIgnoreCase("si");
            } catch (FormularioException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Debe colocar un número.");
                teclado.nextLine(); // Consumir la entrada no válida
            }
        }
    }

    private int leerEntero() {
                while (true) {
            String entrada = teclado.nextLine();
            if (isNumeric(entrada)) {
                return Integer.parseInt(entrada);
            } else {
                System.out.println("Debe colocar un número.");
            }
        }
    }

    private int leerContencion() {
        while (true) {
            String entrada = teclado.nextLine();
            if (entrada.equals("1") || entrada.equals("2")) {
                return Integer.parseInt(entrada);
            } else {
                System.out.println("Debe seleccionar 1 para 'Evaluación' o 2 para 'Seguimiento'.");
            }
        }
    }

    private boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

   private void agregarObservaciones() {
    System.out.println("¿Desea agregar observaciones al formulario? (Si/No)");
    if (teclado.next().equalsIgnoreCase("si")) {
        teclado.nextLine(); // Consumir el salto de línea pendiente
        System.out.print("Observaciones: ");
        observaciones = teclado.nextLine();
    }
}

private void imprimirInforme() {
    System.out.println("========== Informe del Formulario ==========");
    System.out.println("Datos Personales:");
    persona.imprimirDatosPersonales();
    System.out.println("\nDatos de Salud:");
    salud.imprimirDatosSalud();
    System.out.println("\nSubsidios:");
    System.out.println("Subsidio Habitacional: " + (subsidio.isHabitacional() ? "Sí" : "No"));
    System.out.println("Subsidio Ciudadanía Porteña: " + (subsidio.isCiudadania() ? "Sí" : "No"));
    System.out.println("Subsidio AUH: " + (subsidio.isAuh() ? "Sí" : "No"));
    System.out.println("Subsidio por discapacidad: " + (subsidio.isDiscapacidad() ? "Sí" : "No"));
    System.out.println("Recibe jubilación: " + (subsidio.isJubilacion() ? "Sí" : "No"));
    System.out.println("Realiza changas: " + (subsidio.isChangas() ? "Sí" : "No"));
    // Agregar más impresiones de subsidios si es necesario
    System.out.println("\nDerivaciones:");
    for (int i = 0; i < derivaciones.size(); i++) {
        Derivacion derivacion = derivaciones.get(i);
        System.out.println("Derivación " + (i + 1) + ":");
        System.out.println("Tipo: " + derivacion.getTipo());
        if (derivacion.getTipo() == 4) {
            System.out.println("Comuna: " + derivacion.getComuna());
        }
        System.out.println("Contención: " + (derivacion.getContencion() == 1 ? "Evaluación" : "Seguimiento"));
        
    }
    if (!observaciones.isEmpty()) {
        System.out.println("\nObservaciones generales:");
        System.out.println(observaciones);
    }
    System.out.println("===========================================");
}    
}
