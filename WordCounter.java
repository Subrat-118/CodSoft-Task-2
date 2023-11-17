import java.util.*;
public class WordCounter{
    public static void main(String[] args){
        String str;
        do{
            System.out.println("Enter text:");
            Scanner sc=new Scanner(System.in);
            String UserInput=sc.nextLine();
            int l=UserInput.length(); 
            int n,count=0;
            for(int i=0;i<l;i++){
                if(UserInput.charAt(i)==' '){
                    count=0;
                }
                else{
                    count++;
                    n=i;
                    for(i=n;i<l;i++){
                        if(UserInput.charAt(i)==' ' && UserInput.charAt(i+1)!=' '){
                            count++;
                        }
                    }       
                }
            }
            System.out.println("Total no. of Word: "+count);
            System.out.println("Do you want to check again ? Please press (Y/y) to continue or press any key to exit: ");
            Scanner sp=new Scanner(System.in);
            str=sp.nextLine();
        }
        while(str.equalsIgnoreCase("Y"));
    }
}