package callback_1;

public class Cinema {
    int ticket = 1;
    public void saleTicket(Callback callback){
        if(ticket > 0){
            -- ticket;
            callback.onSuccess();
        }else {
            callback.onFailuer();
        }
    }
}
