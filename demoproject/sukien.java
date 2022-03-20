package demoproject;

import java.util.Date;

//import java.text.SimpleDateFo
public class sukien {
    
    private String ngay=" 21/03/2003";
    private String tensukien=" ngay hoi doc sach";
    private String diadiem=" thu vien";
    private String doituong=" hoc sinh toan truong";
    public sukien(){
      
        }
        


    public void sukien(){
        String leftAlignFormat = "| %-4s | %-30s | %-30s | %-10s | %-10s |%n";
        System.out.format("+------+--------------------------------+--------------------------------+------------+------------+%n");
        System.out.format(leftAlignFormat, "Ngay dien ra",  "Ten su kien",  "Dia diem",  "Doi tuong tham gia",  " ");
        System.out.format("+------+--------------------------------+--------------------------------+------------+------------+%n");
        System.out.format(leftAlignFormat  ,ngay  ,tensukien  ,diadiem  ,doituong  ,"" );
    }

}
