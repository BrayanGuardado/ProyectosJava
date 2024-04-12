package tresenraya;

import java.util.Scanner;

public class JuegoDelGato {
    
    private int positionX;
    private int positionY;
    private char[][] matrix;
    private final int rows = 3;
    private final int columns = 3;
    private final char playerOne = 'X';
    private final char playerTwo = 'O';
    private final Scanner input = new Scanner(System.in);

    public JuegoDelGato() {
        this.positionX = 0;
        this.positionY = 0;
        this.matrix = new char[rows][columns];
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public char[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(char[][] matrix) {
        this.matrix = matrix;
    }
    
    public void playGame() {
        
        int inputUserSelection = 0;
        
        while(inputUserSelection != 2) {
            
            System.out.print("""
                               Tic Tac Toe
                               1) Jugar
                               2) Salir
                               ---------
                               Seleccion
                               """);
            inputUserSelection = input.nextInt();
            
            switch(inputUserSelection) {
                case 1 -> {
                    addElements();
                } case 2 -> {
                    System.out.println("Gracias por jugar, hasta luego");
                } 
                default -> {
                    System.out.println("Selecciona una opcion valida");
                }
            }
        }
    }
    
    private void addElements() {
        
        initializateMatrixToNull();
        int inputUserSelectionBox = 0;
        boolean playerInGame = (chooseFirstPlayer() == 1);
        
        while(inputUserSelectionBox != 10) {
            showMatrix();
            if(playerInGame) {
                System.out.println("Ingresa la casilla que quieres seleccionar");
                inputUserSelectionBox = input.nextInt();

                updateMatrix(inputUserSelectionBox, playerInGame);
                playerInGame = false;
            } else {
                System.out.println("\nTurno del CPU");
                updateMatrix(boxSelectionForAi(), playerInGame);
                playerInGame = true;
            }
        }
    }
    
    private void initializateMatrixToNull() {
        int counter = 0;
        
        for(int i = 0; i < this.rows; i++) {
            for(int j = 0; j < this.columns; j++ ) {
                counter += 1;
                this.matrix[i][j] = Character.forDigit(counter, 10);
            }
        }
    }
    
    private void showMatrix() {
        for(int i = 0; i < this.rows; i++) {
            for(int j = 0; j < this.columns; j++ ) {
                System.out.print("|" + this.matrix[i][j] + "|");
            }
            System.out.println();
        }
    }
    
    private void updateMatrix(int inputUserSelection, boolean isPLayerOneInGame) {
                
        switch(inputUserSelection) {
            case 1 -> {
                
                positionX = 0;
                positionY = 0;
                if(isEmptyBox(positionX, positionY)) {
                    for(int i = 0; i < this.rows; i++) {
                        for(int j = 0; j < this.columns; j++ ) {
                            if(isPLayerOneInGame) {
                                matrix[positionX][positionY] = playerOne;
                                return; 
                            }
                            matrix[positionX][positionY] = playerTwo;
                            return;
                        }
                    }
                }
                checkEmptyBoxForPlayerTwo(isPLayerOneInGame);
                break;
                
            } case 2 -> {
                
                positionX = 0;
                positionY = 1;
                if(isEmptyBox(positionX, positionY)) {
                for(int i = 0; i < this.rows; i++) {
                    for(int j = 0; j < this.columns; j++ ) {
                            if(isPLayerOneInGame) {
                               matrix[positionX][positionY] = playerOne;
                               return; 
                            }
                            matrix[positionX][positionY] = playerTwo;
                            return;
                        }
                    }
                }
                checkEmptyBoxForPlayerTwo(isPLayerOneInGame);
                break;
                
            } case 3 -> {
                
                positionX = 0;
                positionY = 2;
                if(isEmptyBox(positionX, positionY)) {
                for(int i = 0; i < this.rows; i++) {
                    for(int j = 0; j < this.columns; j++ ) {
                            if(isPLayerOneInGame) {
                               matrix[positionX][positionY] = playerOne;
                               return; 
                            }
                            matrix[positionX][positionY] = playerTwo;
                            return;
                        }
                    }
                }
                checkEmptyBoxForPlayerTwo(isPLayerOneInGame);
                break;
                
            } case 4 -> {
                
                positionX = 1;
                positionY = 0;
                if(isEmptyBox(positionX, positionY)) {
                for(int i = 0; i < this.rows; i++) {
                    for(int j = 0; j < this.columns; j++ ) {
                            if(isPLayerOneInGame) {
                               matrix[positionX][positionY] = playerOne;
                               return; 
                            }
                            matrix[positionX][positionY] = playerTwo;
                            return;
                        }
                    }
                }
                checkEmptyBoxForPlayerTwo(isPLayerOneInGame);
                break;
                
            } case 5 -> {
                
                positionX = 1;
                positionY = 1;
                if(isEmptyBox(positionX, positionY)) {
                for(int i = 0; i < this.rows; i++) {
                    for(int j = 0; j < this.columns; j++ ) {
                            if(isPLayerOneInGame) {
                               matrix[positionX][positionY] = playerOne;
                               return; 
                            }
                            matrix[positionX][positionY] = playerTwo;
                            return;
                        }
                    }
                }
                checkEmptyBoxForPlayerTwo(isPLayerOneInGame);
                break;
                
            } case 6 -> {
                
                positionX = 1;
                positionY = 2;
                if(isEmptyBox(positionX, positionY)) {
                for(int i = 0; i < this.rows; i++) {
                    for(int j = 0; j < this.columns; j++ ) {
                            if(isPLayerOneInGame) {
                               matrix[positionX][positionY] = playerOne;
                               return; 
                            }
                            matrix[positionX][positionY] = playerTwo;
                            return;
                        }
                    }
                }
                checkEmptyBoxForPlayerTwo(isPLayerOneInGame);
                break;
                
            }case 7 -> {
                
                positionX = 2;
                positionY = 0;
                if(isEmptyBox(positionX, positionY)) {
                for(int i = 0; i < this.rows; i++) {
                    for(int j = 0; j < this.columns; j++ ) {
                            if(isPLayerOneInGame) {
                               matrix[positionX][positionY] = playerOne;
                               return; 
                            }
                            matrix[positionX][positionY] = playerTwo;
                            return;
                        }
                    }
                }
                checkEmptyBoxForPlayerTwo(isPLayerOneInGame);
                break;
                
            } case 8 -> {
                
                positionX = 2;
                positionY = 1;
                if(isEmptyBox(positionX, positionY)) {
                for(int i = 0; i < this.rows; i++) {
                    for(int j = 0; j < this.columns; j++ ) {
                            if(isPLayerOneInGame) {
                               matrix[positionX][positionY] = playerOne;
                               return; 
                            }
                            matrix[positionX][positionY] = playerTwo;
                            return;
                        }
                    }
                }
                checkEmptyBoxForPlayerTwo(isPLayerOneInGame);
                break;
                
            } case 9 -> {
                
                positionX = 2;
                positionY = 2;
                if(isEmptyBox(positionX, positionY)) {
                for(int i = 0; i < this.rows; i++) {
                    for(int j = 0; j < this.columns; j++ ) {
                            if(isPLayerOneInGame) {
                               matrix[positionX][positionY] = playerOne;
                               return; 
                            }
                            matrix[positionX][positionY] = playerTwo;
                            return;
                        }
                    }
                }
                checkEmptyBoxForPlayerTwo(isPLayerOneInGame);
                break;
                
            } case 10 -> {
                System.out.println("Has abandondado el juego");
                break;
            } default -> {
                System.out.println("Casilla no valida, seleccione otra");
                break;
            }
        } 
    }
    
    private boolean isEmptyBox(int x, int y) {
        boolean emptyBox = true;
        
        for(int i = 0; i < this.rows; i++) {
            for(int j = 0; j < this.columns; j++ ) {
                if(matrix[x][y] == playerTwo || matrix[x][y] == playerOne) {
                    emptyBox = false;
                    break;
                }
            }
        }
        return emptyBox;
    }
    
    private int chooseFirstPlayer() {
        int selectPlayer = (int)(Math.random() * 2 + 1);
        return selectPlayer;
    }
    
    private int boxSelectionForAi() {
        int randSelectionAi = (int)(Math.random() * 9 + 1);
        return randSelectionAi;
    }
    
    private void checkEmptyBoxForPlayerTwo(boolean playerInGame) {
        if(playerInGame) {
                    System.out.println("Casilla no disponible");
        }
    }
}
