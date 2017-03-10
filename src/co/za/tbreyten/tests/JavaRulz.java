package co.za.tbreyten.tests;

/**
 * Created by theunsb on 17/03/09.
 */
public class JavaRulz {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (((i % 3) == 0) && ((i % 5) == 0)) {
                System.out.println("JavaRulz");
            }
            else if ((i % 3) == 0) {
                System.out.println("Java");
            }
            else if ((i % 5) == 0) {
                System.out.println("Rulz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
