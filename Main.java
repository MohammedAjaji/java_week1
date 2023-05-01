import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //Print Hello
//        System.out.println("Hello world!");
//        System.out.println("§Hello Tuwaiq§");
//        System.out.println("My name is Mohammed");

        //Variables NO(reserved words, Numbers, Spi)
//        int a = 4 , b = 2 , c = 1;
//        double x = 0.5 , y = 2.5;
//        boolean t = true , f = false;
//        String firstname = "Mohammed" , lastname = "Alajaji";
//        System.out.println("a = " + a + " b = " + b + " c = " + c);
//        System.out.println("x = " + x + " y = " + y );
//        System.out.println("My name is " + firstname + " " + lastname);
//        System.out.println(t);
//        System.out.println("the length of the first name is " + firstname.length());
//        System.out.println("your first name start with " + firstname.charAt(0));
//        System.out.println("your first name end with " + firstname.charAt(firstname.length()-1));
//        System.out.println("does you name stats with Mo? " + firstname.startsWith("Mo"));
//        System.out.println("does you name ends with eb? " + firstname.endsWith("eb"));

        // operators  ( + - * / ) ( > < >= <= != == )
//        int sum,  mult, sub, div;
//        sum = a+b+c;
//        mult = a*b*c;
//        sub = a-b-c;
//        div = a/b/c;
//
//        System.out.println("the sum is = " + sum );
//        System.out.println("the mult is = " + mult );
//        System.out.println("the sub is = " + sub );
//        System.out.println("the div is = " + div );
//        System.out.println(("is a bigger than b? ") + (a > b));
//        System.out.println(a == b);
//        System.out.println(( a >= b)||( a <= b));

        // Scanner how to use onlu once in top of the code(Scanner s = new Scanner(System.in); s.mothods)
//        String firstname , middlename , lastname;
//        int age;
//
//        System.out.println("Please enter the following:");
//        System.out.println("Firstname: ");
//        firstname = s.nextLine();
//        System.out.println("Middle name: ");
//        middlename = s.nextLine();
//        System.out.println("Lastname: ");
//        lastname = s.nextLine();
//        System.out.println("How old are you? ");
//        age = s.nextInt();
//
//        String fullname = firstname + " " + middlename + " " + lastname;
//        System.out.println("Your full name is " + fullname);
//        System.out.println("your age is " + age);

        // Conditional statement (if/if-else/if-else-if statement & switch)
//        System.out.println("Please enter any number ");
//        int x = s.nextInt();
//        if (x>0) {
//            System.out.println( x +" is positive");
//        }else if(x<0){
//            System.out.println( x + " is negative");
//        }else{
//            System.out.println("The number ZERO");
//        }

//        System.out.println("please enter your username ");
//        String username = s.nextLine();

//        System.out.println("Please enter your password ");
//        String password = s.nextLine();
//
//        System.out.println("Hello " + username);
//
//        if(password.length()>=8){
//            System.out.println("your password is strong!!");
//        }else{
//            System.out.println("your password is weak! please enter more than 8 characters");
//        }

//        String admin = "mohammed";
//
//        if (username.equals(admin)){
//            System.out.println("Welcome");
//        }else{
//            System.out.println("Only the admin can enter");
//        }

        // use range and limits
//        System.out.println("Enter your grade out off 100 ");
//        int grade = s.nextInt();
//
//        if(grade>=90){
//            System.out.println("You got A");
//        } else if (grade >=80) {
//            System.out.println("You got B");
//        } else if (grade >=70) {
//            System.out.println("You got C");
//        } else if (grade >= 60) {
//            System.out.println("You got D");
//        }else{
//            System.out.println("You got F");
//        }
        System.out.println("enter 1 to inquire Username");
        System.out.println("enter 2 to inquire password");
        System.out.println("enter 3 to inquire email");
        System.out.println("enter 4 to inquire balance");
        System.out.println("enter 5 to inquire customer service");
        int req = s.nextInt();

        switch (req){
            case 1:
                System.out.println("your usernaeme is mohammed123");
                break;
            case 2:
                System.out.println("your password is 12341234");
                break;
            case 3:
                System.out.println("your email is mohammed@gmail.com");
                break;
            case 4:
                System.out.println("your balance is 72000");
                break;
            case 5:
                System.out.println("how can i help you");
                break;
            default:
                System.out.println("please enter from the list");
        }




    }
}