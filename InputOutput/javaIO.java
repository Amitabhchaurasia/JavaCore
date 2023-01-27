import java.util.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Byte Stream classes : BufferInputStram ,
 * BufferedOutPutStream,DataInputStream ,DataOuptput Stream
 * FileInputStream,FileOutPutStream
 * OutPutStream,PrintStream
 * 
 * Charater Stream Classes : BufferedReader -> it hadle buufer inputString
 * BufferWriter -> it hadle outPut.
 * filereader,FileWrite,InputStreamReader
 * outPutStreamReader,printWriter its a outtput method 
 * 
 */
public class javaIO {
    void readConsoleInput(){
        BufferedReader obj =new BufferedReader(new InputStreamReader(System.in));
        try{
            System.out.println("Enter the string ");
            String str=obj.readLine();
            System.out.println("Write:"+str);
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        javaIO obj =new javaIO();
        obj.readConsoleInput();
    }
}
