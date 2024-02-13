import ex.DeviceUnavailableException;

public class App {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Mfd mfd = new Mfd();
        Cashprinter cashprinter = new Cashprinter();
        try {
            printer.print();
        } catch (DeviceUnavailableException e) {
            System.out.println("Принтер не найден.");
        }
        try {
            mfd.print();
        } catch (DeviceUnavailableException e) {
            System.out.println("Многофункциональное устройство не найдено.");
        }
        try {
            cashprinter.print();
        } catch (DeviceUnavailableException e) {
            System.out.println("Кассовый принтер не найден.");
        }
    }


    public static class Printer implements Pritables {
        public void print() throws DeviceUnavailableException {
            System.out.println("Документ для печати отправлен на принтер.");
        }
    }

    public static class Mfd implements Pritables {
        public void print() throws DeviceUnavailableException {
            System.out.println("Документ для печати отправлен на многофункциональное устройство.");
        }
    }

    public static class Cashprinter implements Pritables {
        public void print() throws DeviceUnavailableException {
            System.out.println("Печатается кассовый чек");
        }
    }
}
