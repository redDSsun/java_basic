package callback_1;

public class People{
    Cinema cinema = new Cinema();
    void buyTicket(){
        cinema.saleTicket(new Callback() {
            @Override
            void onSuccess() {
                System.out.println("success");
            }

            @Override
            void onFailuer() {
                System.out.println("failure");
            }
        });
    }


}
