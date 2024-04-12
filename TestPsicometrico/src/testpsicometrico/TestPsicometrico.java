package testpsicometrico;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestPsicometrico {

    private final String preguntas[];
    private final String mensajeDeIntroduccion;
    private final String almacenamientoDeRespuestas[];
    private final Scanner input;
    private final String opcionA;
    private final String opcionB;

    public TestPsicometrico() {
        
        this.preguntas = new String[]{
            "1.En general, te encuentras como rodeado de gente.",
            "2.Piensas que los demás te critican.",
            "3. Ante un hecho importante como un examen, exposición etc., te pones muy nervioso(a) y te duele el estómago.",
            "4. En ocasiones dejas para mañana lo que puedas hacer hoy.",
            "5. Te gusta que los demás estén atentos a lo que dices o haces.",
            "6.Sueles estar callado con personas pocos conocidas en el plantel donde estudias.",
            "7.Crees que las personas en donde estudias suelen aprovecharse de tu buena fe.",
            "8. A veces no sientes ánimos de asistir a clases.",
            "9. Crees que los demás nunca dan importancia a las cosas que haces o expresas.", 
            "10.Te preocupa mucho que los demás puedan pensar en ti.",
            "11.Te gusta hacer amigos en tu plantel educativo.",
            "12.Crees, que puedes sobresalir en todas las materias y proyectos.",
            "13.Alguna vez has evitado saludar a alguien (cambiando de lugar o haciendo ver que no la has visto).",
            "14.Te distraes con relativa frecuencia cuando estas en clase o expocision,etc.",
            "15.Cuando alguien hace algo que consideras que está mal, se lo dices sin tapujos."
        };
        
        this.mensajeDeIntroduccion = """
                                     
                                     
                                     Test de prueba de sociabilidad Estudiantil.
                                     
                                     
                                     Para responder a este cuestionario debes hacerlo sin prisas,
                                     en un ambiente relajado y tranquilo, a poder ser en silencio, 
                                     leyendo atentamente cada pregunta las veces que haga falta.
                                     
                                     Todas las preguntas deben responderse, y aunque no consideres
                                     la respuesta exacta al 100%, has de anotar aquella que mas
                                     se acerque a la realidad. 
                                     
                                     A la hora de responder al cuestionario debes saber que no existen
                                     respuestas correctas o incorrectas, ya que cada uno de nosotros tiene
                                     una personalidad y unos intereses distintos, ademas vemos las
                                     cosas de diferente manera y no estamos emitiendo ningun juicio de valor. 
                                     
                                     Las respuestas son validas, siempre que estas expresen lo que realmente pensamos y sentimos.
                                     """;
        
        this.almacenamientoDeRespuestas = new String[this.preguntas.length];
        this.opcionA = "1) Verdadero";
        this.opcionB = "2) Falso";
        this.input = new Scanner(System.in);
        
    }
  
    public void play() {
        
        int opcionUsuario = 0;
        
        inicio:
        while(opcionUsuario != 2) {

            try {
                System.out.println("""
                           Bienvenido al test de Prueba de Sociabilidad
                           1) Iniciar test
                           2) Salir
                """);
                
                opcionUsuario = input.nextInt();
                
                switch(opcionUsuario) {

                    case 1 -> {
                        iniciarTest();
                        break;
                    } case 2 -> {
                        System.out.println("\nHasta luego :)");
                        break;
                    } default -> {
                        System.out.println("\nSeleccione una opcion valida!\n");
                        break;
                    }
                }
            } catch(InputMismatchException e) {
                System.out.println("""
                                   -----------------------------
                                  | INGRESA SOLO DATOS NUMERICOS |
                                   -----------------------------
                                   """);
            } finally { 
                input.nextLine();
            }
        }
    }
    
    private void iniciarTest() {
        
        System.out.println(this.mensajeDeIntroduccion);
            
        int opcionSeleccionadaPorUsuario;
        inicio:
        for (int i = 0; i < this.preguntas.length; i++) {
            System.out.println("\n" + this.preguntas[i]);
            System.out.println(this.opcionA);
            System.out.println(this.opcionB);
            try {
                opcionSeleccionadaPorUsuario = input.nextInt();
                
                if(opcionSeleccionadaPorUsuario != 1 && opcionSeleccionadaPorUsuario != 2) {
                System.out.println("\nSeleccione una opcion valida\n");
                i--;
                } else {
                    if(opcionSeleccionadaPorUsuario == 1) this.almacenamientoDeRespuestas[i] = this.opcionA;
                    else this.almacenamientoDeRespuestas[i] = this.opcionB;
                }
            } catch(InputMismatchException e) {
                System.out.println("""
                                   -----------------------------
                                  | INGRESA SOLO DATOS NUMERICOS |
                                   -----------------------------
                                   """);
                i--;
            } finally {
                input.nextLine();                
            }
        }
        
        System.out.println("\nA continuacion se mostraran tus respuestas ingresadas:\n");
        
        for(int i = 0; i < this.preguntas.length; i++) {
            System.out.println("\n" + this.preguntas[i]);
            System.out.println("Tu respuesta: " + this.almacenamientoDeRespuestas[i] + "\n");
        }
    }
}
