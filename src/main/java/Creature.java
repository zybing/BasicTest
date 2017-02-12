/**
 * Created by yanbing1 on 1/29/2017.
 */
public class Creature {
    protected int range;
    private int[] env;
    public Creature(){
        range=10;
        env=new int[range];
    }
}
class ant extends Creature{
    public ant(){
        super();
        range=2;
    }
    public static void main(String[] args){
        ant hehe=new ant();
        ant1 he=new ant1();
        System.out.println("你好");
    }
}
class Creature1{
    protected int range;
    public int a=3;
    public int c=17;
    private int[] env;
    public Creature1(){
        range=10;
        env=new int[getRange()];
    }
    public int getRange(){
        return range;
    }
    public void hehe(){
        System.out.println(a);
    }
}
class ant1 extends Creature1{
    public int a=5;
    public int b=10;
    public ant1(){
        super();
        System.out.println(this.a);
        System.out.println(super.a);
        hehe();
        haha();

    }
    public int getRange(){
        range=2;
        return range;
    }
    public void haha(){
        System.out.println(a);
    }
}
