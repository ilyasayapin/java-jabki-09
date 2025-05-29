package workshop;

import javax.swing.*;
import java.util.Arrays;

public class ProArrayList {

    private static final int DEFAULT_CAPACITY = 10;

    private String[] data;

    private int size;

    public ProArrayList() {
        this.data = new String[DEFAULT_CAPACITY];
        this.size = 0;
    }

    public void add(String element) {
        provideCapacity();
        this.data[this.size++] = element;
    }

    // Получить размер листа
    public int size() {
        return this.size;
    }

    // Добавить элемент по индексу
    public void add(int index, String element) {
        provideCapacity();
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = element;
        this.size ++;
    }

    // Получить элемент по индексу
    public String get(int index) {
        return data[index];
    }

    private void provideCapacity() {
        if (this.size >= this.data.length) {
            grow();
        }
    }

    private void grow() {
        int newCapacity = this.data.length * 2;
        this.data = Arrays.copyOf(this.data, newCapacity);
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.stream(this.data).limit(this.size).toArray());
    }
}

