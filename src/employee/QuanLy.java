/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import static QLThuVien.QuanLySach.input;
import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author CUONGUIT
 */
public class QuanLy {
    static Scanner scanner = new Scanner(System.in);
    static nhanvien nv ;
    static nhanvienSX sx;
    static nhanvienCN cn;
    static nhanvienQL ql;
    static ArrayList<nhanvien>ds= new ArrayList<>();
    static int lc;
    public static  void input()
    {
        int snv;
        System.out.print("\nnhap so luong nhan vien: ");
        snv= scanner.nextInt();
        scanner.nextLine();
        do
        {
            System.out.print("\nban chi co 3 lua chon: ");
            System.out.print("\n0.cancel");
            System.out.print("\n1.nhan vien san xuat");
            System.out.print("\n2.nhan vien cong nhat");
            System.out.print("\n3.nhan vien quan ly");
            System.out.print("\nlua chon cua ban: ");
            lc = scanner.nextInt();
            scanner.nextLine();
        }while(lc>3);
        switch (lc)
        {
                case 1:
                    for(int i=0;i<snv;i++)
                    {
                        System.out.print("\nnhan vien san xuat thu "+(i+1)+": ");
                        sx=new nhanvienSX();
                        ds.add(sx);
                        sx.input();
                    }
                break;
                case 2:
                    for(int i=0;i<snv;i++)
                    {
                        System.out.print("\nnhan vien cong nhat thu "+(1+i)+": ");
                        cn= new nhanvienCN();
                        ds.add(cn);
                        cn.input();
                    }
                break;
                case 3:
                    for(int i=0;i<snv;i++)
                    {
                        System.out.print("\nnhan vien quan ly thu "+(i+1)+": ");
                        ql= new nhanvienQL();
                        ds.add(sx);
                        ql.input();
                    }
                break;
        }
    }
    public static void show()
    {
        for(int i=0;i<ds.size();i++)
        {
            System.out.print("\nnhan vien thu "+(i+1)+": ");
            ds.get(i).show();
            System.out.print("\nluong: "+ds.get(i).getluong() +"d");
        }
    }
    public static double sum()
    {
        int sum =0;
        for(int i=0;i<ds.size();i++)
        {
            sum+=ds.get(i).getluong();
        }
        return sum;
    }
    public static void main(String args[])
    {
        int n ;
        System.out.print("\n Loai 1: nhan vien san xuat"
                + "\n   Loai 2: nhan vien cong nhat"
                + "\n Loai 3: nhan vien quan ly");
        
        do{   

            System.out.print("\nSo loai nhan vien ban muon nhap: >1 and <4: ");
            n = scanner.nextInt();
 
        }
        while(n>3);       
        for(int i=0;i<n;i++)
        {
            System.out.print("\nLoai nhan vien thu "+(i+1)+":");
            input();
        }
        System.out.print("\n----------Hien Thi ----------"+lc);
        show();
        System.out.print("\ntong tien can phai tra cho tat ca nhan vien: "+sum());
    }
}
