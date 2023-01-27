package InputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class byteStream {
    void copyByte(){
        FileInputStream in =null;
        FileOutputStream out=null;
        try{
            in=new FileInputStream("demoe.txt");
            out=new FileOutputStream("demoTst.txt");
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        System.out.println("hell");
    }
}
