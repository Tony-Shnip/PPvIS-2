package sample;

import java.util.Vector;

public class Экран_добавления_заказа {
    private Контроллер_заказов контроллер_заказов;
    private String логин;
    private Заказ заказ;

    public void Показать_окно() {};
    public void Закрыть_окно() {};
    public Заказ Формирование_заказа(String дата_создания, String категория_заказа, int вероятная_оплата, String статус, Vector<Исполнитель> исполнитель) {
        Заказ заказ = new Заказ();
        return заказ;
    };
    public void Добавление_заказа(Заказ заказ) {};
}
