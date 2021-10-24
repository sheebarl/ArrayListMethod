import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListMethod {
    static ArrayList<String> ArrayList1 = new ArrayList<String>();

    public static void main(String[] args) {
        PrintMenu();
    }

    public static int PrintMenu() {
        boolean menuOption = true;
        int menuChoice = 0;
        while (menuOption) {
            System.out.println("Select the Menu");
            System.out.println("1.Add Your Favourite Hobbies");
            System.out.println("2.Remove");
            System.out.println("3.Replace");
            System.out.println("4.Exit");
            menuChoice = getUserInt();

            if (menuChoice == 1) {
                System.out.println("Enter your Favourite Hobbies");
                ArrayList1.add(getUserString());
                for(int i=0;i<ArrayList1.size();i++) {
                    System.out.println(ArrayList1.get(i));
                }

            }
            else if(menuChoice==2){
                System.out.println("Enter the hobbies to be removed ");
                String removeString=getUserString();
                //System.out.println(removeString);
                //System.out.println(ArrayList1);
                for(int i=0;i<ArrayList1.size();i++) {
                    if (removeString.equals(ArrayList1.get(i))) {
                        ArrayList1.remove(removeString);
                        System.out.println("It is successfully removed");
                    }
                }
            }
            else if(menuChoice==3) {
                System.out.println("Enter the hobbies to be replaced");
                String changeValue = getUserString();
                System.out.println("Enter the Favourite Hobbies");
                String replaceValue = getUserString();
                for (int i = 0; i < ArrayList1.size(); i++) {
                    ArrayList1.set(i, replaceValue);
                    System.out.println("The changed value :" + ArrayList1.get(i));
                }

            }
            else if(menuChoice==4){
                System.out.println("Exit the Program");
                menuOption=false;
            }
            }

        return menuChoice;

        }


    public static int getUserInt(){
        Scanner scan=new Scanner(System.in);
        int myInt=Integer.parseInt(scan.nextLine());
        return myInt;
    }

    public static String getUserString(){

        Scanner scan=new Scanner(System.in);
        String myString = scan.nextLine();
       // String[] myString1=myString.split(",");
        return myString;

    }
}

//String myString="";
        /*for(int i=0;i<5;i++){
               // myString = scan.nextLine();
                //ArrayList1.add(i,myString);
               // System.out.println(ArrayList1.add(myString));

        }*/
