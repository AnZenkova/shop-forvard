package ru.annZenkova.shopforvardtreid.service.action;

import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;

public interface ActionService {

    SendMessage welcomeShop(Update update);
}
