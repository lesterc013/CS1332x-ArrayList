
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
        test.removeFromBack();
        for (int i = 1; i <= 36; i++) {
            test.addToFront(i);
        }
        
        Integer backElement = test.removeFromBack();
            for (int i = 0; i < test.size(); i++) {
                System.out.println(test.get(i));
            }
        System.out.println(test.get(test.size()));
        System.out.println(backElement);
    }
}
