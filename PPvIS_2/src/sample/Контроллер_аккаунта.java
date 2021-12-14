package sample;

import java.util.ArrayList;

public class Контроллер_аккаунта {
    private Аккаунт аккаунт;

    public ArrayList<Заказ> История(Аккаунт аккаунт) {
        return new ArrayList<Заказ>();
    };
    public void Удаление(Аккаунт аккаунт) {};
    public void Очистка_истории(Аккаунт аккаунт) {};
    public void Привязать_карту(Аккаунт аккаунт) {};
    public void Отклик_исполнителя(Исполнитель исполнитель) {};
    public void Оставление_отзыва_и_оценки(Аккаунт аккаунт1, Аккаунт аккаунт2, String отзыв, int оценка) {};
}
