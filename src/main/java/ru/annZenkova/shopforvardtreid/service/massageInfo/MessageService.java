package ru.annZenkova.shopforvardtreid.service.massageInfo;

import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;

public interface MessageService {

    SendMessage massage(Update update);
}
