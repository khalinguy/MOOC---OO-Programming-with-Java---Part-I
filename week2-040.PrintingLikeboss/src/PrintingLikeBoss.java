public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;
        while (i < amount){
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int i = 0;
        while (i < amount){
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int i = 1;
        int count = 0;
        while (count < size){
            printWhitespaces(size-1);
            printStars(i);
            i++;
            size--;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int h = 0;
        int star = 1;
        int space = height - 1; 
        while (h<height){
            printWhitespaces(space);
            printStars(star);
            space --;
            star += 2;
            h++;
        }
        //stand
        printWhitespaces(height-2);
        printStars(3);
        printWhitespaces(height-2);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(50);
    }
}
