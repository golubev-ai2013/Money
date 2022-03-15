import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practicum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму в современных рублях:");
        int amount = scanner.nextInt();

        System.out.println("Введите год (1913 или 1984)");
        //  System.out.println(amount/884);
        int year = scanner.nextInt();
        // double oldMoney = amount/884;
        // double newMoney = amount/337;
        switch (year) {
            case 1913:
                printPrices(year, amount / 884);
                break;
            case 1984:
                printPrices(year, amount / 337);
            default:
                System.out.println("Для этого года у нас нет данных.");
                break;
        }
        // Посчитайте, сколько у вас рублей для введённого года.
        // Реализуйте конвертацию для каждого случая.
        // Если для указанного года нет курса, то выведите сообщение
        // "Для этого года у нас нет данных." и прекратите выполнение метода.
        // Иначе вызовите метод printPrices.
    }

    public static void printPrices(int year, double amount) {
        System.out.println("В " + year + " году эта сумма приблизительно равнялась бы "
                + String.format("%,.2f", amount) + " р. "
                + "На эти деньги вы могли бы купить следующие товары:");

        HashMap<String, Double> prices = getPrices(year);
        // Найдите все значения, у которых цена меньше переданной суммы.
        // Определите количество товара, которое можно приобрести на переданную сумму.
        // Напечатайте значение в формате «<название> — <количество> шт.».
    }

    public static HashMap<String, Double> getPrices(int year) {
        HashMap<String, Double> prices = new HashMap<>();

        // Добавьте товары в prices в зависимости от значения переменной year.
        if (year == 1913) {

            // Цены 1913 года:
            prices.put("Корова", 60.0);
            prices.put("Курица", 0.60);
            prices.put("Рубашка", 1.0);
            prices.put("Шапка гусарская", 12.0);
            prices.put("Гармонь", 7.50);
            prices.put("Рояль", 200.0);
        }
        if (year == 1984) {
            // Цены 1984 года:
            prices.put("Банка сгущёнки", 0.55);
            prices.put("Автомобиль «Запорожец»", 5600.0);
            prices.put("Мороженое", 0.20);
            prices.put("Шапка-ушанка цигейковая", 14.0);
            prices.put("Шампанское «Советское»", 3.6);
            prices.put("Карта мира", 2.54);
            prices.put("Мотоцикл «Восход»", 450.0);
            prices.put("Портативный кассетный магнитофон «Весна-202-1»", 195.0);
            prices.put("Пальто осеннее", 100.0);
        }

        return prices;
    }
}
