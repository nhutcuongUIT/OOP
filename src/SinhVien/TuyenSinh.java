/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinhVien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CUONGUIT
 */
public class TuyenSinh {
    static KhoiA a;
    static KhoiB b;
    static KhoiC c ;
    static Scanner sc= new Scanner(System.in);
    static ArrayList<ThiSinh>ds= new ArrayList<>();
    static int lc;

    public static void input()
    {
        int sts;
        System.out.print("\nnhap so luong thi sinh: ");
        sts= sc.nextInt();
        sc.nextLine();
        do
        {
            System.out.print("\nban chi co 3 lua chon: ");
            System.out.print("\n0.cancel");
            System.out.print("\n1.thi sinh khoi A");
            System.out.print("\n2.thi sinh khoi B");
            System.out.print("\n3.thi sinh khoi C");
            System.out.print("\nlua chon cua ban: ");
            lc = sc.nextInt();
            sc.nextLine();
        }while(lc>3);
        
        switch (lc)
        {
            case 1:
                for(int i=0;i<sts;i++)
                {
                    a=new KhoiA();
                    System.out.print("\nthi sinh thu: "+(i+1)+ ": ");
                    ds.add(a);
                    a.input();
                }
            break;
            case 2:
                for(int i=0;i<sts;i++)
                {
                   b= new KhoiB();
                   System.out.print("\nthi sinh thu: "+(i+1)+": ");
                   ds.add(b);
                   b.input();
                }
            break;
            case 3:
                for(int i=0;i<sts;i++)
                {
                    c= new KhoiC();
                    System.out.print("\nthi sinh thu: "+(i+1)+": ");
                    ds.add(c);
                    c.input();
                }
        }      
    }
    public static void show()
    {
        for(int i=0;i<ds.size();i++)
        {
            System.out.print("\nsinh vien thu "+(i+1)+": ");
            ds.get(i).show();
        }
    }
    public static void main(String args[])
    {
        System.out.print("\n--------Nhap danh sach diem cho thi sinh--------");
        input();
        System.out.print("\n------danh sach diem thi sinh tung khoi: "+lc);
        show();
    }
}
