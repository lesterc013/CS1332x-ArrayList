
public class Driver {
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>();
        // for (int i = 1; i <= 36; i++) {
        //     test.addToBack(i);
        // }
        // for (int i = 0; i < test.size(); i++) {
        //     System.out.println(test.get(i));
        // }
        // test.addToBack(null);

        // test.addToFront(null);
        for (int i = 1; i <= 9; i++) {
            test.addToFront(i);
        }
        for (int i = 0; i < test.size(); i++) {
            System.out.println(test.get(i));
        }
    }
}
