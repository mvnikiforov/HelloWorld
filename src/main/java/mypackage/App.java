package mypackage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
    // инициация логирования
    private static Logger log = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        System.out.println("Hello World!");
        log.trace("выполнен вывод в консоль Hello World!");
        log.debug("выполнен вывод в консоль Hello World!");
        log.info("выполнен вывод в консоль Hello World!");
        log.warn("выполнен вывод в консоль Hello World!");
        log.error("выполнен вывод в консоль Hello World!");
        log.fatal("выполнен вывод в консоль Hello World!");
    }
}
