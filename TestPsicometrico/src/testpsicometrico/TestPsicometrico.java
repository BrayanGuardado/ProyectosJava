package testpsicometrico;
import javax.swing.*;

public class TestPsicometrico {

    public String preguntas[];
    public String mensajeDeIntroduccion;
    private int iteracionPreguntas = 0;
    private int contadorVerdadero = 0;
    private int contadorFalso = 0;
    private final JLabel labelPreguntas;
    private final JButton btnSiguiente;
    private final JRadioButton opcionABoton;
    private final JRadioButton opcionBBoton;
    private final ButtonGroup grupoDeBotones;
    private final JLabel seleccionVerdadero;
    private final JLabel seleccionFalso;
    private final JLabel porcentaje;
    private final JLabel nivelSocial;
            
    public TestPsicometrico( JLabel labelPreguntas, JRadioButton opcionA, 
            JRadioButton opcionB, ButtonGroup grupoDeBotones, JButton btnSiguiente, JFrame formularioPreguntas, 
                JLabel seleccionVerdadero, JLabel seleccionFalso, JLabel porcentaje, JLabel nivelSocial) {
        
        this.labelPreguntas = labelPreguntas;
        this.opcionABoton = opcionA;
        this.opcionBBoton = opcionB;
        this.grupoDeBotones = grupoDeBotones;
        this.btnSiguiente = btnSiguiente;
        this.seleccionVerdadero = seleccionVerdadero;
        this.seleccionFalso = seleccionFalso;
        this.porcentaje = porcentaje;
        this.nivelSocial = nivelSocial;
        
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
                                     
                                     Las respuestas son validas, siempre que estas expresen lo que 
                                     realmente pensamos y sentimos.\n\n
                                     """;
    }
    
    public int getIteracionPreguntas() {
        return iteracionPreguntas;
    }
    
    public void iniciarTest() {
        this.labelPreguntas.setText(this.preguntas[this.iteracionPreguntas]);
    }
    
    public void actualizarTest() {
        if(this.preguntas.length != this.iteracionPreguntas + 1) {
            if(this.iteracionPreguntas + 2 == this.preguntas.length) this.btnSiguiente.setText("FINALIZAR");
            if(this.verificarCasillaSeleccionada()) {
                this.incrementarContadores();
                this.labelPreguntas.setText(this.preguntas[this.iteracionPreguntas]);
                this.seleccionVerdadero.setText("Veces que seleccionaste verdadero: " + String.valueOf(this.contadorVerdadero));
                this.seleccionFalso.setText("Veces que seleccionaste falso: " + String.valueOf(this.contadorFalso));
            } else {
                JOptionPane.showMessageDialog(null, "Es obligatorio seleccionar una casilla");
            }
            reiniciarValoresDeCasillas();
        } else {
            this.opcionABoton.setEnabled(false);
            this.opcionBBoton.setEnabled(false);
            this.incrementarContadores();
            this.actualizarPorcentajes();
        }
    }
    
    private void incrementarContadores() {
        this.iteracionPreguntas++;
        if(this.opcionABoton.isSelected()) this.contadorVerdadero++;
        if(this.opcionBBoton.isSelected()) this.contadorFalso++;
    }
    
    private void reiniciarValoresDeCasillas() {
        if(this.opcionABoton.isSelected() || this.opcionBBoton.isSelected()) {
            grupoDeBotones.clearSelection();
        }
    }
    
    public void actualizarContadoresEnPantalla() {
        this.reiniciarValoresDeCasillas();
        this.btnSiguiente.setVisible(false);
        this.seleccionVerdadero.setText("Veces que seleccionaste verdadero: " + String.valueOf(this.contadorVerdadero));
        this.seleccionFalso.setText("Veces que seleccionaste falso: " + String.valueOf(this.contadorFalso));
    }
    
    private void actualizarPorcentajes() {
        int totalDePreguntas = this.preguntas.length;
        
        double totalPosible = totalDePreguntas + (totalDePreguntas / 3.0);
        double totalObtenido = this.contadorVerdadero + (this.contadorFalso / 3.0);
        double totalFinal = (totalObtenido / totalPosible) * 100;
        this.porcentaje.setText("Tu porcentaje: " + String.valueOf(String.format("%.2f", totalFinal)) + "%");
        if( (int)totalFinal >= 80 ) this.nivelSocial.setText("Nivel de sociabilidad: Muy Sociable!!");
        else if( (int)totalFinal >= 50 && (int)totalFinal <= 79) this.nivelSocial.setText("Nivel de sociabilidad: Social!!");
        else if( (int)totalFinal >= 30 && (int)totalFinal <= 49 ) this.nivelSocial.setText("Nivel de sociabilidad: Poco sociable");
        else this.nivelSocial.setText("Nivel de sociabilidad: Antisocial");
    }
    
    private boolean verificarCasillaSeleccionada() {
        boolean validarCasilla = true;
        if(!this.opcionABoton.isSelected() && !this.opcionBBoton.isSelected()) {
            validarCasilla = false;
        }
        return validarCasilla;
    }
}
