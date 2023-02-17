package gameAnimals;

import java.util.Random;

public class Game {

    public static final int SIZE = 25;
    private Object[][]gameField = new Object[SIZE][SIZE];
    private int totalPredators = 5;
    private int totalHerbivores = 5;
    private int totalMeat = 5;
    private int totalGrass = 5;
    private int amountFood = 5;  //одновременное кол-во экземпляров каждого вида еды на поле
    private int counter = 0;  //счетчик ходов
    private int countStepsWithoutFood = 2;  //кол-во ходов без еды до гибели
    private int countStepsPredator = 0;  //кол-во ходов Хищника без еды
    private int countStepsHerbivore = 0;  //кол-во ходов Травоядного без еды

    private boolean inGame = true;

    public void start(){
        createObjects();
        drawField();
        showCoordinates();
        while (inGame()) {
            nextMove();
        }
    }
    private boolean inGame(){
        if (counter>=100) {
            return false;
        }
        else return true;
    }
    private void createObjects(){
        createPredators();
        createHerbivores();
        createMeat();
        createGrass();
    }

    private void createPredators(){
        Random random = new Random();
        int predators = totalPredators;
        while (predators>0){
            int coordinateX = random.nextInt(SIZE);
            int coordinateY = random.nextInt(SIZE);
            if (gameField[coordinateX][coordinateY] == null) {
                gameField[coordinateX][coordinateY] = new Predator();
                predators--;
            }
        }
    }

    private void createHerbivores(){
        Random random = new Random();
        int herbivores = totalHerbivores;
        while (herbivores>0){
            int coordinateX = random.nextInt(SIZE);
            int coordinateY = random.nextInt(SIZE);
            if (gameField[coordinateX][coordinateY] == null) {
                gameField[coordinateX][coordinateY] = new Herbivore();
                herbivores--;
            }
        }
    }

    private void createMeat(){
        Random random = new Random();
        int meat = totalMeat;
        while (meat>0){
            int coordinateX = random.nextInt(SIZE);
            int coordinateY = random.nextInt(SIZE);
            if (gameField[coordinateX][coordinateY] == null) {
                gameField[coordinateX][coordinateY] = new Meat();
                meat--;
            }
        }
    }

    private void createGrass(){
        Random random = new Random();
        int grass = totalGrass;
        while (grass>0){
            int coordinateX = random.nextInt(SIZE);
            int coordinateY = random.nextInt(SIZE);
            if (gameField[coordinateX][coordinateY] == null) {
                gameField[coordinateX][coordinateY] = new Grass();
                grass--;
            }
        }
    }

    private void drawField(){
        for (Object[] objects: gameField){
            for (Object object : objects){
                if (object == null){
                    System.out.print("[ ]");
                } else {
                    System.out.print("["+object+"]");
                }
            }
            System.out.println();
        }
        System.out.println("Total Predators: " + totalPredators);
        System.out.println("Total Herbivores: " + totalHerbivores);
        System.out.println("The number of turns is " + counter);
        System.out.println();
    }

    private void showCoordinates() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (gameField[i][j] != null){
                    System.out.println(gameField[i][j] + "[" + i + ";" + j + "]");
                }
            }
        }
        System.out.println();
    }

    private void nextMove(){
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                if (counter>=100){
                    break;
                }
                if (gameField[i][j] instanceof Animal) {
                        if (!checkEat(i, j)) {
                            doStep(i, j);
                            replaceFood();
                        } else {
                            replaceFood();
                        }
                        drawField();
                        counter++;
                    }
                }
            }
    }

    private boolean checkEat(int i, int j){
        for(int x = i - Animal.VISIBILITY; x <= i + Animal.VISIBILITY; x++){
            for(int y = j - Animal.VISIBILITY; y <= j + Animal.VISIBILITY; y++){
                if(x<0 || x>=gameField.length || y<0 || y>= gameField.length){
                    continue;
                }
                if (gameField[i][j] instanceof Predator && gameField[x][y] instanceof Meat){
                    gameField[x][y] = gameField[i][j];
                    gameField[i][j] = null;
                    System.out.println("The Predator " + gameField[x][y] + "[" + x + ";" + y + "] is full");
                    countStepsPredator=0;  //обнулить кол-во ходов без еды
                    reproducePredator();
                    return true;
                }
                if (gameField[i][j] instanceof Herbivore && gameField[x][y] instanceof Grass){
                    gameField[x][y] = gameField[i][j];
                    gameField[i][j] = null;
                    System.out.println("The Herbivore " + gameField[x][y] + "[" + x + ";" + y + "] is full");
                    countStepsHerbivore=0;  //обнулить кол-во ходов без еды
                    reproduceHerbivore();
                    return true;
                }
                if (gameField[i][j] instanceof Predator && gameField[x][y] instanceof Herbivore){
                    gameField[x][y] = gameField[i][j];
                    gameField[i][j] = null;
                    System.out.println("The Predator " + gameField[x][y] + "[" + x + ";" + y + "] is full");
                    countStepsPredator=0;  //обнулить кол-во ходов без еды
                    totalHerbivores--;
                    reproducePredator();
                    return true;
                }

            }
        }
        return false;
    }

    private void doStep(int i, int j) {
        Random random = new Random();

        while (true) {
            int x = random.nextInt(i-1, i+2);  //value between the specified origin (inclusive) and the specified bound (exclusive)
            int y = random.nextInt(j-1, j+2);

            if ((x==j && y==j) || x<0 || x>=gameField.length || y<0 || y>= gameField.length){
                continue;
            }
            if (gameField[x][y] == null) {
                gameField[x][y] = gameField[i][j];  //Животное идет на соседнюю клетку
                gameField[i][j] = null;

                if (gameField[x][y] instanceof Predator) {  //Как здесь считать ходы без еды конкретного Хищника? А не любого Хищника
                    countStepsPredator++;
                    System.out.println("The Predator " + gameField[x][y] + "[" + i + ";" + j + "] moved to " + "[" + x + ";" + y + "]. The number of his steps without food is " + countStepsPredator);
                    if (countStepsPredator==countStepsWithoutFood){
                        gameField[x][y] = null;
                        System.out.println("This Predator died");
                        totalPredators--;
                        countStepsPredator=0;
                    }
                }
                if (gameField[x][y] instanceof Herbivore) {
                    countStepsHerbivore++;
                    System.out.println("The Herbivore " + gameField[x][y] + "[" + i + ";" + j + "] moved to " + "[" + x + ";" + y + "]. The number of steps without food is " + countStepsHerbivore);
                    if (countStepsHerbivore==countStepsWithoutFood){
                        gameField[x][y] = null;
                        System.out.println("This Herbivore died");
                        totalHerbivores--;
                        countStepsHerbivore=0;
                    }
                }
                break;
            }
        }
    }

    private void replaceFood(){
        replaceMeat();
        replaceGrass();
    }
    private void replaceMeat() {
        for (int l = 0; l < SIZE; l++) {
            for (int k = 0; k < SIZE; k++) {
                if (gameField[l][k] instanceof Meat) {
                    gameField[l][k] = null;   //удалить несъеденное мясо
                }
            }
        }
        totalMeat=0;

        Random random = new Random();
        while (totalMeat < amountFood) {
            int coordinateX = random.nextInt(SIZE);
            int coordinateY = random.nextInt(SIZE);

            if (gameField[coordinateX][coordinateY] == null) {
                gameField[coordinateX][coordinateY] = new Meat();  //создать новое мясо
                totalMeat++;
            }
        }
    }
    private void replaceGrass() {
        for (int l = 0; l < SIZE; l++) {
            for (int k = 0; k < SIZE; k++) {
                if (gameField[l][k] instanceof Grass) {
                    gameField[l][k] = null;   //удалить несъеденную траву
                }
            }
        }
        totalGrass=0;

        Random random = new Random();
        while (totalGrass < amountFood) {
            int coordinateX = random.nextInt(SIZE);
            int coordinateY = random.nextInt(SIZE);

            if (gameField[coordinateX][coordinateY] == null) {
                gameField[coordinateX][coordinateY] = new Grass();  //создать новую траву
                totalGrass++;
            }
        }
    }

    private int chanceReproduction(){
        Random random = new Random();
        return random.nextInt(2);  //0 или 1
    }
    private void reproducePredator() {
        if (chanceReproduction() == 1) {
            Random random = new Random();
            int newPredator = 1;
            while (newPredator > 0) {
                int coordinateX = random.nextInt(SIZE);
                int coordinateY = random.nextInt(SIZE);
                if (gameField[coordinateX][coordinateY] == null) {
                    gameField[coordinateX][coordinateY] = new Predator();  //Хищник размножился
                    newPredator--;
                    System.out.println("+1 new Predator " + gameField[coordinateX][coordinateY] + "[" + coordinateX + ";" + coordinateY + "] on the field");
                    totalPredators++;
                }
            }
        }
    }
    private void reproduceHerbivore() {
        if (chanceReproduction() == 1) {
            Random random = new Random();
            int newHerbivore = 1;
            while (newHerbivore > 0) {
                int coordinateX = random.nextInt(SIZE);
                int coordinateY = random.nextInt(SIZE);
                if (gameField[coordinateX][coordinateY] == null) {
                    gameField[coordinateX][coordinateY] = new Herbivore();  //Травоядное размножилось
                    newHerbivore--;
                    System.out.println("+1 new Herbivore " + gameField[coordinateX][coordinateY] + "[" + coordinateX + ";" + coordinateY + "] on the field");
                    totalHerbivores++;
                }
            }
        }
    }

}
