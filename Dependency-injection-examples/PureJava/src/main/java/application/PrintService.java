package application;

public class PrintService {
    private final Print printer;

    public PrintService(Print printer){
        this.printer=printer;
    }
    public void printMessage(){
        printer.print();
    };
}
