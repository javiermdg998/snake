package company;

import java.util.ArrayList;

public class Snake {
  private ArrayList<int[]> position;

    public ArrayList<int[]> getPosition() {
        return position;
    }

    public void setPosition(ArrayList<int[]> position) {
        this.position = position;
    }

    public Snake() {
        this.position = new ArrayList<int[]>(0);
        position.add(new int[]{1, 1});
        position.add(new int[]{1, 2});
        position.add(new int[]{1, 3});

    }
    public boolean move(char direction){
        int[] aux=new int[2];
        aux[0]=position.get(0)[0];
        aux[1]=position.get(0)[1];
        switch (direction){
            case 'w':
                aux[0]++;
                break;
            case 's':
                aux[0]--;
                break;
            case 'a':
                aux[1]--;
                break;
            case 'd':
                aux[1]++;
                break;
                default:
                    return false;
        }
        position.add(0,aux);

        position.remove(position.size()-1);
        return true;
    }
    public void comer(){
        position.add(position.get(position.size()-1));
    }

}
