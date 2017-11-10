import javax.swing.*;
import java.awt.*;
import java.util.*;
public class tree
{
    //izquerda del arreglo *2+1
    //derecha *2+2
    public static void main (String [] args){
        char t = JOptionPane.showInputDialog("Ingresa letras: ");
        Stack <bubble> pila = new Stack <bubble>();
        array char lista = new char array 
        for(int i=0; i<t.length(); i++){
            char caracter = t.indexOf(i);
            if(caracter==40){ // ( = 40 , ) = 41
                //si es un paretesis de abertura crear un nodo y guardarlo en pila
                pila.push(new bubble())
            }
            if(caracter>96 || caracter <123){//97-122 letras de la a la z
               //crear un nodo y coclocar el caracter  
                new bubble(caracter);
            }
            if(caracter==42 || caracter==43 || caracter==45 || caracter==47 ){
                //+ = 43, * = 42, - = 45, /=47
                bubble temp = pila.peek();
                temp = caracter;
            }
        }
        System.out.println(pila);
    }

}
