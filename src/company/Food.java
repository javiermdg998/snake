package company;

import java.util.Random;

public class Food {
    private int x;
    private int y;
    private boolean appeares=false;

    private int vertical;
    private int horizontal;
    private Random r=new Random();

    public Food(int h,int v) {
        this.horizontal=h-1;
        this.vertical=v-1;
        spawn();


    }
    public void spawn(){
    if(!appeares){
        x=r.nextInt(horizontal);
        y=r.nextInt(vertical);
        appeares=true;
    }

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isAppeares() {
        return appeares;
    }

    public void setAppeares(boolean appeares) {
        this.appeares = appeares;
    }
}
