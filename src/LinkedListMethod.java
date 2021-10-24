import java.util.LinkedList;

public class LinkedListMethod {
    public static void main(String[] args){
        LinkedList<Integer> list1=new LinkedList<Integer>();
        int num=0;
        int sum=0;
        int median=0;
        int n=5;
        list1.add(5);
        list1.add(10);
        list1.add(15);
        list1.add(20);
        list1.add(25);
        for(int i=0;i<list1.size();i++){
             num=list1.get(i);
            sum=sum+num;
        }
        System.out.println("Sum of all values : " + sum);
        System.out.println("Mean of all value: " + sum/ list1.size());

        if((list1.size())%2==1){
            System.out.println(list1.size());
                median= (list1.size()+1)/2;
            System.out.println("Median Value: " + list1.get(median-1));
            }
            else
            {
                System.out.println(list1.size());
                median=(list1.size()/2-1)+list1.size()/2/2;
                System.out.println("Median Value: " + list1.get(median-1));
            }

            System.out.println("Median :"+median  + "element");
            }


}
