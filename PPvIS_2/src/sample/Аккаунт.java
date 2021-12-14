package sample;

import java.util.Vector;

public class Аккаунт {
    private String логин;
    private int пароль;
    private String информация;
    private String номер_телефона;
    private String тип;
    private double рейтинг;
    private Vector<String> отзывы;
    private String почта;

    public void Регистрация() {};
    public void Изменение_рейтинга(int оценка) {};
    public void Оставление_отзыва(String отзыв) {};
}
