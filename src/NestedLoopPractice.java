public class NestedLoopPractice {

    public static void main(String[] args) {
        NestedLoopPractice N = new NestedLoopPractice();
    }

    public NestedLoopPractice() {
//        pattern1();
//        pattern2();
//        pattern3();
//        pattern4();
//        pattern5();
//        pattern6();
//        pattern7();
//        pattern75();
//        pattern8();
        pattern9();
    }

    public void pattern1() {
        /*
            Pattern 1:
0
5
10
15
20
25

         */

        for (int i = 0; i <= 25; i += 5) {
            System.out.println(i);
        }

    }

    public void pattern2() {
        /*
            Pattern 2:
2
7
12
17
22
27

         */
        for (int i = 2; i <=27; i +=5) {
            System.out.println(i);
        }
    }

    public void pattern3() {
        /*
            Pattern 3:
21  17  13  9  5  1

         */
        for (int i = 21; i >= 1; i -= 4) {
            System.out.print(i + "\t");
        }
        System.out.println();

    }

    public void pattern4() {
        /*
            Pattern 4:
1  4  9  16  25  36

         */
/*        int a = 1;
        for (int i = 1; i <= 36; i += a) {
            System.out.println(i);
            a += 2;
        }*/
        for (int i = 1; i <= 6; i++) {
            System.out.print((i * i) + "\t");
        }
        System.out.println();
    }

    public void pattern5() {
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }

    public void pattern6() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < (i - 1); j++) {
                System.out.print("\t");
            }
            System.out.println(i);
        }
    }
    public void pattern7() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
    public void pattern75() {
        for (int i = 1; i <=5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
    public void pattern8() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void pattern9() {
        for (int i = 0; i <= 11; i+=2) {
            for (int j = 9; j >= i; j-=2) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i <= 11; i+=2) {
            for (int j = i; j <= 9; j+=2) {
                System.out.print(" ");
            }
            for (int j = i; j > 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
