import java.util.ArrayList;
import java.util.List;


public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }


    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        logger.log("Запускаем фильтрацию");
        for (Integer a : source) {
            if (a < treshold) {
                logger.log("Элемент " +  a + " проходит фильтрацию");
                result.add(a);
            } else {
                logger.log("Элемент " + a + " не проходит фильтрацию");
            }
        }
        logger.log("Фильтрация завершена");
        return result;
    }
}
