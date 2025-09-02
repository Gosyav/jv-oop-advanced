package core.basesyntax.service;

import core.basesyntax.model.Circle;
import core.basesyntax.model.Figure;
import java.util.Random;

public class FigureSupplier {
    private Random random = new Random();

    public Figure getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();
        int randomIndex = random.nextInt(5) + 1;
        String color = colorSupplier.getRandomColor().toString();
        int radius;
        int width;
        int height;
        int base;
        int firstLeg;
        int secondLeg;
        int side;

        switch (randomIndex) {
            case 1:
                side = random.nextInt(10) + 1;
                return new core.basesyntax.model.Square(side, color);
            case 2:
                radius = random.nextInt(10) + 1;
                return new core.basesyntax.model.Circle(radius, color);
            case 3:
                width = random.nextInt(10) + 1;
                height = random.nextInt(10) + 1;
                return new core.basesyntax.model.Rectangle(width, height, color);
            case 4:
                firstLeg = random.nextInt(10) + 1;
                secondLeg = random.nextInt(10) + 1;
                return new core.basesyntax.model.RightTriangle(firstLeg, secondLeg, color);
            case 5:
                height = random.nextInt(10) + 1;
                base = random.nextInt(10) + 1;
                side = random.nextInt(10) + 1;
                return new core.basesyntax.model.IsoscelesTrapezoid(base, height, side, color);
            default:
                throw new RuntimeException("Can't create figure");
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "white");
    }
}
