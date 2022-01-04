package mypackage;

import org.apache.log4j.Logger;

public class App {
    // инициация логирования
    private static Logger log = Logger.getLogger(App.class);

    public static void main(String[] args) {
        System.out.println("Hello World!");
        log.info("выполнен вывод в консоль Hello World!")


        System.out.println("Second string");
        System.out.println("Third string");
    }
}
