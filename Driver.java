
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
        // test.removeFromBack();
        for (int i = 1; i <= 3; i++) {
            test.addToFront(i);
        }
        
        Integer front1 = test.removeFromFront();
        System.out.println(front1);
        Integer front2 = test.removeFromFront();
        System.out.println(front2);
        Integer front3 = test.removeFromFront();
        System.out.println(front3);
        test.removeFromFront();
    }
}
