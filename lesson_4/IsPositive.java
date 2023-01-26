package lesson_4;

// IsPositive — ему дают целое число, 
// он одобряет его, если оно положительное

public class IsPositive<T> implements IsGood<T>{

    @Override
    public boolean isGood(T number) {
        if (number instanceof Integer){
            if((Integer)number >= 0){
                return true;
            }
        }
        return false;
    }
}
