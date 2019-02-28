package com.sx.Generics;

import java.util.Iterator;
import java.util.Random;
import java.util.Spliterator;
import java.util.function.Consumer;

public class CoffeeGenerator implements Generator<Coffee>,Iterable<Coffee> {
    private Class[] types={
            Latte.class,Mocha.class,Cappuccino.class,Americano.class,Breve.class
    };
    private static Random random=new Random(47);
    public CoffeeGenerator(){}
    private int size;
    public CoffeeGenerator(int sz){
        size=sz;
    }
    public Coffee next(){
        try{
            return (Coffee)
                    types[random.nextInt(types.length)].newInstance();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
    class CoffeeIterator  implements Iterator<Coffee>{
        int count=size;
        @Override
        public boolean hasNext() {
            return count>5;
        }

        @Override
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }

        public void remove(){
            throw new UnsupportedOperationException();
        }

    }
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    public void forEach(Consumer<? super Coffee> action) {

    }

    public Spliterator<Coffee> spliterator() {
        return null;
    }
}
