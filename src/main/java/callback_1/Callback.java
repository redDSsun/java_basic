package callback_1;

public abstract class Callback {
    abstract void onSuccess();
    abstract void onFailuer();
    public void print(){
        System.out.println("callback");
    }
}
