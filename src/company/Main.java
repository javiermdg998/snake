package company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static final int HEIGHT=9;
    public static final int WIDTH=9;
    public static String[][] scenario=new String[WIDTH][HEIGHT];
    public static  Snake snake=new Snake();
    public static Food food=new Food(WIDTH,HEIGHT);


    public static void main(String[] args) throws IOException {
       // Snake snake=new Snake();
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            render();

        }while (snake.move(br.readLine().charAt(0),scenario,food));
        System.out.println("has perdido");


    }

    public static void render() {
        initScenario();

        placeSnake(snake);
        if (food.isAppeares()){
            scenario[food.getX()][food.getY()]="o";
        }else{
            food.spawn();
        }

        System.out.println(snake.getPosition().size());
        for (int i = 0; i <scenario.length; i++) {
            for (int j = 0; j <scenario[i].length ; j++) {
                    System.out.format("%4s",scenario[i][j]);

            }
            System.out.println();
        }
        System.out.println("----------------------");
    }

    public static void placeSnake(Snake snake){
        for (int i = 0; i <snake.getPosition().size() ; i++) {
            scenario[snake.getPosition().get(i)[0]][snake.getPosition().get(i)[1]]="x";
        }

    }
    public static void initScenario(){
        for (int i = 0; i <scenario.length; i++) {
            for (int j = 0; j <scenario[i].length ; j++) {
              scenario[i][j]=".";

            }

        }
    }



}
