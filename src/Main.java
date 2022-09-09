public class Main {
    public static void main(String[] args) {
        int numb = -169;

        if (numb > 0) {
            System.out.println("Number VALUE is positive");
        } else if (numb < 0) {
            System.out.println("Number VALUE is negative");
        } else if (numb == 0) {
            System.out.println("Number VALUE is equal zero");
        } else {
            System.out.println("Something another");
        }
        /////////////////////////////////////////////////

        int numb1 = 169;

        if (numb1 > 0) {
            System.out.println("Number VALUE is positive");
        } else if (numb1 < 0) {
            System.out.println("Number VALUE is negative");
        } else if (numb1 == 0) {
            System.out.println("Number VALUE is equal zero");
        } else {
            System.out.println("Something another");
        }
        /////////////////////////////////////////////////////////

        int numb2 = 0;

        if (numb2 > 0) {
            System.out.println("Number VALUE is positive");
        } else if (numb2 < 0) {
            System.out.println("Number VALUE is negative");
        } else if (numb2 == 0) {
            System.out.println("Number VALUE is equal zero");
        } else {
            System.out.println("Something another");


/////////////////////////// Second exercise //////////////////////////////


            int yearNumber = 0;
            String month = "2024";

            switch (month) {
                case "2022":
                    yearNumber = 1;
                case "2023":
                    yearNumber = 2;
                case "2024":
                    yearNumber = 3;
                    break;
            }

            System.out.println(yearNumber);


////////////////////////// Third exercise/////////////////////////////////////////

            int higest;
            int num1 = 145;
            int num2 = 441;
            int num3 = 81;
            if (num2 <= num1 && num3 <= num1) {
                higest = num1;
                System.out.println("Max: " + num1);
            } else if (num1 <= num2 && num3 <= num2) {
                higest = num2;
                System.out.println("Max: " + num2);
            } else if (num1 <= num3 && num2 <= num3) {
                higest = num3;
                System.out.println("Max: " + num3);
            }

/////////////////////////// Fourth exercise /////////////////////////////////////////////

            int least;
            int nbr1 = 225;
            int nbr2 = 144;
            int nbr3 = 265;
            if (nbr1 <= nbr2 && nbr1 <= nbr3) {
                least = nbr1;
            } else if (nbr2 <= nbr3 && nbr2 <= nbr1) {
                least = nbr2;
            } else {
                least = nbr3;
            }

            System.out.println("Min: " + least);


        }
    }
}