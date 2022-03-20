package demoproject;
import java.util.Date;
public class muonsach extends sach1{
private String tennguoimuon;
private Date ngaymuon;
private Date ngaytra;
private int idsach;
public muonsach(String name ,int idsach,String tacgia){
    this.tennguoimuon=name;
    this.idsach=idsach;
    this.setTacgia(tacgia);
}
public muonsach(String name, Date ngaymuon, Date ngaytra, int idsach,String tacgia, Date ngayxuatban,String tensach){
    super(tacgia, tensach);
    this.tennguoimuon=name;
    this.ngaymuon=ngaymuon;
    this.ngaytra=ngaytra;
    this.idsach=idsach;
}
public muonsach(String tensach , String tacgia, int idsach){
super(tacgia, tensach);
this.idsach=idsach;
}

public void setName(String name){
    this.tennguoimuon=name;
}
public String getName(){
    return this.tennguoimuon;
}
public void setNgaymuon(Date ngaymuon){
    this.ngaymuon=ngaymuon;
}
public Date getNgaymuon(){
    return this.ngaymuon;
}
public void setNgaytra(Date ngaytra){
    this.ngaytra=ngaytra;
}
public Date getNgaytra(){
    return this.ngaytra;
}
public void setIdsach(int id){
    this.idsach=id;
}
public int getIdsach(){
    return this.idsach;
}
 @Override
public String toString(){
    return "\nTen sach :"+getTensach()+"\nTen tac gia : "+getTacgia()+"\nID sach "+idsach;
}

}