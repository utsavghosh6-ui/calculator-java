import java.util.Scanner;
public class calculator {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Enter operation : ");
        char op = sc.next().charAt(0);

        switch (op){
            case '+':
            System.out.println("The sum is: " + (a+b));
            break;
            case '-':
            System.out.println("The difference is: " + (a-b));
            break;
            case '*':
            System.out.println("The product is: " + (a*b));
            break;
            case '/':
                if(b!=0){
                    System.out.println("The quotient is: " + (a/b));
                }
                else{
                    System.out.println("Zero division error");
                }
            
            break;
            case '%':
            System.out.println("The remainder is: " + (a%b));
            break;
            default:
                System.out.println("Invalid input");                      
        }
        sc.close();

    }

}
