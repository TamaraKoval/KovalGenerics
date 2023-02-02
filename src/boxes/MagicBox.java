package boxes;

import java.util.Arrays;
import java.util.Random;

public class MagicBox<T> {
    protected T[] items;

    public T[] getItems() {
        return items;
    }

    public MagicBox(int maxItems) {
        this.items = (T[]) new Object[maxItems];
    }

    @Override
    public String toString() {
        return ("В коробке сейчас лежат: " + Arrays.toString(items));
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public void pick() throws Exception {
        int k = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                k++;
            }
        }
        if (k > 0) {
            throw new Exception("Коробка не заполнена, осталось заполнить ячеек: " + k);
        } else {
            Random random = new Random();
            int randomInt = random.nextInt(items.length);
            System.out.println("Магическая коробка решила вернуть тебе: " + items[randomInt]);
        }
    }
}
