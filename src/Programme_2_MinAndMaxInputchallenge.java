import java.util.Scanner;

public class Programme_2_MinAndMaxInputchallenge {
    public static void findMinAndMaxNumber(){
        Scanner scanner =new Scanner(System.in);
        int min =0;
        int max =0;
        boolean first=true;
        while (true){
            System.out.println("Enter the number: ");
            boolean isAnint= scanner.hasNextInt();
            if (isAnint){
                int number=scanner.nextInt();
                if (first){
                    first=false;
                    min=number;
                    max=number;
                }
                if (number>max){
                    max=number;
                }
                if (number<min){
                    min=number;
                }else{
                    break;
                }
                scanner.nextInt();
            }
            System.out.println("Min= "+ min +" ,Max = "+max);
            Scanner close;
        }
    }
    public static void main(String[] args) {
        findMinAndMaxNumber();
    }
}
