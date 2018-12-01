package company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static String[][] scenario=new String[9][9];
    public static  Snake snake=new Snake();

    public static void main(String[] args) {
       // Snake snake=new Snake();
        render();
        snake.move('a');
        render();

    }

    public static void render() {
        initScenario();
        placeSnake(snake);
        for (int i = 0; i <scenario.length; i++) {
            for (int j = 0; j <scenario[i].length ; j++) {
                    System.out.format("%4s",scenario[i][j]);

            }
            System.out.println();
        }
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


    public static boolean contains(ArrayList<int[]> haystack, int[]needle){
        for (int[] x:haystack) {
            if (Arrays.equals(x,needle)){

                return true;
            }
        }
        return false;
    }
}
