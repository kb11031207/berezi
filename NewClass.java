package bot.telegram_bot;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

/**
 *
 * @author K.B
 */
public class NewClass {
    public static void main(String[] args){
 
           try {
                TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
                telegramBotsApi.registerBot(new bot());
                
                
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        
    }
}
