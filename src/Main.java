import java.sql.Time;

public class Main {
    public static void main(String[] args) {
        Times favoriteTimes = Times.WINTER;

        printFavoriteTimesMessage(favoriteTimes);
        System.out.println();
        Times[] times = Times.values();
        for(Times qwe : times){
            System.out.print(qwe + " ");qwe.getDiscription();
        }
    }
    public static void printFavoriteTimesMessage(Times Times) {
        switch (Times) {
            case WINTER:
                System.out.println("Я люблю зиму");
                Times.getDiscription();
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                Times.getDiscription();
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                Times.getDiscription();
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                Times.getDiscription();
                break;
            default:
                System.out.println("Неизвестное время года");
        }
    }
}