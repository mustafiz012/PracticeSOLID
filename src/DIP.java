class LoggerA {
    String message;

    public LoggerA(String message) {
        this.message = message;
    }
}

class LoggerB {
    String message;

    public LoggerB(String message) {
        this.message = message;
    }
}

class WrongDipTester {
    void logFromLoggerA(LoggerA loggerA) {

    }

    void logFromLoggerB(LoggerB loggerB) {

    }
}


// Below implementations are not violating DIP

abstract class FlutterLoggerClient {
    abstract void log(String message);
}

class ConsoleLoggerClient extends FlutterLoggerClient {

    @Override
    void log(String message) {

    }
}

class FileLoggerClient extends FlutterLoggerClient {

    @Override
    void log(String message) {

    }
}

class DipTester {
    void doLog(FlutterLoggerClient client, String message) {
        client.log(message);
    }
}