
package bot.telegram_bot;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

 public class bot extends TelegramLongPollingBot {

    @Override
    public String getBotToken() {
        return "5539854224:AAFrgMupXvy7kZiEMK2B2K5gsxRRMKHvAww";

       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void onUpdateReceived(Update update) {
       // System.out.println(update.getMessage().getText());
        String command = update.getMessage().getText();
        SendMessage display = new SendMessage();
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
                if (command.equals ("/firstname")) {
                    System.out.println(update.getMessage().getFrom().getFirstName()); 
                    display.setText(update.getMessage().getFrom().getFirstName());
        }
                if (command.equals("/lastname")) {
                    System.out.println(update.getMessage().getFrom().getLastName());
                    display.setText(update.getMessage().getFrom().getLastName());
        }
                if (command.equals("/fullname")) {
                    System.out.println(update.getMessage().getFrom().getFirstName() + " " + update.getMessage().getFrom().getLastName());
                    display.setText(update.getMessage().getFrom().getFirstName()+ " " + update.getMessage().getFrom().getLastName());
        }
                display.setChatId(update.getMessage().getChatId());
                
        try {
            execute(display);
        } catch (TelegramApiException ex) {
            Logger.getLogger(bot.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }

    @Override
    public String getBotUsername() {
        return "L_ynk_bot";
        //throw new UnsupportedOperationException("L_ynk_bot"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }
    

 //   @Override
   // public String getBotUsername() {
     //  return "L_ynk_bot";
       // //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    
     
     

    

