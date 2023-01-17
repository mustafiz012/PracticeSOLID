import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NotificationManager manager = new NotificationManager();
        Message message = new GPMessage();
        manager.sendNotification(message);

        ShapeManager shapeManager = new ShapeManager();
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(20));
        shapes.add(new Rectangle(2, 3));
        System.out.println(shapeManager.calculateTotalArea(shapes));


        LSPTester lspTester = new LSPTester();
        Rect r = new Square();
        //Height and width of Square must not be different but rect could be,
        // so we violate LSP here since we cannot substitute subtype/subclass (Square) by base type/ class (Rect)
        r.width = 10;
        r.height = 5;
        System.out.println(lspTester.calculateArea(r));
    }
}