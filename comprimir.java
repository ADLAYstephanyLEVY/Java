import javax.swing.*;
import java.awt.*;
import java.util.*;
public class comprimir //impements Comparable<Nodo>
{
    public static void main (String [] args){ 

    }
    private char c;
    int freq;
    public char getC(){
        return c;
    }
    float prob;
    private boolean provded=true;
    private nodo left = null;
    private  nodo rigth = null;

    Nodo (char c, int freq, float prob){
        this.c=c;
        this.freq=freq;
        this.prob=prob;
        this.provided=true;
    }

    Nodo (Nodo left, Nodo rigth){
        this.left=left;
        this.rigth=rigth;
        this.prob=left.prob+rigth.prob;
        this.provided=false;
    }

    public int compareTo(Nodo n){
        if(this.prob < n.prob) return -1;
        if(this.prob > n.prob) return 1;
        return 0;
    }

    public float getProb(){
        return prob;
    }
    public boolean isProvided(){
        return provided;
    }
    public Nodo getRigth(){
        return rigth;
    }
    public Nodo getLeft(){
        return left;
    }
}
