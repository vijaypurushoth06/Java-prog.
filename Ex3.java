import java.util.Scanner;

class Point2D {
    float x = 0.0f;
    float y = 0.0f;

    Point2D() {
    };

    Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    float getX() {
        return x;
    }

    void setX(float x) {
        this.x = x;
    }

    float getY() {
        return y;
    }

    void setY(float y) {
        this.y = y;
    }

    void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    float[] getXY() {
        float arr[] = { x, y };
        return arr;
    }

    public String toString() {
        return ("( " + x + " , " + y + " ) ");
    }
}

class Point3D extends Point2D {
    float z = 0.0f;

    Point3D() {
    };

    float getZ() {
        return z;
    }

    void setZ(float z) {
        this.z = z;
    }

    void setXYZ(float x, float y, float z) {
        super.x = x;
        super.y = y;
        this.z = z;
    }

    float[] getXYZ() {
        float arr[] = { x, y, z };
        return arr;
    }

    public String toString() {
        return "( " + x + " , " + y + " , " + z + " ) ";
    }

}

public class Ex3 {
    public static void main(String[] args) {
        Point3D obj = new Point3D();
        int num = 0;
        int tnum = 0;
        float val = 0;
        float val2 = 0;
        float val3 = 0;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("1.Insert values\n2.Display values\n3.Display object\nEnter your choice :");
            num = scan.nextInt();
            switch (num) {
                case 1:
                    System.out.println(
                            "1.Set x value\n2.Set y value\n3.Set z value\n4.Set x and y values\n5.Set x y z Values\nEnter your choice :");
                    tnum = scan.nextInt();
                    switch (tnum) {
                        case 1:
                            System.out.println("Enter x value : ");
                            val = scan.nextFloat();
                            obj.setX(val);
                            break;
                        case 2:
                            System.out.println("Enter y value : ");
                            val = scan.nextFloat();
                            obj.setY(val);
                            break;
                        case 3:
                            System.out.println("Enter z value : ");
                            val = scan.nextFloat();
                            obj.setZ(val);
                            break;
                        case 4:
                            System.out.println("Enter x and y values : ");
                            val = scan.nextFloat();
                            val2 = scan.nextFloat();
                            obj.setXY(val, val2);
                            break;
                        case 5:
                            System.out.println("Enter x and y and z values : ");
                            val = scan.nextFloat();
                            val2 = scan.nextFloat();
                            obj.setXYZ(val, val2, val3);
                            break;
                        default:
                            System.out.println("Enter valid data");
                    }
                    break;
                case 2:
                    System.out.println(
                            "1.Get x value\n2.Get y value\n3.Get z value\n4.Get x and y values\n5.Get x , y and z values\nEnter value : ");
                    tnum = scan.nextInt();
                    switch (tnum) {
                        case 1:
                            System.out.println(obj.getX());
                            break;
                        case 2:
                            System.out.println(obj.getY());
                            break;
                        case 3:
                            System.out.println(obj.getZ());
                            break;
                        case 4:
                            for (float x : obj.getXY()) {
                                System.out.println(x);
                            }

                            break;
                        case 5:

                            for (float x : obj.getXYZ()) {
                                System.out.println(x);
                            }
                            break;
                        default:
                            System.out.println("Enter a valid option");
                    }
                    break;
                case 3:
                    System.out.println(obj);
                    break;
                default:
                    System.out.println("Enter a valid option");
            }
        }
    }
}
