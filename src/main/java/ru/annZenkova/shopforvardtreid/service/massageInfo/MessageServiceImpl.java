package ru.annZenkova.shopforvardtreid.service.massageInfo;

import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.request.SendMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.annZenkova.shopforvardtreid.constant.Message;
import ru.annZenkova.shopforvardtreid.service.action.ActionService;
import ru.annZenkova.shopforvardtreid.telegram.TelegramBotUpdatesListener;

@Service
public class MessageServiceImpl implements MessageService {

    private final Logger logger = LoggerFactory.getLogger(TelegramBotUpdatesListener.class);
    @Autowired
    ActionService actionService;

    public SendMessage massage(Update update) {

        String text = update.message().text();
        Long chatId = update.message().chat().id();

        switch (text) {
            case "/start":
                logger.info("Бот приветствует пользователя");
                return actionService.welcomeShop(update);
        }

        return null;
    }
}
