package callback;

public class People implements Callback{
    @Override
    public void success() {
        System.out.println("print success");
    }

    @Override
    public void failuer() {
        System.out.println("print failuer");
    }

    Printer printer = new Printer();

    void needPrint(String value){
        printer.print(value,this);
}
}
