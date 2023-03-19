import java.util.ArrayList;
import java.util.Scanner;

public class main {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                String input = in.nextLine();
                String[] arr = input.split(" ");
                boolean isIncr = true;
                boolean ans = true;
                for (int i = 1; i < arr.length; i++){
                        if (Integer.parseInt(arr[i-1]) >= Integer.parseInt(arr[i])){
                                isIncr = false;
                        }
                        if(isIncr){
                                if(Integer.parseInt(arr[i-1]) > Integer.parseInt(arr[i])){
                                        ans = false;
                                        break;
                                }
                        } else {
                                if(Integer.parseInt(arr[i-1]) < Integer.parseInt(arr[i])){
                                        ans = false;
                                        break;
                                }
                        }
                }
                if (!ans) {
                        System.out.println("NO");
                } else {
                        System.out.println("YES");
                }

        }
}
