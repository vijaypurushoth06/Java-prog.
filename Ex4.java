package Abstract_class_and_Interface;

import java.util.Scanner;

import java.util.Scanner;

abstract class Book {
    String title = null, author = null;
    public int price = 0;

    abstract void setdetails();

    abstract String gettitle();
}

class Mybook extends Book {

    void setdetails() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter book details");
        System.out.println("Enter title : ");
        super.title = scan.next();
        System.out.println("Enter author name : ");
        super.author = scan.next();
        System.out.println("Enter price of book ");
        price = scan.nextInt();
    }

    String gettitle() {
        return super.title;
    }

}

public class Ex4_1 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int nos, temp, t1;
        System.out.println("Enter the number of book objects :");
        nos = scan.nextInt();
        Mybook arr[] = new Mybook[nos];
        for (int x = 0; x < nos; x++) {
            arr[x] = new Mybook();
        }
        while (true) {
            System.out.println("1.Enter data\n2.Get title\n3.Get Total price");
            temp = scan.nextInt();
            try {
                switch (temp) {
                    case 1:

                        System.out.println("Enter book number : ");
                        t1 = scan.nextInt();
                        arr[t1 - 1].setdetails();
                        break;
                    case 2:
                        System.out.println("Enter Book number : ");
                        t1 = scan.nextInt();
                        System.out.println(arr[t1 - 1].gettitle());
                        break;
                    case 3:
                        int tot = 0;
                        for (Mybook x : arr) {
                            tot += x.price;
                        }
                        System.out.println("Total prices of all books is : " + tot);
                        break;
                    default:
                        System.out.println("Enter a valid option");
                }
            } catch (ArrayIndexOutOfBoundsException obj) {
                System.out.println("Please Enter a book number within specified range");
            }
        }
    }
}
