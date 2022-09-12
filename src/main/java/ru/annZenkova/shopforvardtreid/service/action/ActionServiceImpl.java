package ru.annZenkova.shopforvardtreid.service.action;

import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;
import org.springframework.stereotype.Service;
import ru.annZenkova.shopforvardtreid.constant.Keyboards;
import ru.annZenkova.shopforvardtreid.constant.Message;

@Service
public class ActionServiceImpl implements ActionService{

    public SendMessage welcomeShop(Update update) {

        String text = update.message().text();
        Long chatId = update.message().chat().id();

        return new SendMessage(chatId, Message.WELCOME_SHOP).replyMarkup(Keyboards.WELCOME_SHOP);
    }
}
