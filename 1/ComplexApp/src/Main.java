public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 2;
        int y;
        if (x < 2) {
            y = 0;
            for (int i = 2; i <= 13; i++) {
                y = y + i;
            }
        } else {
            y = 45;
        }
        System.out.println("x=" + x + ", y=" + y);
    }

}
