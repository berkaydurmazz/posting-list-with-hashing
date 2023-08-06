
package project2_q2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class Test {
    
    
    public static void main(String[] args) throws FileNotFoundException {
        LHash<LinkedList> h2=new LHash<>(300);
         
         File folder= new File("newFileset");
       File[] listofFiles=folder.listFiles();
       Scanner sc ;
       try{
           for (File tempFile : listofFiles) {
               //System.out.println(tempFile.getName());
               try{
              sc = new Scanner(new BufferedReader(new FileReader(tempFile)));
                  
           int i = 1; 
            while(sc.hasNext()){
                String s = sc.next();
                
                h2.insert(s.toLowerCase(),tempFile.getName());
                
               // System.out.println((i++)+" ith word: "+s);
            }
            sc.close();
           }
        
        catch(Exception e){
           System.out.println("Unable to read the file!"+e);
       }
          }
       }catch(Exception e){
           System.out.println("Unable to read the file! "+e);
       }
        int option=0;
       do{
           try{
               System.out.println("The following options are available for you: ");
               System.out.println("1) Search a word \n2) Quit");
               sc=new Scanner(System.in);
            option=sc.nextInt();
            switch(option){
                case 1:
                    try{
                        System.out.print("Enter a word: ");
                        
                        sc.nextLine();
                        String word =sc.nextLine();
                        System.out.println("");
                        System.out.println("word: "+word);
                        h2.get(word.toLowerCase());
                        
                        System.out.println("this word has been appeared in the following text files:");
                        h2.get(word.toLowerCase()).print();
                    }catch(Exception e){
                        System.out.println("The word you entered can not found in the fileset ! "+e);
                    }
                    break;
                case 2:break;
           }
      }catch(Exception e){
           System.out.println("The option is not valid!");
       }
       }while(option!=2);
    
    }
    
}
