/**
 * Created by yanbing1 on 2/1/2017.
 */
import java.io.*;

public class serialtest implements Serializable{
    private static final long serialVersionUID = 1L;
    private int testid=1234;
    private transient qaz hh;
    public serialtest(int data){
        testid=data;
        hh=new qaz();
    }
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        ObjectOutputStream out =new ObjectOutputStream(new FileOutputStream("hehe.txt"));
        serialtest test1=new serialtest(2468);
        serialtest test2=new serialtest(3456);
        out.writeObject(test1);
        out.writeObject(test2);
        out.writeObject("hehe");
        out.flush();
        out.close();
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("hehe.txt"));
        serialtest hehe1=(serialtest) in.readObject();
        serialtest hehe2=(serialtest) in.readObject();
        System.out.println(in.readObject());
        System.out.println(hehe1.testid);
        System.out.println(hehe2.testid);
    }
}
class qaz{
    private int hehe=1234;
}
