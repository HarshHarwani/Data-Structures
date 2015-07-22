package stackqueue;

import java.util.LinkedList;

public abstract class Animal {

    public String name;
    public int order;

    Animal(String name) {
        this.name = name;
        this.order = 0;
    }

    public boolean isOlder(Animal a) {
        return this.order < a.order;
    }
}

class AnimalQueue {
    private int order = 0;
    LinkedList<Dog> dlist = new LinkedList<>();
    LinkedList<Cat> clist = new LinkedList<>();

    public void push(Animal a) {
        a.order = order;
        order++;
        if (a instanceof Dog) {
            dlist.add((Dog) a);
        } else if (a instanceof Cat) {
            clist.add((Cat) a);
        }
    }

    public Animal pop() {
        if (dlist.isEmpty() && clist.isEmpty()) {
            return null;
        } else if (dlist.isEmpty()) {
            return clist.poll();
        } else if (clist.isEmpty()) {
            return dlist.poll();
        } else {
            Dog d = dlist.peek();
            Cat c = clist.peek();
            if (c.isOlder(d))
                return clist.poll();
            else
                return dlist.poll();
        }

    }
}

class Dog extends Animal {

    Dog(String name) {
        super(name);
    }
}

class Cat extends Animal {

    Cat(String name) {
        super(name);
    }
}
