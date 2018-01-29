/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the te/++++++++mplate in the editor.
 */
package Shape;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CUONGUIT
 */
public class Shape{
    TamGiac tg;
    ArrayList<TamGiac>ds1= new ArrayList<>();
    int n;
    Scanner sc= new Scanner(System.in);
    public void nhap()
    {
        System.out.print("\nnhap so tam giac: ");
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.print("\ntam giac thu "+(i+1)+": ");
            tg = new TamGiac();
            tg.input();
            ds1.add(tg);
        }
    }
    public void show()
    {
        for(int i=0;i<ds1.size();i++)
        {
            System.out.print("\ntam giac thu "+(i+1)+": ");
            ds1.get(i).show();
        }
    }
    public double tinhtoan()
    {
        double max=0;
        for(int i=0;i<ds1.size();i++)
        {
            if(max<ds1.get(i).dt())
                max=ds1.get(i).dt();
        }

        return max;
    }
    public void in()
    {
        for(int i=0;i<ds1.size();i++)
        {
            if(ds1.get(i).dt()==tinhtoan())
                ds1.get(i).show();
        }
    }
    public static void main(String args[])
    {
        Shape sp = new Shape();
        sp.nhap();
        sp.show();
        System.out.print("\nhinh tam giac co dien tich lon nhat");
        sp.in();
    }    
}
