import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Logger logger = Logger.getInstance();
        Random random = new Random();
        logger.log("Просим пользователя ввести данные для списка:");
        System.out.println("Введите размер списка:");
        int value = Integer.parseInt(scan.nextLine());
        System.out.println("Введите верхную границу для значений:");
        int maxValue = Integer.parseInt(scan.nextLine());
        logger.log("Создаем и наполняем список");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < value; i++) {
            list.add(random.nextInt(maxValue));
        }
        logger.log("Показываем список");
        System.out.println(list);
        logger.log("Просим пользователя ввести данные для фильтрации");
        System.out.println("Введите порог для фильтра");
        int treshold = Integer.parseInt(scan.nextLine());
        Filter filter = new Filter(treshold);
        List<Integer> result = filter.filterOut(list);
        logger.log("Показываем отфильтрованный список");
        System.out.println(result);
        logger.log("Завершаем работу программы");


    }
}
