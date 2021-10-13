public class Rectangle {

    public int x_Left;
    public int x_Right;
    public int y_Top;
    public int y_Bottom;
    public int height;
    public int width;

    public Rectangle(int x_Left, int y_Top, int height, int width) {
        this.x_Left = x_Left;
        this.y_Top = y_Top;
        this.height = height;
        this.width = width;
        setX_Right();
        setY_Bottom();
    }

    public int getX_Left() {
        return x_Left;
    }

    public void setX_Left(int x_Left) {
        this.x_Left = x_Left;
    }

    public int getX_Right() {
        return x_Right;
    }

    public void setX_Right() {
        this.x_Right = this.x_Left + width;
    }

    public int getY_Top() {
        return y_Top;
    }

    public void setY_Top(int y_Top) {
        this.y_Top = y_Top;
    }

    public int getY_Bottom() {
        return y_Bottom;
    }

    public void setY_Bottom() {
        this.y_Bottom = this.y_Top + this.height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
        setY_Bottom();
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
        setX_Right();
    }

    public Rectangle intersection(Rectangle thatRec) {

        int xMin = Math.max(this.x_Left, thatRec.x_Left);
        int xMax = Math.min(this.x_Right, thatRec.x_Right);

        if (xMax > xMin) {

            int yMin = Math.max(this.y_Top, thatRec.y_Top);
            int yMax = Math.min(this.y_Bottom, thatRec.y_Bottom);

            if (yMax > yMin) {
                System.out.println();
                System.out.println("As a result of the intersection, the following rectangle is formed.");
                return new Rectangle(xMin, yMin, yMax - yMin, xMax - xMin);
            }
            else if (yMax == yMin) {
                System.out.println();
                System.out.println("As a result of the intersection, the following horizontal line is formed.");
                return new Rectangle(xMin, yMin, 0, xMax - xMin);
            }
        }
        else if(xMax == xMin){

            int yMin = Math.max(this.y_Top, thatRec.y_Top);
            int yMax = Math.min(this.y_Bottom, thatRec.y_Bottom);

            if (yMax > yMin) {
                System.out.println();
                System.out.println("As a result of the intersection, the following vertical line is formed.");
                return new Rectangle(xMin, yMin, yMax - yMin, 0);
            }
            else if (yMax == yMin) {
                System.out.println();
                System.out.println("As a result of the intersection, the following Point is formed.");
                return new Rectangle(xMin, yMin, 0, 0);
            }
        }
        System.out.println();
        System.out.println("No intersection or overlap!");
        return null;

        // There is no overlap or intersection if the rectangle with the bigger x_left value is to the right of the rectangle with the smaller x_right value (xMin > xMax)
        // and the rectangle with the bigger y_top value is located lower than the rectangle with the smaller y_bottom value (yMin > yMax).
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x_Left=" + x_Left +
                ", x_Right=" + x_Right +
                ", y_Top=" + y_Top +
                ", y_Bottom=" + y_Bottom +
                '}';
    }
}
