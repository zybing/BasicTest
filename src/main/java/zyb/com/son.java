package zyb.com;

/**
 * Created by yanbing1 on 1/15/2017.
 */
public class son extends father{
    public static void main(String[] args){
        try {
            Class<son> _son= (Class<son>) Class.forName("zyb.com.son");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Class<Integer> _number=int.class;
        Class<? super Integer> __number=_number;
        Class<?> _he=int.class;
        Class<Integer> _hehe= (Class<Integer>) _he;
        try {
            Class<? extends father> _father= (Class<son>) Class.
                    forName("zyb.com.father");
            Class<father> __father= (Class<father>) _father;

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        son _son=new son();
        hehe(_son);
    }
    public static void hehe(father obj){
        Class<son> _type= (Class<son>) obj.getClass();
        try {
            son _son=_type.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        Class<?> __type=_type.getSuperclass();

    }
}
