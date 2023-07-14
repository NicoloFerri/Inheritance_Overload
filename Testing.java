package javaOOPAdvanced_V2.Inheritance_Overload;

public class Testing {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        Shape s2 = new Shape(3.2);
        Shape s3 = new Shape (5,4.8);
        Shape s4 = new Shape ( 17,2.6,5.7);
        Shape s5 = new Shape(3,5.9,2.6,4.3);

        System.out.println("\n");
        System.out.println(s1.getShapeDetails());
        System.out.println(s2.getShapeDetails());
        System.out.println(s3.getShapeDetails());
        System.out.println(s4.getShapeDetails());
        System.out.println(s5.getShapeDetails());

    }
}
