/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CUONGUIT
 */
public class DaGiac {
    private int so_canh;
    private double kich_thuoc;
    ArrayList<DaGiac>ds= new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    DaGiac dg;
    public double get_kich_thuoc()
    {
        return this.kich_thuoc;
    }
    public void input()
    {
        System.out.print("\nnhap so canh: ");
        this.so_canh=scanner.nextInt();
        for(int i=0;i<this.so_canh;i++)
        {
            dg= new DaGiac();
            System.out.print("\nnhap kich thuoc canh thu "+(i+1)+": ");
            dg.kich_thuoc=scanner.nextDouble();
            ds.add(dg);
        }
    }
    public void show()
    {
        for (int i=0;i<ds.size();i++) {
            System.out.print("\nkich thuoc canh thu : "+(i+1)+": "+ds.get(i).kich_thuoc);
        }
    }
    public double cv()
    {
        double sum=0;
        for(int i=0;i<ds.size();i++)
        {
            sum+=ds.get(i).kich_thuoc;
        }
        return sum;
    }
}
