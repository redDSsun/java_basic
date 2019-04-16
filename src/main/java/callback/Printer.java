package callback;

public class Printer {
    void print(String value,Callback callback){
        if(value.equals("hello")){
            callback.success();
        }else{
            callback.failuer();
        }
    }
}
