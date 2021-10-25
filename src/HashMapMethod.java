import java.util.HashMap;
import java.util.HashSet;

public class HashMapMethod {
    public static void main(String[] args){
        HashMap<Integer,String> hash1=new HashMap<Integer,String>();
        HashSet<String> set1=new HashSet<String>();

        hash1.put(1,"Winter Season");
        hash1.put(2,"Spring Season");
        hash1.put(3,"Summer Season");
        hash1.put(4,"Autumn Season");
        for(Integer i : hash1.keySet()){
            System.out.println("Keys are : " + i);
            System.out.println(hash1.get(i));

        }

        set1.add("Winter");
        set1.add("Spring");
        set1.add("Summer");
        set1.add("Autumn");
        System.out.println("_______________");
        System.out.println("Hashset Method");
        for(String i: set1){
            if(set1.contains("Monsoon")) {
                System.out.println("Monsoon was found in the list");
                System.out.println(i);
            }

                else{
                    System.out.println("Monsoon was not found in the list");
                    break;
                }

            }
        }

    }

