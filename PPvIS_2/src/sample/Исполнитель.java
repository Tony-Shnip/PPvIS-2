package sample;

import java.util.ArrayList;
import java.util.Vector;

public class Исполнитель extends Аккаунт {
    private Vector<String> виды_работ;
    private ArrayList<Заказ> История_работ;
    private ArrayList<Заказ> Заказы_в_работе;

    public void Отклик() {};
    public void Очистка_истории() {};
    public ArrayList<Заказ> Получение_истории() {
        return new ArrayList<Заказ>();
    };
}
