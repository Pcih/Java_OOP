package lesson_4;

import java.util.ArrayList;
import java.util.List;

// Создайте обобщённую функцию filter. 
// Ей дают любую коллекцию любого типа, 
// и одобрятель IsGood.
// Функция возвращает новую коллекцию, 
// куда входят только одобренные элементы из коллекции.
// Продемонстрируйте, что это работает.

public class Filter<T> implements IsGood<T> {

    public List<T> filter(List<T> lst) {
        List<T> newLst = new ArrayList<>();
        for (T number : lst) {
            if (isGood(number) == true) newLst.add(number);
        }
        return newLst;
    }

    @Override
    public boolean isGood(T item) {
        if (item instanceof Integer) {
            if ((Integer) item >= 0) {
                return true;
            }
        }
        return false;
    }
}
