package lesson_4;

// IsEven — ему дают целое число, 
// он одобряет его, если оно чётное

public class IsEven<T> implements IsGood<T> {

    @Override
    public boolean isGood(T number) {
        if (number instanceof Integer){
            if((Integer)number % 2 == 0){
                return true;
            }
        }
        return false;
    }
}
