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
            int c;
        while((c=in.read())!=-1){
            out.write(c);
        }
        } catch(Exception e){
            e.printStackTrace();
        }
        finally {if(in!=null){
            in.close();
            if(out!=null){
                out.close();
            }
        }}
    }
    public static void main(String[] args) {
        System.out.println("hell");
    }
}
