public class Main {

    public static void main(String[] args) {
        Integer mynumber = new Integer(2);
        Float myothernumber = new Float(1.7938F );

        System.out.println(String.format("mynumber = %d", mynumber));
        System.out.println(String.format("myothernumber = %.4f", myothernumber));
    }
}
