/**
 * Created by derek on 10/25/16.
 */
import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;

public class BinarySearchTree<T extends Comparable<T>> {
    //Variables
    private Node<T> root;
    private int size;

    //Properties
    public boolean isEmpty(){
        if(root == null)
            return true;

        return false;
    }

    private Node<T> CreateNode(T value){
        return new Node<T>(value);
    }

    //Constructors
    public BinarySearchTree(){
        //Do nothing
    }
    public BinarySearchTree(T value){
        root = CreateNode(value);
    }

    public void add(T value){
        //Check if root is null
        if(isEmpty()){
            this.root = CreateNode(value);
        }else{
            this.root.add(value);
        }

        this.size++;
    }

    public boolean contains(T value)
    {
        if(!isEmpty())
            return root.contains(value);

        return false;
    }

    public void display(){
        if(!isEmpty()){
            root.display(0);
        }
    }

    public void delete(T value){
        ArrayList<T> list = sortedTree();
        list.remove(value);

        //Recreate the tree
        this.size = 0;
        int rootSpot = Math.round(list.size() / 2);
        root = CreateNode(list.get(rootSpot));
        for(T element : list){
            if(!element.equals(list.get(rootSpot)))
                this.add(element);
        }
    }

    //We will sort less than to greater than
    public ArrayList<T> sortedTree(){
        ArrayList<T> nodeValueList = new ArrayList<T>();

 /*       for(T element : root.sort()){
            System.out.println(element.toString());
        }
*/
        nodeValueList.addAll(root.sort());

        return nodeValueList;
    }


}

