import java.util.*;
public class arbolBinario
{
    // numeros al azar y montarlos en el arreglo
    //menor guarda en izquierda *2+1
    //mayor en derecha *2+2
    //int pos=0;
    public static void main (String [] args){
        ArrayList <Integer> list = new ArrayList<Integer>();
        int [] arr = new int [100000];
        int num=0;
        int pos=0;
        for(int i=0; i<10; i++){
            num = (int)((Math.random()*100)+10);
            if(!list.contains(num)){
                list.add(num);
            }else if(list.contains(num)){
                //num = (int)((Math.random()*100)+10); 
                i--;
                //if(!list.contains(num)){
                   // list.add(num);
                
                //i--;
            }
        }

        for(int k=0; k<list.size(); k++){
            System.out.println(list.get(k));
        }

        /*for(int j=0; j<list.size(); j++){
            int tok = list.get(j);
            int pos=0;
            if(arr[0]==0){
                arr[0]=tok;
                //pos = arr[0];
            }else if(tok<arr[pos]){
                if(arr[pos*2+1]==0){
                    arr[pos*2+1]=tok;
                }else if(arr[pos*2+1]!=0){
                    pos=pos*2+1;
                    arr[pos*2+1]=tok;
                }
            }else if(tok>arr[pos]){
                if(arr[pos*2+2]==0){
                    arr[pos*2+2]=tok;
                }else if(arr[pos*2+2]!=0){
                    pos=pos*2+2;
                    arr[pos*2+2]=tok;
                }
            }
        }*/
        for(int j=0; j<list.size(); j++){
            int tok = list.get(j);
            pos=0;
            while(arr[0]!=0){
                if(tok<arr[pos]){
                    pos=pos*2+1;
                }else{
                    pos=pos*2+2;
                }
            }
            arr[pos]=tok;
        }
        System.out.println("Pre Orden");
        preOrden(arr,0);
        System.out.println("Post Orden");
        postOrden(arr,0);
        System.out.println("En Orden");
        orden(arr,0);
        System.out.println("Por Nivel");
        nivel(arr);
    }

    public static void preOrden(int [] aa, int p ){
        if(aa[p]!=0){
            System.out.println(aa[p]);
            preOrden(aa,p*2+1);
            preOrden(aa,p*2+2);
        }            
    }

    public static void orden(int [] aa, int p ){
        if(aa[p]!=0){
            preOrden(aa,p*2+1);
            System.out.println(aa[p]);
            preOrden(aa,p*2+2);
        }            
    }

    public static void postOrden(int [] aa, int p ){
        if(aa[p]!=0){
            preOrden(aa,p*2+1);
            preOrden(aa,p*2+2);
            System.out.println(aa[p]);
        }            
    }

    public static void nivel (int [] arr){
        for(int a=0; a<arr.length; a++){
            if(arr[a]!=0){
                System.out.println(arr[a]);
            }
        }
    }
}
