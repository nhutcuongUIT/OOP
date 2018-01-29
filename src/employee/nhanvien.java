/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author CUONGUIT
 */
public class nhanvien {
    private String full_name;
    private Date Date;
    private String adress;
    private double luong;
    
    public double getluong(){
        return this.luong;
    };
    Scanner scanner = new Scanner(System.in);
    
    public Date datetostring(String str)
    {
        Date dt = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
        try
        {
            dt = sdf.parse(str);
        } catch (ParseException ex) {
            System.out.print("\nnhap sai dinh dang");
        }
        return dt;
    }
    public void input()
    {
        System.out.print("\nnhap ho ten nhan vien: ");
        this.full_name=scanner.nextLine();
        System.out.print("\nnhap ngay sinh nhan vien: ");
        String str=scanner.nextLine();
        this.Date=datetostring(str);
        System.out.print("\nnhap dia chi noi o cua nhan vien: ");
        this.adress=scanner.nextLine();
    }
    public void show()
    {
        System.out.print("\nho ten nhan vien: "+this.full_name);
        System.out.print("\nngay thang nam sinh cua nhan vien: "+this.Date);
        System.out.print("\ndia chi noi o cua nhan vien: "+this.adress);
    }
}
