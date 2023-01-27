import java.util.*;
public class treeMap{
    void treeMAP(){
        TreeMap<String ,Integer> obj=new TreeMap<>();
        obj.put("abc",null);
        for(int i=2;i<=10;i++){
            obj.put("abc"+i,1+i);
        }
        System.out.println("TreeMap: "+obj);
        System.out.println("First Key"+obj.firstKey());
        System.out.println("Last Key:"+obj.lastKey());
        System.out.println("First Element: "+obj.firstEntry());
        System.out.println("Lst Element: "+obj.lastEntry());
        System.out.println("Values: "+obj.values());
        System.out.println("Head Map: "+obj.headMap("ABC10"));
        System.out.println("Tail Map: "+obj.tailMap("NOOB100"));
        
    }
    public static void main(String[] args) {
        treeMap obj=new treeMap();
        obj.treeMAP();
    }
}