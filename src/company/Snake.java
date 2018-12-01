package company;

import java.util.ArrayList;
import java.util.Arrays;

public class Snake {
  private ArrayList<int[]> position;

    public ArrayList<int[]> getPosition() {
        return position;
    }



    public Snake() {
        this.position = new ArrayList<int[]>(0);
        position.add(new int[]{1, 1});
        position.add(new int[]{1, 2});
        position.add(new int[]{1, 3});


    }
    public boolean move(char direction,String [][]scenario,Food food){
        int[] head=new int[2];
        int[] tail=new int[2];
        head[0]=position.get(0)[0];
        head[1]=position.get(0)[1];
        tail[0]=position.get(position.size()-1)[0];
        tail[1]=position.get(position.size()-1)[1];
        switch (direction){
            case 'w':
                head[0]--;
                break;
            case 's':
                head[0]++;
                break;
            case 'a':
                head[1]--;
                break;
            case 'd':
                head[1]++;
                break;
                /*default:
                    return false;*/
        }
        if(contains(head)){
            return false;
        }

        System.out.println(scenario[tail[0]][tail[1]]);
        if(tail[0]==food.getX() && tail[1]==food.getY()&& food.isAppeares()){
            comer();
            food.setAppeares(false);
        }
        position.remove(position.size()-1);
        position.add(0,head);


        return true;
    }
    public void comer(){
        System.out.println("comer");
        position.add(position.get(position.size()-1));
    }

    public  boolean contains( int[]needle){
        for (int[] x:position) {
            if (Arrays.equals(x,needle)){

                return true;
            }
        }
        return false;
    }
}
