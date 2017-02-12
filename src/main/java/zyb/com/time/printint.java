package zyb.com.time;

/**
 * Created by yanbing1 on 12/8/2016.
 */
public class printint {
    public static void main(String[] args){
        Long data=0l;
        long test= (long) Math.pow(2,34);
        long startTime=System.currentTimeMillis();
        while(data!=test){
            data++;
        }
        long endTime=System.currentTimeMillis();
        System.out.println(data);
        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");
    }
}
