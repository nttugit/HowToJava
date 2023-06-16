import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyIntegerIterable implements  Iterable<Integer>{
    private int numbers[];


    public MyIntegerIterable(int[] numbers){
    this.numbers = numbers;
    }

    public MyIntegerIterable(){
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements  Iterator<Integer>{
        private int index;

        @Override
        public boolean hasNext() {
            return index < numbers.length;
        }

        @Override
        public Integer next() {
            return numbers[index++];
        }
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<Integer> spliterator() {
        return Iterable.super.spliterator();
    }

    public static void main(String[] args) {
        int numbers [] = new int[]{1,2,31};
        MyIntegerIterable myIntegerIterable = new MyIntegerIterable(numbers);
        for(int num : myIntegerIterable){
            System.out.println(num);
        }
        myIntegerIterable.forEach(System.out::println);
    }
}

