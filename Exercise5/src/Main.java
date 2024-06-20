public class Main {
    public static void main(String[] args) {
        // Tính diện tích hình tròn
        double circleArea1 = StaticMethod.calCircleArea(3.5);
        double circleArea2 = StaticMethod.calCircleArea(6.0);

        // Tính diện tích hình tam giác
        double triangleArea1 = StaticMethod.calTriangleArea(3, 4, 5);
        double triangleArea2 = StaticMethod.calTriangleArea(4.5, 7, 6);

        // Tính diện tích hình chữ nhật
        double rectangleArea1 = StaticMethod.calRectangleArea(2.5, 6);
        double rectangleArea2 = StaticMethod.calRectangleArea(4, 7);

        // In kết quả ra màn hình
        System.out.println("Diện tích hình tròn với bán kính 3.5: " + circleArea1);
        System.out.println("Diện tích hình tròn với bán kính 6.0: " + circleArea2);

        System.out.println("Diện tích hình tam giác với các cạnh (3, 4, 5): " + triangleArea1);
        System.out.println("Diện tích hình tam giác với các cạnh (4.5, 7, 6): " + triangleArea2);

        System.out.println("Diện tích hình chữ nhật với kích thước (2.5, 6): " + rectangleArea1);
        System.out.println("Diện tích hình chữ nhật với kích thước (4, 7): " + rectangleArea2);
    }
}
