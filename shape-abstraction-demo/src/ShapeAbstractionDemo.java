import com.kodtodya.practice.abstraction.service.CircleShapeService;
import com.kodtodya.practice.abstraction.service.SquareShapeService;

public class ShapeAbstractionDemo {
    public static void main(String[] args) {
        CircleShapeService circleShapeService = new CircleShapeService();

        circleShapeService.draw();
        circleShapeService.display();

        SquareShapeService squareShapeService = new SquareShapeService();

        squareShapeService.draw();
        squareShapeService.display();
    }
}