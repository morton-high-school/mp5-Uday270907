public class BetterArray{
    public int[] array;
    public int arraySize;
    public BetterArray(){
        array = new int[0];
        arraySize = 0;
    }
    public BetterArray(int a){
        array = new int[a];
        arraySize = 0;
    }
    public boolean add(int a){
        int d;
        if(array.length==0){
            d = 1;
        }else if(arraySize==array.length){
            d = array.length*2;
        }else{
            d = array.length;
        }
        int[] b = new int[d];
        int i = 0;
        while(i<arraySize){
            b[i] = array[i];
            i++;
        }
        b[i] = a;
        array = b;
        arraySize++;
        return true;
    }
    public void add(int a, int c){
        int d;
        if(array.length==0){
            d = 1;
        }else if(arraySize==array.length){
            d = array.length*2;
        }else{
            d = array.length;
        }
        if(a>d-1){
            int e = d;
            while(e<=a){
                e*=2;
            }
            d=e;
        }
        int[] b = new int[d];
        for(int i = 0; i<=a; i++){
            if(i!=a){
                b[i] = array[i];
            }else{
                b[a] = c;
            }
        }
        for(int i = a+1; i<arraySize+1; i++){
            b[i]=array[i-1];
        }
        array = b;
        arraySize++;
    }
    public int size(){
        return arraySize;
    }
    public int get(int a){
        return array[a];
    }
    public int set(int a, int b){
        int c = array[a];
        if(a<arraySize){
            array[a] = b;
        }
        return c;
    }
    public int remove(int a){
        int b = array[a];
        int[] c = new int[array.length];
        for(int i = 0; i<arraySize-1; i++){
            if(i>=a){
                c[i] = array[i+1];
            }else{
                c[i] = array[i];
            }
        }
        arraySize--;
        array = c;
        return b;
    }
}