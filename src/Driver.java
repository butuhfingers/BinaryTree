/**
 * Created by derek on 10/25/16.
 */
public class Driver {
    public static void main(String[] args){
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();

        tree.add(new Integer(1));
        tree.add(new Integer(6));
        tree.add(new Integer(3));
        tree.add(new Integer(4));
        tree.add(new Integer(10));
        tree.add(new Integer(7));
        tree.add(new Integer(-1));
        tree.add(new Integer(0));
        tree.add(new Integer(-5));

        tree.display();
    }
}
