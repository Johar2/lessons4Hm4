import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> listA = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите строку для списка A: ");
            String input = scanner.nextLine();
            listA.add(input);
        }
        System.out.println("Список A: " + listA);

        List<String> listB = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите строку для списка B: ");
            String input = scanner.nextLine();
            listB.add(input);
        }
        System.out.println("Список B: " + listB);

        List<String> listC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(4 - i));
        }
        System.out.println("Объединенный список C: " + listC);

        Collections.sort(listC, Comparator.comparingInt(String::length));
        System.out.println("Отсортированный список C: " + listC);
    }
}
