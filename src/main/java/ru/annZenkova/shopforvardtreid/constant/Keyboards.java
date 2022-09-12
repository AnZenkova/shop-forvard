package ru.annZenkova.shopforvardtreid.constant;

import com.pengrad.telegrambot.model.request.Keyboard;
import com.pengrad.telegrambot.model.request.ReplyKeyboardMarkup;

public final class Keyboards {

    public static Keyboard WELCOME_SHOP = new ReplyKeyboardMarkup(
            "Каталог", "Сделать заказ", "Связаться с менеджером")
            .oneTimeKeyboard(true)
            .resizeKeyboard(true)
            .selective(true);
}
