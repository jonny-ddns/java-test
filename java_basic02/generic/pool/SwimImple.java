package java_basic02.generic.pool;

public class SwimImple<T> implements Swim<T> {

    T t;

    @Override
    public void setWhere(T t) {
        this.t = t;
    }

    @Override
    public void swim() {
        System.out.println(t+ "에서 수영");
    }
}
