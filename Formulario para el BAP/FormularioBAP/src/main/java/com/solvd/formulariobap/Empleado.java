
package com.solvd.formulariobap;


import java.util.Scanner;
    
public class Empleado {
private Scanner teclado;
// Datos Personales
private String nombre;
private String apellido;
private int dni;
private String nacionalidad;
private String aniversario;
private int edad;
private String estadoCivil;
private String estudios;
private String nivelDeestudio;
private int ingresos;
public  String salud;
private String duerme;
private String almuerza;
private String tiempoEncalle;
private String extranjero;
// Subsidios o cobros
private String habitacional;
private String ciudadania;
private String auh;
private String discapacidad;
private String jubilacion;
private String changas;
// Cómo está de salud
public  String medicacion;
private String tratamiento;
private String diagnostico;
public  String nombreMedicacion;
// Derivaciones
private int derivacion;
private int contencion;
private int comuna;

public void inicializar() {
  
teclado = new Scanner(System.in);
   System.out.println("Este programa realizará el informe\n" + "de forma automática. Debe tener en cuenta" + "\nque no acepta espacios entre los campos a\n" + "completar.\n" + "Por ejemplo, si quiere escribir más de una\n" + "palabra. Debe hacerlo de la siguiente" + "\nmanera:");
   System.out.println();
   System.out.println("Lugar donde duerme:");
   System.out.println("Hospital-Pirovano / Hospital.Pirovano");
   System.out.println();
   System.out.println("Es decir que puede colocar guión del medio" + "\no un punto separando las palabras.");
   System.out.println("Una vez que haya colocado la respuesta\n"+ "presione ENTER para la siguiente pregunta");
   System.out.println();
   System.out.println("Completa el formulario");
   System.out.println();
   System.out.println("ingrese el nombre de la Persona: ");
   nombre = teclado.nextLine();
   System.out.println("ingrese el apellido:");
   apellido= teclado.nextLine();
   System.out.println("Ingrese el DNI:");
   dni= teclado.nextInt();
   System.out.println("Nacionalidad:");
   nacionalidad = teclado.next();
   System.out.println("ingrese la fecha de nacimiento:(DD/MM/AA)");
   aniversario= teclado.next();
   System.out.println("edad");
   edad= teclado.nextInt();
   System.out.println("Estado civil:");
   estadoCivil= teclado.next();
   System.out.println("Estudios cursados:");
   estudios= teclado.next();
   System.out.println("De acuerdo a la respuesta anterior:" + "\ncompleto, incompleto, cursando");
   nivelDeestudio= teclado.next();
   System.out.println("Sus ingresos:");
   ingresos = teclado.nextInt();
   System.out.println("Salud");
   salud= teclado.next();
  // if(salud !="buena" || salud !="Buena")
  boolean FlagBuena = false ;
  if(salud =="buena" || salud =="Buena")
  {
    FlagBuena = true;
  } else if(FlagBuena == false)
{
    System.out.println("Comente el problema o diagnóstico" +"\nEscriba sin utilizar la barra de espacio" + "\nPor ejemplo: Diagnóstico1/Diagnóstico2");
     diagnostico = teclado.nextLine();
     System.out.println("Toma medicación: Si/No");
     medicacion = teclado.nextLine();{}
   System.out.println("¿Cuál? Nombre del medicamento");
   nombreMedicacion = teclado.nextLine();
   System.out.println("Actualmente recibe tratamiento:Si/No");
   tratamiento = teclado.next(); 
  };
   System.out.println("Lugar adonde duerme:");
  duerme = teclado.nextLine();
  System.out.println("Lugar adónde come:");
  almuerza= teclado.next();
  System.out.println("Tiempo en calle:");
  tiempoEncalle = teclado.nextLine();
  System.out.println("Cobra subsidio habitacional: Si / No");
  habitacional = teclado.next();
  System.out.println("Cobra subsidio Ciudadanía Porteña: Si / No");
  ciudadania = teclado.next();
  System.out.println("Cobra subsidio AUH: Si / No");
  auh = teclado.next();
  System.out.println("Cobra subsidio Pensión por discapacidad: Si / No");
  discapacidad = teclado.next();
  System.out.println("Cobra jubilación: Si / No");
  jubilacion = teclado.next();
  System.out.println("Realiza changas: Si/No");
  changas = teclado.next();
  System.out.println("Que tipo de intervención se hizo:");
  System.out.println("Elija una opción y coloque el número\n" + "de la opción elegida");
  System.out.println("1-Derivación para subsidio habitacional");
  System.out.println("2-Derivación para Ciudadanía Porteña");
  System.out.println("3-Derivación para Nuestra familia");
  System.out.println("4-Derivación para comuna");
  System.out.println("5-Derivación a Parador");
  System.out.println("6-Derivación para Derecho a la identidad");
  derivacion = teclado.nextInt();
  System.out.println("En caso de haber la op4" + "\ncoloque el número de comuna");
  comuna = teclado.nextInt();
  System.out.println("Contención a modo de: \n1- Evaluación" + "\n2- Seguimiento");
  contencion = teclado.nextInt();
   };
  
   public void imprimír(){
   System.out.println();
   System.out.println("INFORME SOCIAL");
   System.out.println("");
   System.out.println("Producido por BAP");
   System.out.println("s/evaluación de " + nombre +" " + apellido);
   System.out.println();
     System.out.println("Se conecta a " + nombre + " " + apellido+  " DNI " + dni + " " + "\nquien ha nacido " + aniversario + " de " + edad + " años de edad," + "\nSu estado civil es " + estadoCivil);
     System.out.println("Quien se encuentra en situación de" + "\ncalle desde hace " + tiempoEncalle);
     System.out.println("De nacionalidad " + nacionalidad);
      System.out.println("Y su nivel de escolarización es ");
      if(nivelDeestudio.equals("completo")){
        System.out.println(estudios + " " + nivelDeestudio);
      } else if(nivelDeestudio.equals("incompleto")) {
        System.out.println(estudios + " " + nivelDeestudio);
      } else {
        System.out.println(estudios + " " + " en curso");
      };
      System.out.println("Sus ingresos son $ " + ingresos);
      if(salud.equals("Buena") ^ salud.equals("buena")){
      System.out.println("Y su salud es " + salud);
      } else {
        System.out.println(nombre +" "+ apellido + " comenta que su salud no es\n" + "buena ya que padece \n" + diagnostico);
         };
        if(medicacion.equals("si") | medicacion.equals(" Si")){System.out.println("Y para ello toma está medicación: " + nombreMedicacion);
     };
     if(tratamiento.equals("si") | tratamiento.equals(" Si")){System.out.println("Y para ello también se encuentra \n" + "actualmente bajo tratamiento");
     };    
       System.out.println("Suele dormir por la zona de \n" + duerme + " y come en \n" + almuerza);
      if(changas.equals("Si") | changas.equals("si")){
        System.out.println("Realiza changas que no le alcanza\n" + "a cubrir sus necesidades básicas");
      };
     if(habitacional.equals("Si") ^ habitacional.equals("si")){
     System.out.println("Cobra subsiodio habitacional");
     };
     if(ciudadania.equals("Si") ^ ciudadania.equals("si")){
     System.out.println("Cobra subsiodio de Ciudadanía Porteña");
     };
     if(auh.equals("Si") ^ auh.equals("si")){
     System.out.println("Cobra la asignación de AUH");
     };
     if(discapacidad.equals("Si") | discapacidad.equals("si")) {
       System.out.println("Cobra pensión por discapacidad");
     };
     if(jubilacion.equals("Si") | jubilacion.equals("si")) {
       System.out.println(nombre + " " + apellido + " cobra una jubilación");
     };
     System.out.println();
     System.out.println("Diagnóstico");
     System.out.println();
     System.out.println(nombre + " " + apellido + " quien se encuentra en \n" + "una situación de vulnerabilidad \n" + "socioeconómica, sin red de contención \n" + "vincular y en emergencia habitacional");
     System.out.println();
     System.out.println("Intervención");
     System.out.println();
     if(contencion == 1){
     System.out.println(nombre + " " + apellido + " DNI " + dni + " se le realizó \ncontención a modo de evaluación y");
     } else {
       System.out.println(nombre + " " + apellido + " DNI " + dni + " se le realizó \ncontención a modo de seguimiento y");
     };
     switch (derivacion){
       case   1:
       System.out.println("La persona fue derivada para ingresar \n" +"al programa de subsidio habitacional");
       break;
       case 2:
       System.out.println("La persona fue derivada para ingresar \n" +"al programa de subsidio Ciudadanía Porteña");
       break;
       case   3:
       System.out.println("La persona fue derivada para ingresar \n" +"al programa Nuestra familia");
       break;
       case  4:
       System.out.println("La persona fue derivada para realizar de \n" + "forma gratuita el trámite \n" + "para renovación del DNI \n" + "a la siguiente comuna: " + comuna);
       break;
       case 5:
       System.out.println("La persona fue derivada para realizar \n" +"el trámite gratuitamente de \n" + "Derecho a la identidad");
       break;
     };
     }

   
  
  
   }
