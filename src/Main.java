import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> listLower = new ArrayList<>();

        while (true){
            extracted();

            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();

            switch (a) {
                case 1 -> {
                    System.out.println("Для добавления введите название.");
                    list.add(getString());
                    System.out.println("Итого в списке покупок: " + list.size());
                }
                case 2 -> extracted(list);
                case 3 -> {
                    System.out.println("Введите номер или название товара.");
                    extracted(list);
                    String input = getString();
                    try {
                        list.remove((Integer.parseInt(input) - 1));
                    } catch (NumberFormatException e) {
                        list.remove(input);
                        System.out.println(list);
                        continue;
                    }
                    System.out.println(list);
                }
                case 4 -> {
                    for (String b : list) {
                        listLower.add(b.toLowerCase());
                    }
                    System.out.println("Для поиска введите название.");
                    String search = getString().toLowerCase();
                    for (int i = 0; i < listLower.size(); i++) {
                        String product = listLower.get(i);
                        if (product.contains(search)) {
                            System.out.println((i + 1) + ": " + list.get(i));
                        }
                    }
                }
                default -> System.out.println("Неверный номер действия!");
            }
        }
    }

    private static String getString() {
        Scanner scannerS = new Scanner(System.in);
        return scannerS.nextLine();
    }

    private static void extracted() {
        System.out.println("------------------------------");
        System.out.println("Выберите операцию:");
        System.out.println("1 - Добавить продукт в список.");
        System.out.println("2 - Показать список.");
        System.out.println("3 - Удалить продукт из списка.");
        System.out.println("4 - Поиск по списку.");
    }

    private static void extracted(List<String> list) {
        System.out.println("------------------------------");
        for (int i = 0; i < list.size(); i++){
            System.out.println((i + 1) + ": " + list.get(i));
        }
    }
}


//


