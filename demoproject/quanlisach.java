package demoproject;

import java.io.IOException;
import java.util.ArrayList;
public class quanlisach extends sach1{
    ArrayList<sach1> ds=new ArrayList<>();
    sach1 sach=new sach1(); 
    public quanlisach(ArrayList<sach1> ds) {
         ds=new ArrayList<>();
    }

    public quanlisach() {
        ArrayList<sach1> ds=new ArrayList<>();
    }

    public ArrayList<sach1> getSach() {
        return this.ds=ds;
    }

   private String tensach;

    public quanlisach(String tensach) {
        this.tensach = tensach;

   }
   @Override
   public String getTensach(){
       return this.tensach;
   }

    public void themsach(sach1 sach){
    this.ds.add(sach);


    }
    public void insach(){
   for (sach1 sach1 : ds) {
       System.out.println(sach1);
   }
    }
    public static void clrscr(){
        //Clears Screen in java
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {
            System.err.println( ex.getClass().getName() + ": " + ex.getMessage() );
        }
     }
}
