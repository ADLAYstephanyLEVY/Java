public class bubble
{
    private char info;
    private bubble ptri;
    private bubble ptrd;
    private bubble raiz;
    public bubble (char info){
        this.info = info;
    }

    public bubble (){
    }

    public char getInfo(){
        return info;
    }

    public bubble getPtri(){
        return ptri;
    }

    public bubble getPtrd(){
        return ptrd;
    }

    public void setInfo(char info){
        this.info=info;
    }

    public void setPtri(bubble ptri){
        this.ptri=ptri;
    } 

    public void setPtrd(bubble ptrd){
        this.ptrd=ptrd;
    }      

    public bubble getRaiz(){
        return raiz;
    }

    public void setRaiz(bubble raiz){
        this.raiz=raiz;
    }
    /*private char a;// b;

    public bubble(char a){ //char b){
    this.a=a;
    //this.b=b;
    }

    public char getA(){
    return a;
    }

    /*public char getB(){
    return b;
    }

    public void setA(char a){
    this.a=a;
    }

    /*public void setB (char b){
    this.b=b;
    }*/
}
/*public class Nodo
{
private char info;
private Nodo ptri;
private Nodo ptrd;
private Nodo raiz;
public Nodo (char info)
{
this.info = info;
}
public Nodo ()
{

}
public char getInfo(){
return info;
}

public Nodo getPtri(){
return ptri;
}

public Nodo getPtrd(){
return ptrd;
}

public void setInfo(char info){
this.info=info;
}

public void setPtri(Nodo ptri){
this.ptri=ptri;
} 

public void setPtrd(Nodo ptrd){
this.ptrd=ptrd;
}      
public Nodo getRaiz(){
return raiz;
}

public void setRaiz(Nodo raiz){
this.raiz=raiz;
}
}*/