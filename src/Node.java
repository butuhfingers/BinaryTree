import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;

import java.util.ArrayList;

/**
 * Created by derek on 10/25/16.
 */
public class Node<T extends Comparable<T>> {
    //Variables
    private T value;
    private Node<T> left;
    private Node<T> right;

    //Properties
    private boolean isLeftEmpty(){
        if(left == null)
            return true;

        return false;
    }
    private boolean isRightEmpty(){
        if(right == null)
            return true;

        return false;
    }
    public T getValue(){
        return value;
    }

    public Node<T> getLesserNode(){return left;}
    public Node<T> getGreaterNode(){return right;}

    //Constructors
    public Node(T value){
        this.value = value;
    }

    //Functions
    public void add(T value){
        //Are we smaller?
        if(this.value.compareTo(value) > 0){
            if(isLeftEmpty()){
                left = new Node<T>(value);
            }else{
                left.add(value);
            }
            //We are larger, add to the right
        }else if(this.value.compareTo(value) < 0){
            if(isRightEmpty()){
                right = new Node<T>(value);
            }else{
                right.add(value);
            }
            //We are equal, do nothing
        }else{
            //Do nothing
        }
    }

    public boolean contains(T value)
    {
        if(this.value.equals(value)){
            return true;
        }

        if(!isLeftEmpty() && this.left.contains(value))
            return true;
        else if(!isRightEmpty() && this.right.contains(value))
            return true;

        return false;
    }

    public void display(int level){
        System.out.println(" Node (Level " + level + "): " + this.value.toString());

        if(!isLeftEmpty()) {
            System.out.print("Left of " + this.value.toString());
            left.display(level + 1);
        }

        if(!isRightEmpty()) {
            System.out.print("Right of " + this.value.toString());
            right.display(level + 1);
        }
    }

    public ArrayList<T> sort(){
        //Create a new list
        ArrayList<T> valueList = new ArrayList<T>();

        if(!isLeftEmpty())
            valueList.addAll(left.sort());

        valueList.add(this.value);

        if(!isRightEmpty())
            valueList.addAll(right.sort());

        return valueList;
    }
}
