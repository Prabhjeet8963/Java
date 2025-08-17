package Generics;

public class Box<T> {
    
    T item;    // T can be String, Integer, Boolean, etc.

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem(){
        return this.item;
    }
}
