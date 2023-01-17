import javax.xml.crypto.Data;
import java.io.File;

//This class violates Single Responsibility Principle because it has more than one responsibility
class Task {
    void downloadFile(String path) {

    }

    void parseFile(File file) {

    }

    void saveData(Data data) {

    }
}

//It has also more than one responsibility
class Employee {
    double calculatePayment() {
        return 0;
    }

    void reportHours() {

    }

    void save() {

    }
}