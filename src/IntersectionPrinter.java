public class IntersectionPrinter {

    public static Rectangle r1;
    public static Rectangle r2;

    public static void main(String[] args) {

        r1 = new Rectangle(0, 0, 10, 50);
        System.out.println(r1);

        r2 = new Rectangle(20, 5, 15, 40);
        System.out.println(r2);


        Rectangle r4 = r1.intersection(r2);
        System.out.println(r4);

        r2.setX_Left(r2.getX_Left() + 50);
        r2.setX_Right();
        r2.setY_Top(r2.getY_Top() + 50);
        r2.setY_Bottom();
        System.out.println(r1.intersection(r2));

    }
}
