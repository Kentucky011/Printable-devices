public class App {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Mfd mfd = new Mfd();
        Cashprinter cashprinter = new Cashprinter();
        printer.print();
        mfd.print();
        cashprinter.print();
    }

    public static class Printer implements Pritables {
        public void print() {
            System.out.println("Документ для печати отправлен на принтер.");
        }
    }
    public static class Mfd implements Pritables {
        public void print() {
            System.out.println("Документ для печати отправлен на многофункциональное устройство.");
        }
    }
    public static class Cashprinter implements Pritables {
        public void print(){
            System.out.println("Печатается кассовый чек");
        }
    }
}
