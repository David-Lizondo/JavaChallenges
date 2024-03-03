package formulario_upgrade;

public class Persona {
    private String nombre;
    private String apellido;
    private int dni;
    private String nacionalidad;
    private String fechaNacimiento;
    private int edad;
    private String estadoCivil;
    private String estudios;
    private String nivelEstudio;
    private int ingresos;

    public Persona() {}
    public String getNombre() {
        return nombre;
    }
   
    // Getters y setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    public String getNivelEstudio() {
        return nivelEstudio;
    }

    public void setNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

    public int getIngresos() {
        return ingresos;
    }

   
    public void setIngresos(int ingresos) {
        this.ingresos = ingresos;
    }
    
    
    // Métodos para imprimir los datos de la persona
    public void imprimirDatosPersonales() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("DNI: " + dni);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("Edad: " + edad);
        System.out.println("Estado civil: " + estadoCivil);
        System.out.println("Estudios: " + estudios);
        System.out.println("Nivel de estudio: " + nivelEstudio);
        System.out.println("Ingresos: " + ingresos);
    }

    
}
