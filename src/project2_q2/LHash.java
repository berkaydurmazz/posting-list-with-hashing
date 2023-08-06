package project2_q2;


public class LHash<Key> {
    LinkedList<String>[] table;
    int M;
    int N; // number of full elements
    boolean[] full;

    public LHash(int M){
        table =  new LinkedList[M];
        full = new boolean[M];
        this.M = M;
    }
    public boolean contains(String key) {
        if (key == null){
            throw new IllegalArgumentException("argument to contains() is null");
        }
        return get(key) != null;
    }
    public boolean insert(String key,String f){
        int ix = hash(key);
        //System.out.println(" hash key: "+ix);
        
        int bix = ix;
        while(full[ix] && !table[ix].data.equals(key)){
            ix = (ix+1) % M;
            if (ix == bix){
                System.out.println("The table is full!");
                return false;
            }
        }
       
        if(!full[ix]){ 
            table[ix] = new LinkedList();
            table[ix].data=key;
           // System.out.println(table[ix]+" "+ix);
            insertFile(ix, f);
            full[ix] = true;
            N++;
            return true;
        }else{
            insertFile(ix, f);
        }
            
        
        return false;   
    }
    public LinkedList get(String key) {
        
        for (int i = hash(key); table[i] != null; i = (i + 1) % M){
            if (table[i].data.equals(key)){
                return table[i];
            }
            
        }
        return null;
    }
    public LinkedList search(String value){
        int address;
        address = hash(value);
        while (table[address]!= null) {            
            if ( table[address].data.equals(value)) 
                break;
            address =  (address + 1) % M;
        }
        System.out.println(table[address]);
        return table[address];
    }
    public int distinctCount(){
        int distinctCount=0;
        for (int k=0;k<table.length;k++){
            if(table[k]!=null){
                distinctCount++;
            }
        }
        return distinctCount;
    }
    public void insertFile(int ix,String f){
        if(table[ix].search(f)==null)
        table[ix].insertFirst(f);
    }
     public int hash(String t){
        return ((t.hashCode()&0x7fffffff) % M);
    
    }
    public String toString(){
        String s = "[";
        for(int i = 0; i < M; i++){
            s+=table[i]+",";
        }
        return s+"]";
    }
}
