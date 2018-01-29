/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NhanVien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CUONGUIT
 */
public class QLCB {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<CanBo>ds = new ArrayList<CanBo>();
    static void input()
    {
        int scb;
        CanBo cb = new CanBo();
        System.out.print("\nnhap so luong can bo: ");
        scb=sc.nextInt();    
        NhanVien nv ;
        CongNhan cn ;
        KySu ks  ;
        int a;
        System.out.print("\n----1 nhap thong tin nhan vien -----");
        System.out.print("\n----2 nhap thong tin cong nhan -----");
        System.out.print("\n----3 nhap thong tin ky su -----");
        System.out.print("\nnhap lua chon cua ban: ");
        a=sc.nextInt();
        System.out.print("\nthong tin cho can bo");
       
        switch (a){
            case 1:
                for(int i=0;i<scb;i++)
                {
                    System.out.print("\nnhan vien thu "+(i+1)+": ");
                    nv= new NhanVien();
                    nv.input();
                    ds.add(nv);
                }
            break;
            case 2:
                for(int i=0;i<scb;i++)
                {
                    System.out.print("\ncong nhan thu "+(i+1)+": ");
                    cn = new CongNhan();
                    cn.input();
                    ds.add(cn);
                }
            break;
            case 3:
                for(int i=0;i<scb;i++)
                {
                    System.out.print("\n ky su thu "+(i+1)+": ");
                    ks= new KySu();
                    ks.input();
                    ds.add(ks);
                }
        }
    }
    static void output()
    {
        System.out.print("\nHien Thi");
        for(int i=0;i<ds.size();i++)
        {
           System.out.print("\nnhan vien thu "+(i+1)+":");
           ds.get(i).show();
        } 
    }
    static void search()
        {
        System.out.print("\n------TIM KIEM-----------");
        System.out.print("\nnhap ten nhan vien can tim: ");
        String ten = sc.next();
        
        for(int i=0;i<ds.size();i++)
        {
            if(ds.get(i).getname().equals(ten))
            {
                System.out.print("\n nhan vien thu "+(i+1)+":");
                ds.get(i).show();
            }
        }
    }
    @SuppressWarnings("empty-statement")
    public static void main(String args[])
    {
        int n ;
        System.out.print("\n Loai 1: cong nhan"
                + "\n   Loai 2: nhan vien"
                + "\n Loai 3: ky su");
        
        do{   
            System.out.print("\n So loai can bo ban muon nhap: >1 and <4: ");
            n = sc.nextInt();
        }
        while(n>3);
        
        for(int i=0;i<n;i++)
        {
            System.out.print("\nLoai nhan vien thu "+(i+1)+":");
            input();
        }
        output();
        search();
        System.out.println();
    }
}
       
