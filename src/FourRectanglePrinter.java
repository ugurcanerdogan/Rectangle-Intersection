public class FourRectanglePrinter {

    public static Rectangle box;

    public static void main(String[] args) {

        box = new Rectangle(0, 0, 10, 10);
        System.out.println(box);

        box.setX_Left(box.getX_Left() + box.getWidth());
        box.setX_Right();
        System.out.println(box);

        box.setX_Left(box.getX_Left() - box.getWidth());
        box.setX_Right();
        box.setY_Top(box.getY_Top() + box.getHeight());
        box.setY_Bottom();
        System.out.println(box);

        box.setX_Left(box.getX_Left() + box.getWidth());
        box.setX_Right();
        System.out.println(box);

    }
}
