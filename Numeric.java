import java.io.*;
class Numeric {

    public static void main(String[] args) {

        Scanner num=new Scanner(System.in);
        String string=num.next();
        boolean num1 = true;

        try {
            Double num2 = Double.parseDouble(string);
        } catch (NumberFormatException e) {
            num1 = false;
        }

        if(num1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

