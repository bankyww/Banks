package LESSON2;

public class LESSON {

    public static void main(String[] args) {
        /*how to print out a result
        System.out.println(3+3);
        System.out.println(4+4);*/

        //Variable creation
        String bag = "crave stone";
        int dice = 9;
        float pen = 0.9f;
        char tin = 'b';
        boolean tap = false;

        //Assignment
        int d = 6;
        int g = 8;
        //First variable is less than second variable
        if (d < g) {
            System.out.println("yes it is less than g");
        }
        //First variable is greater than second variable
        if (d > g) {
            System.out.println("yes it is greater than g");
        }
        //First variable is equal to the second variable
        if (d == g) {
            System.out.println("yes it is equal to g");
        }
        //When all the conditions are false
        else if (d != g) {
            System.out.println("false");
        }
        int months = 150;

        switch(months){


            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("february");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("august");
                break;
            case 9:
                System.out.println("september");
                break;
            case 10:
                System.out.println("october");
                break;
            case 11:
                System.out.println("november");
                break;
            case 12:
                System.out.println("december");
                break;

            default:
                System.out.println("invalid month");
    }
        //switch




    }






}






