/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLThuVien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CUONGUIT
 */
public class QuanLySach {
    static Scanner scanner= new Scanner(System.in);
    static Book b ;
    static magazine mgz;
    static NewsPaper npp;
    static ArrayList<paper>ds = new ArrayList<>();
    @SuppressWarnings("empty-statement")
    public static void input()
    {
        int stl;
        System.out.print("\nnhap so luong tai lieu: ");
        stl = scanner.nextInt();
        System.out.print("\n------1 nhap thong tin sach ------");
        System.out.print("\n------2 nhap thong tin tap chi ------");
        System.out.print("\n------3 nhap thong tin bao ------");
        int n;
        do{
        System.out.print("\nLoai tai lieu: ");
        n = scanner.nextInt();
        }while(n>3);
        switch (n){
            case 1:
                for (int i=0;i<stl;i++)
                {
                   System.out.print("\ntai lieu thu "+(i+1)+": ");
                    b = new Book(); 
                    ds.add(b);      
                    b.input();
                }
            break;
            case 2:
                for(int i=0;i<stl;i++)
                {
                    System.out.print("\ntai lieu thu "+(i+1)+": ");
                    mgz = new magazine();
                    mgz.input();
                    ds.add(mgz);
                }
            break;
            case 3:
                for (int i=0;i<stl;i++)
                {
                    System.out.print("\ntai lieu thu "+(i+1)+": ");
                    npp = new NewsPaper();
                    npp.input();
                    ds.add(npp);
                }
        }
    }
    public static void show()
    {
        for(int i=0;i<ds.size();i++)
        {
           System.out.print("\ntai lieu "+(i+1)+": ");
           ds.get(i).show();
        }
    }
    public static void search()
    {
        System.out.print("\nnhap tai lieu ban can tim: ");
        String ma_tai_lieu=scanner.next();
        for(int i=0;i<ds.size();i++)
        {
            if(ds.get(i).getmtl().equals(ma_tai_lieu))
                ds.get(i).show();
        }
    }
    public static void main(String args[])
    {
        int n ;
        System.out.print("\n Loai 1: Sach"
                + "\n   Loai 2: Tap Chi"
                + "\n Loai 3: bao");
        
        do{   
            System.out.print("\n So loai tai lieu ban muon nhap: >1 and <4: ");
            n = scanner.nextInt();
        }
        while(n>3);
        
        for(int i=0;i<n;i++)
        {
            System.out.print("\nLoai tai lieu thu "+(i+1)+":");
            input();
        }
        System.out.print("\n---------HIEN THI-----------------");
        show();
        System.out.print("\n-------------TIM KIEM------------");
        search();
    }
}
