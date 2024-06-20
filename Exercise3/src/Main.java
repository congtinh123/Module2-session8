public class Main {
    public static void main(String[] args) {
        Point p = new Point(1, 2);
        System.out.println(p.toString());
        float[] xy = p.getXY();
        System.out.println("poin: (" + xy[0] + ", " + xy[1] + ")");


        MoveablePoint m = new MoveablePoint(1, 2, 3, 4);
        System.out.println(m.toString());
        System.out.println("key qua la: " + m.move());
        float[] ab = m.getSpeed();
        System.out.println("speed: (" + ab[0] + ", " + ab[1] + ")");
    }
}