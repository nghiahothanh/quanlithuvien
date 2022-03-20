package demoproject;

import java.util.Scanner;
import java.util.Date;
import java.lang.ref.Cleaner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class demo {
    public static void main(String[] args) {
        // muonsach ms=new muonsach();
        Scanner sc = new Scanner(System.in);
        quanlisach a = new quanlisach();
        menu();
    }

    public static void menu() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            quanlisach a = new quanlisach();
            System.out.println("*************************************************");
            System.out.println("**             MOI BAN CHON MENU               **");
            System.out.println("**  1.ban chon muon sach                       **");
            System.out.println("**  2.ban chon nhap them sach                  **");
            System.out.println("**  3.xem su kien cua thu vien                 **");
            System.out.println("**  4.ban chon ket thuc chuong trinh           **");
            System.out.println("*************************************************");
            System.out.println("nhap lua chon cua ban : ");
            int key;
            key = sc.nextInt();
            sc.nextLine();
            switch (key) {
                case 1: {
                    a.clrscr();
                    System.out.println("ban da chon muon sach");
                    System.out.println("NHAP THONG TIN VAO BIEU MAU SAU : ");
                    System.out.print("Ten nguoi muon : ");
                    String ten = sc.nextLine();
                    System.out.print("Ten sach : ");
                    String tensach = sc.nextLine();
                    SimpleDateFormat df = new SimpleDateFormat("dd/mm/yy");
                    // Date date1=new Date();
                    System.out.print("Ngay muon : ");
                    Date ngaymuon;
                    // ms.setNgaymuon(ngaymuon);
                    try {
                        ngaymuon = (Date) df.parse(sc.nextLine());
                    } catch (ParseException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    // ms.setNgaymuon(((Date) df.parse(ngaymuon));
                    System.out.print("Ngay tra : ");
                    java.util.Date ngaytra;
                    try {
                        ngaytra = df.parse(sc.nextLine());
                    } catch (ParseException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    System.out.print("ID sach :");
                    int id = sc.nextInt();
                    // sc.nextInt()=sc.nextLine();
                    sc.nextLine();
                    System.out.print("Ten tac gia : ");
                    String tacgia = sc.nextLine();
                    System.out.print("Ngay xuat ban : ");
                    Date ngayxuatban;
                    try {
                        ngayxuatban = (Date) df.parse(sc.nextLine());
                    } catch (ParseException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    muonsach ms1 = new muonsach(ten, id, tacgia);
                    // System.out.println(ms1.getTacgia());
                    a.clrscr();
                    System.out.println("*******************************************");
                    System.out.println("*      1. Kiem tra lai thong tin da nhap  *");
                    System.out.println("*      2. Tro ve menu chinh               *");
                    System.out.println("*******************************************");
                    System.out.println("nhap lua chon");
                    int key1;
                    key1 = sc.nextInt();
                    sc.nextLine();
                    switch (key1) {
                        case 1: {
                            System.out.println("THONG TIN CUA BAN :");
                            sach1 sach = new sach1(tacgia, tensach);
                            a.themsach(sach);
                            a.insach();
                            // System.exit(0);
                            System.out.println("nhan enter de tiep tuc");
                            sc.nextLine();
                            menu();
                        }
                        case 2: {

                        }
                    }

                    // sach.toString();
                    // a.themsach(sach);
                    // a.insach();

                }
                case 2: {
                    // a.clrscr();
                    System.out.print("nhap so luong sach can them : ");
                    int sosach;
                    sosach = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < sosach; i++) {
                        System.out.println("THEM SACH ");
                        System.out.print("Nhap ten sach : ");
                        String tensach;
                        tensach = sc.nextLine();
                        System.out.print("Ten tac gia : ");
                        String tacgia;
                        tacgia = sc.nextLine();
                        System.out.print("Ngay xuat ban :");
                        Date ngayxuatban;
                        SimpleDateFormat df = new SimpleDateFormat("dd/mm/yy");
                        try {
                            ngayxuatban = (Date) df.parse(sc.nextLine());
                        } catch (ParseException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        System.out.print("Id : ");
                        int idsach;
                        idsach = sc.nextInt();
                        sc.nextLine();

                        muonsach msi = new muonsach(tensach, tacgia, idsach);
                        a.themsach(msi);
                    }
                    a.clrscr();
                    System.out.println(" XEM SACH ");
                    a.insach();
                    System.out.println(" NHAN 7 DE TIEP TUC ");
                    sc.next();
                    System.out.println("*******************************************");
                    System.out.println("*      1 xoa sách                        *");
                    System.out.println("*      2  tro ve menu chinh               *");
                    System.out.println("*******************************************");
                    int key2;
                    key2 = sc.nextInt();
                    // sc.nextLine();
                    switch (key2) {

                        case 1: {
                            // int inp=0;
                            // inp=sc.nextInt();
                            // subMenu(key2,a);

                            System.out.println("nhap vi tri can xoa ");
                            int n;
                            n = sc.nextInt();
                            // sc.nextLine();
                            a.ds.remove(n);
                            // System.out.println("so sach con lai tron thu vien");
                            // sc.next();
                            // a.clrscr();
                            System.out.println(a.ds);
                            // a.insach();
                            // subMenu( a);
                            System.out.println(" NHAN ENTER DE TIEP TUC ");
                            sc.next();
                            menu();
                        }
                        case 2:{
                            menu();
                        }
                    }

                }
                case 3: {
                    a.clrscr();

                    sukien a1=new sukien();
                    System.out.println("BAN CHON XEM SU KIEN ");
                    a1.sukien();
                    System.out.println(" NHAN 1  DE TIEP TUC ");
                    sc.next();

                }

            }
        }

    }

   /* public static void subMenu(quanlisach a) {
        // Scanner sc = new Scanner(System.in);
        // quanlisach a = new quanlisach();
        // int key;
        a.clrscr();

        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        // sc.nextLine();
        switch (key) {
            case 1: {
                a.clrscr();
                System.out.println("BAN CHON XEM SACH ");
                a.insach();
                subMenu(a);
            }
            case 2: {

                System.out.println("nhap vi tri can xoa ");
                int n;
                n = sc.nextInt();
                // sc.nextLine();
                a.ds.remove(n);
                // System.out.println("so sach con lai tron thu vien");
                // sc.next();
                // a.clrscr();
                System.out.println(a.ds);
                // a.insach();
                subMenu(a);
            }
            case 3: {
                menu();
            }
            case 0:
                a.clrscr();
                menu();
                break;
        }
    }*/
}
