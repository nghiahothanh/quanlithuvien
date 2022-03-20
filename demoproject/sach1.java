package demoproject;
import java.util.Date;
public class sach1{
private String tacgia;
private Date ngayxuatban;
private String tensach;

public sach1(String tacgia, String tensach){
//this.ngayxuatban=ngayxuatban;
this.tacgia=tacgia;
this.tensach=tensach;
}
public sach1(){

}
public void setTacgia(String tacgia){
    this.tacgia=tacgia;
}
public void setNgayxuatban(Date ngayxuatban){
    this.ngayxuatban=ngayxuatban;
}
public void setTensach(String tensach)
{
    this.tensach=tensach;
}
public String getTacgia(){
    return this.tacgia;
}
public String getTensach(){
    return this.tensach;

}
public Date getNgayxuatban(){
    return this.ngayxuatban;
}

public String toString(){
    return "\nTen sach :"+tensach+"\nTen tac gia : "+tacgia+"\nID sach ";
}
}
