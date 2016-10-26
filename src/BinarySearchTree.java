/**
 * Created by derek on 10/25/16.
 */
public class BinarySearchTree<T extends Comparable<T>> {
    //Variables
    private Node<T> root;

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
    }

    public boolean contains(){
        return false;
    }

    public void display(){
        if(!isEmpty()){
            root.display(0);
        }
    }
}

