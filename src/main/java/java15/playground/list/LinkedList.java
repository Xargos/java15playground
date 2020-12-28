package java15.playground.list;

public sealed interface LinkedList<T> {

    default LinkedList<T> addElement(LinkedList<T> list, T i) {
        if(link)
    }

    record Nil<T>() implements LinkedList<T> {

    }

    record Cons<T>(T value, LinkedList<T> next) implements LinkedList<T> {

    }
}

