package pair;

public class PairTest {

    public static void main(String[] args) {
        Pair<Integer, Integer> pair1 = new Pair<Integer, Integer>(5, 7);
        Pair<Integer, Integer> pair2 = new Pair<Integer, Integer>(5, 7);
        Pair<Integer, Integer> pair3 = new Pair<Integer, Integer>(5, 8);
        Pair<Integer, Integer> pair4 = new Pair<Integer, Integer>(3, 8);

        System.out.println("Pair1 compareTo Pair2 = " + pair1.compareTo(pair2));
        System.out.println("Pair1 compareTo Pair3 = " + pair1.compareTo(pair3));
        System.out.println("Pair1 compareTo Pair4 = " + pair1.compareTo(pair4));
    }

}
