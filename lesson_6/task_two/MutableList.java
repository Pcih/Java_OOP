package lesson_6.task_two;

import java.util.ArrayList;

// - MutableList<T> — коллекция, 
// которая допускает изменения. 
// Методы:
// getSize ()
// get (int i)
// set (int i, T newValue)
// add (T newValue)
// remove (T value)

public class MutableList<T> extends AbstractList<T> {

    public MutableList() {
        this.spisok = new ArrayList<>();
    }

    @Override
    public void spisok(){
        System.out.println(spisok);
    }
    @Override
    public void getInt(int i) {
        System.out.println(spisok.get(i));
    }

    @Override
    public void getSize() {
        System.out.println(spisok.size());
    }

    public void addInList(T i){
        spisok.add(i);
    };

    public void removeInList(T i){
        spisok.remove(i);
    };
}
