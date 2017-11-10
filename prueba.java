
/**
 * Write a description of class prueba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class prueba
{
   package TercerSemestre;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class LZW{

    public static void main(String [] arg){
        String texto;
        texto = JOptionPane.showInputDialog("Mete el texto");

        Hashtable<String, Integer> diccionario = new Hashtable<String, Integer>();
        int valor = 0;
        for(int letra = 97; letra <= 122; letra++){
            if(texto.indexOf(letra) >= 0){
                diccionario.put("" + (char)letra, valor++);
            }            
        }      

        int num = -1;
        ArrayList<Integer> comprimido = new ArrayList<Integer>();
        String prefijo = "";

        for(int posicion = 0; posicion < texto.length();){
            prefijo += texto.charAt(posicion);
            if(diccionario.containsKey(prefijo)){
                num = diccionario.get(prefijo);
                posicion++;                
            }else{
                diccionario.put(prefijo, valor++);
                comprimido.add(num);
                num = -1;
                prefijo = "";
            }
        }
        if(num != -1){
            comprimido.add(num);
        }
         System.out.println(diccionario);
         System.out.println(comprimido);
    }
}


}
