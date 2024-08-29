public class Main {

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(2, -2020));
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }

    }

    public static int getDaysInMonth(int month, int year) {
        if (year < 1 || year > 9999) {
            return -1;
        }

         // TRADITIONAL VERSION
         switch (month) {
             case 1, 5, 7, 8, 10, 12:
                 return 31;
             case 2:
                 if (Main.isLeapYear(year)) {
                     return 29;
                 }
                 return 28;
             // TODO: YOU do the rest for 3 - 12

             case 3:
                 return 31;
             case 4, 6, 9, 11:
                 return 30;


             default:
                 return -1;
         }

        // // ENHANCED VERSION
        // return switch (month) {
        //     case 1 -> 31;
        //     case 2 -> {
        //         if (isLeapYear(year)) {
        //             yield 29;
        //         }
        //         yield 28;
        //     }
        //     //TODO: you do the rest for 3- 12;
        //     default -> -1;
        // };
    }
}

