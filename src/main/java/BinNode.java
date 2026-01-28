public class Main {

    public static boolean allEvenWithoutOddSon(BinNode<Integer> root) {
        if (root == null) {
            return true; 
        }

        boolean hasOddSon = false;

        if (root.hasLeft() && root.getLeft().getValue() % 2 != 0) {
            hasOddSon = true;
        }

        if (root.hasRight() && root.getRight().getValue() % 2 != 0) {
            hasOddSon = true;
        }
        
        if (root.getValue() % 2 != 0 || hasOddSon) {
            return false;
        }

        return allEvenWithoutOddSon(root.getLeft()) &&
               allEvenWithoutOddSon(root.getRight());
    }
}
