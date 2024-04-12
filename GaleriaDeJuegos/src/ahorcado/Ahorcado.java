package ahorcado;

import java.util.Scanner;

public class Ahorcado {
    
    private int attemps = 0, asserts = 0;
    private final int total_attemps =7;
    private final Scanner input = new Scanner(System.in);
    
    private final String[] values = {"computadora", "programador", "java", "gato", "perro", "anillo",
        "camiseta", "lapicera", "matematicas", "pelo", "gorra", "raton", "teclado", "chamarra", "persona", "programacion",
        "vaso", "television", "pantalla", "sueter"};
    
    public void play() {
        playMenu();
    }
    
    private void playMenu() {
        int selection = 0;
        while(selection != 2) {
            System.out.println("""
                           -------------------------
                           Bienvenido al ahorcado!!
                           1) Jugar
                           2) Salir 
                           
                           """);
            try {
                System.out.print("""
                                   Seleccion: 
                                   -------------------------
                                   """);
                selection = input.nextInt();
                if(selection == 1) readyToPlay(); 
            } catch(Exception e) {
                System.out.println("Seleccione una de las opciones anteriores, con numeros");
            }
        }
    }
    
    private void readyToPlay() {
        
        String randomWord = values[generateRandNumber()];
        char[] characters = brokeWord(randomWord);
        char[] updateWord = new char[characters.length];
        
        System.out.println("\n\n\n");
        
        for(int i = 0; i < characters.length; i++) {
            System.out.print("_ ");   
            updateWord[i] = '_';
        }
        
        asserts = 0;
        attemps = 0;
        
        while(attemps < total_attemps && asserts != characters.length) {
            
            System.out.print("\nPista -> Son " + characters.length + " letras");
            System.out.print("\nIngresa una letra:");
            char characterInput = input.next().toLowerCase().charAt(0);
            
            for(int i = 0; i < randomWord.length(); i++) {
                if(characterInput == characters[i]) {
                    /* Actualizando arreglo de char */
                    for(i = 0; i < randomWord.length(); i++) {
                        if(characterInput == characters[i]) {
                            updateWord[i] = characterInput;
                            asserts++;
                        } 
                    }
                    /* Mostrando los valores ya modificados*/
                    for(i = 0; i < randomWord.length(); i++) {
                        System.out.print(updateWord[i] + " ");
                    }
                }
            }
            attemps++;
        }
        validationWinner(asserts, randomWord);
    }
    
    private void validationWinner(int asserts, String randomWord) {
        if(asserts != randomWord.length()) {
            System.out.println("\nSuerte para la proxima, la palabra era: " + randomWord);
        } else {
            System.out.println("\nFelicidades, has ganado!! ");
        }
    }
    
    private char[] brokeWord(String word) {
        char broken[] = word.toCharArray();
        return broken;
    }
    
    private int generateRandNumber() {
        int randNumber = (int)(Math.random()*20+1);
        return randNumber;
    }
}
