import java.util.Hashtable;

public class hashTable {
    void HashTable(){
        Hashtable<String,Integer> obj=new Hashtable<>();
        obj.put("a",1);
        for(int i=2;i<=10;i++){
            obj.put("a"+i,i+1);
        }
        boolean flag=obj.contains(9);
        System.out.println("Obj.Conatin(9): "+flag);
        System.out.println(obj);
    }
    public static void main(String[] args) {
        hashTable obj=new hashTable();
        obj.HashTable();
    }
}
