package Lab6;

import java.time.DayOfWeek;
import java.time.ZonedDateTime;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args) {
        //*************Ex1
        //#1
        Supplier authorName = () -> "Denys Khymach";
        System.out.println(authorName.get());

        //#2
        GregorianCalendar GregCal = new GregorianCalendar();
        ZonedDateTime zdt = GregCal.toZonedDateTime();
        DayOfWeek dow = zdt.getDayOfWeek();
        Supplier  dayOfWeek = () -> dow.toString();
        System.out.println(dayOfWeek.get());

        //#3
        String[] letters = {"й", "ц", "у", "к", "е", "н", "г", "ш", "щ", "з", "х", "ф", "і", "в", "а", "п", "р", "о", "л", "д", "ж", "э", "я", "ч", "с", "м", "и", "т", "ь", "б", "ю", "ї"};
        Supplier  randomWord = () -> {
            Random random = new Random();
            String word = new String();
            for (int i = 0; i < random.nextInt(8) + 2; i++)
            {
                word = word + letters[random.nextInt(31)];
            }
            return word;
        };
        System.out.println(randomWord.get());

        //*************Ex2
        //#1
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        Function<Integer,String> intToWord = x -> numbers[x];
        System.out.println(intToWord.apply(5));

        //#2
        Function<Integer,String> randWord = x -> {
            String word = new String();
            for (int i = 0; i < x; i++)
            {
                Random random = new Random();
                word = word + letters[random.nextInt(31)];
            }
            return word;
        };
        System.out.println(randomWord.get());

        //#3
        Function<Integer,String> kvadrat = x ->
        { if (Math.sqrt(x) % 1 == 0)
        {
            return "Квадрат";
        }
        else return "Не квадрат";
        };
        System.out.println(kvadrat.apply(16));


        //*************Ex3
        //#1
        UnaryOperator<String> invertedStr = x -> {
            StringBuffer buffer = new StringBuffer(x);
            return buffer.reverse().toString();
        };
        System.out.println(invertedStr.apply("привіт"));

        //#2
        UnaryOperator<String> strWithoutNumbers = x -> x.replaceAll("\\d", "");
        System.out.println(strWithoutNumbers.apply("Hel11l00o4"));

        //#3
        UnaryOperator<String> palindrom = word -> {
            StringBuffer buffer = new StringBuffer(word);
            String y = buffer.reverse().toString();
            if (word == y)
            {
                return "Паліндром";
            }
            else return "Не паліндром";
        };
        System.out.println(palindrom.apply("шалаш"));

    }
}
