package ru.annZenkova.shopforvardtreid.telegram;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.Update;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import ru.annZenkova.shopforvardtreid.service.massageInfo.MessageService;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class TelegramBotUpdatesListener implements UpdatesListener {

    private final Logger logger = LoggerFactory.getLogger(TelegramBotUpdatesListener.class);
    private final TelegramBot telegramBot;
    private final MessageService massageInfoService;

    public TelegramBotUpdatesListener(TelegramBot telegramBot, MessageService massageInfoService) {
        this.telegramBot = telegramBot;
        this.massageInfoService = massageInfoService;
    }

    @PostConstruct
    public void init() {
        telegramBot.setUpdatesListener(this);
    }

    @Override
    public int process(List<Update> updates) {
        updates.forEach(update -> {
            logger.info("Processing update: {}", update);

            telegramBot.execute(massageInfoService.massage(update));
        });

        return UpdatesListener.CONFIRMED_UPDATES_ALL;
    }
}
