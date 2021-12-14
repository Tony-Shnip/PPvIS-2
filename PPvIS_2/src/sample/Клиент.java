package sample;

import java.util.ArrayList;

public class Клиент extends Аккаунт {
    private ArrayList<Заказ> история_заказов;
    private String банковская_карта;

    public ArrayList<Заказ> Получение_истории() {
        return new ArrayList<Заказ>();
    };
    public void Очистка_истории() {};
    public void Привязать_карту() {};
}
