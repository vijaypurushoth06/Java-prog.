package Abstract_class_and_Interface;

import java.util.Scanner;

interface RegularPolygon {
    abstract int getNumSides();

    abstract int getSideLength();

    static int totalSides(RegularPolygon Rp[]) {
        int sides = 0;
        for (RegularPolygon x : Rp) {
            sides += x.getNumSides();
        }
        return sides;
    }

    default int getPerimeter() {
        return getNumSides() * getSideLength();
    }

    default double getInteriorAngle() {
        double res = (180 * getNumSides() - 360) / getNumSides();
        return res;
    }
}

class EquilateralTriangle implements RegularPolygon {
    int side_len = 0;

    EquilateralTriangle(int side_len) {
        this.side_len = side_len;
    }

    public int getNumSides() {
        return 3;
    }

    public int getSideLength() {
        return side_len;
    }
}

class Square implements RegularPolygon {
    int side_len = 0;

    Square(int side_len) {
        this.side_len = side_len;
    }

    public int getNumSides() {
        return 4;
    }

    public int getSideLength() {
        return side_len;
    }
}

public class Ex4_2 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        RegularPolygon polygons[] = null;
        int temp, tp, t = 0;
        while (true) {
            try {
                System.out.println("1.Equilateral Triangle Operations\n2.Square Operation\nEnter your choice : ");
                temp = scan.nextInt();

                switch (temp) {

                    case 1:
                        if (polygons != null) {
                            if (polygons[0] instanceof Square) {
                                polygons = null;
                            }
                        }

                        System.out.println(
                                "1.Insert Values\n2.Get Number of Sides\n3.Get Side Length\n4.Get Total Sides\n5.Get Perimeter\n6.Get Interior Angle\nEnter your choice : ");
                        tp = scan.nextInt();

                        switch (tp) {
                            case 1:
                                System.out.println("Enter the no of Equilateral Triangles ");
                                t = scan.nextInt();
                                polygons = new EquilateralTriangle[t];
                                int tlength;
                                for (int x = 0; x < t; x++) {
                                    System.out.println("Enter the side length of triangle " + (x + 1));
                                    tlength = scan.nextInt();
                                    polygons[x] = new EquilateralTriangle(tlength);
                                }

                                break;
                            case 2:
                                System.out.println(t);
                                System.out
                                        .println("No of sides in Equilateral triangle : " + polygons[0].getNumSides());
                                break;
                            case 3:
                                for (int x = 0; x < t; x++) {
                                    System.out.println("Length of each side of Triangle " + (x + 1) + "  :  " +
                                            +polygons[x].getSideLength());
                                }
                                break;
                            case 4:
                                System.out.println(
                                        "Total sides of all triangles : " + RegularPolygon.totalSides(polygons));
                                break;
                            case 5:
                                System.out.println(t + "wrwrwer");
                                for (int x = 0; x < t; x++) {
                                    System.out.println("Perimeter of Equilateral Triangle " + (x + 1) + "  :  " +
                                            +polygons[x].getPerimeter());
                                }
                                break;
                            case 6:
                                System.out.println("Interior angle of Square : " + polygons[0].getInteriorAngle());
                                break;
                            default:
                                System.out.println("Enter right choice");
                        }
                        break;

                    case 2:
                        if (polygons != null) {
                            if (polygons[0] instanceof EquilateralTriangle) {
                                polygons = null;
                            }
                        }
                        System.out.println(
                                "1.Insert Values\n2.Get Number of Sides\n3.Get Side Length\n4.Get Total Sides\n5.Get Perimeter\n6.Get Interior Angle\nEnter your choice : ");
                        tp = scan.nextInt();
                        switch (tp) {
                            case 1:
                                System.out.println("Enter the no of Squares ");
                                t = scan.nextInt();
                                polygons = new Square[t];
                                int tlength;
                                for (int x = 0; x < t; x++) {
                                    System.out.println("Enter the side length of Square " + (x + 1));
                                    tlength = scan.nextInt();
                                    polygons[x] = new Square(tlength);
                                }
                                break;
                            case 2:
                                System.out.println("No of sides in Equilateral Square : " + polygons[0].getNumSides());
                                break;
                            case 3:
                                for (int x = 0; x < t; x++) {
                                    System.out.println("Length of each side of Square " + (x + 1) + "  :  " +
                                            +polygons[x].getSideLength());
                                }
                                break;

                            case 4:
                                System.out
                                        .println("Total sides of all Squares : " + RegularPolygon.totalSides(polygons));
                                break;
                            case 5:
                                for (int x = 0; x < t; x++) {
                                    System.out.println("Perimeter of Square " + (x + 1) + "  :  " +
                                            +polygons[x].getPerimeter());
                                }
                                break;
                            case 6:

                                System.out.println("Interior angle of Square : " + polygons[0].getInteriorAngle());

                                break;
                            default:
                                System.out.println("Enter right choice");
                        }
                        break;
                    default:
                        System.out.println("Enter right choice");
                }
            } catch (NullPointerException obj) {
                System.out.println("No data found,Insert data to perform operations");
            }
        }
    }
}
