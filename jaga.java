import java.util.Scanner;

class jaga{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the first number");
        double num1 = scan.nextDouble();
        System.out.println("enter the second number");
             double num2 = scan.nextDouble();

             System.out.println("enter the kind of operator");
              System.out.println("a. operator (+)");
               System.out.println("b. operator (-)");
                System.out.println("c. operator (*)");
                 System.out.println("d. operator (/)");

                char operator = scan.next().charAt(0);

                if(operator == 'a'){
                    System.out.println("the added value = " + (num1+num2));
                }

                else if(operator == 'b') {
                    System.out.println("the subracted value = " + (num1-num2));
                }
                else if(operator == 'c'){
                    System.out.println("the multiplied value = "+(num1*num2));
                }

                else if(operator == 'd'){

                    if(num2!=0){
                        System.out.println("the divided value ="+ (num1/num2));

                    }
                    else{
                        System.out.println("zero leads to undefined ");
                    }
            }
    }
}