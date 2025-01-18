package xmas_song;

public class ChristmasSong {


    public static void main(String[] args) {
        christmasSong();
    }

    public static void christmasSong() {

        for (int day = 1; day <= 12; day++) {
            System.out.println("On the " + getDay(day) + " day of Christmas,\n" +
                    "my true love gave to me: ");

            for (int gift = day; gift > 0; gift--) {
                switch (gift){
                    case 12:
                        System.out.println("Twelve drummers drumming,");
                        break;
                    case 11:
                        System.out.println("Eleven pipers piping,");
                        break;
                    case 10:
                        System.out.println("Ten lords a-leaping");
                        break;
                    case 9:
                         System.out.println("Nine ladies dancing");
                         break;
                    case 8:
                        System.out.println("Eight maids a-milking");
                        break;
                    case 7:
                        System.out.println("Seven swans a-swimming");
                        break;
                    case 6:
                        System.out.println("Six geese a-laying");
                        break;
                    case 5:
                        System.out.println("Five golden rings");
                        break;
                    case 4:
                        System.out.println("Four calling birds");
                        break;
                    case 3:
                        System.out.println("Three French hens");
                        break;
                    case 2:
                        System.out.println("Two turtle doves");
                        break;
                    case 1:
                        if (day > 1){
                            System.out.println("And a partridge in a pear tree");
                        }else {
                            System.out.println("A partridge in a pear tree");
                        }
                        break;
                }
            }
            System.out.println();
        }

    }

    private static String getDay(int day) {
        switch (day) {
            case 1: return "first";
            case 2: return "second";
            case 3: return "third";
            case 4: return "fourth";
            case 5: return "fifth";
            case 6: return "sixth";
            case 7: return "seventh";
            case 8: return "eighth";
            case 9 : return "ninth";
            case 10: return "tenth";
            case 11: return "eleventh";
            case 12: return "twelfth";
            default: return "";
        }
    }

}
