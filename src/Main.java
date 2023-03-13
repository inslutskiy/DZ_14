import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> listLower = new ArrayList<>();

        while (true){
            System.out.println("******************************");
            System.out.println("Выберите операцию:");
            System.out.println("1 - Добавить продукт в список.");
            System.out.println("2 - Показать список.");
            System.out.println("3 - Удалить продукт из списка.");
            System.out.println("4 - Поиск по списку.");
            System.out.println("******************************");

            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();

            switch (a) {
                case 1:
                    System.out.println("Для добавления введите название.");
                    Scanner scanner1 = new Scanner(System.in);
                    String add = scanner1.nextLine();
                    list.add(add);
                    System.out.println("Итого в списке покупок: " + list.size());
                    break;
                case 2:
                    System.out.println("******************************");
                    for (int i = 0; i < list.size(); i++){
                        System.out.println((i + 1) + ": " + list.get(i));
                    }
                    System.out.println("******************************");
                    break;
                case 3:
                    System.out.println("******************************");
                    System.out.println("Введите номер или название товара.");
                    for (int i = 0; i < list.size(); i++){
                        System.out.println((i + 1) + ": " + list.get(i));
                    }
                    System.out.println("******************************");

                    Scanner scanner2 = new Scanner(System.in);
                    String input = scanner2.nextLine();

                    try {
                        int remI = (Integer.parseInt(input) - 1);
                        list.remove(remI);
                    } catch (NumberFormatException e) {
                        String remS = input;
                        list.remove(remS);
                        System.out.println(list);
                        continue;
                    }
                    System.out.println(list);
                    break;
                case 4:
                    for (int i = 0; i < list.size(); i++) {
                        String b = list.get(i);
                        String c = b.toLowerCase();
                        listLower.add(c);
                    }

                    System.out.println("Для поиска введите название.");
                    Scanner scanner3 = new Scanner(System.in);
                    String search = scanner3.nextLine().toLowerCase();

                    for (int i = 0; i < listLower.size(); i++) {
                        String product = listLower.get(i);
                        if (product.contains(search)){
                            System.out.println((i+1) + ": " + list.get(i));
                        }
                    }

                    break;
                default:
                    System.out.println("Неверный номер действия!");
                    break;
            }
        }
    }
}


//


