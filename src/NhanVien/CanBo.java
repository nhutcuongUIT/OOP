/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NhanVien;

import java.util.Scanner;

/**
 *
 * @author CUONGUIT
 */
public class CanBo {
    private String name;
    private String Date;
    private String sex;
    private String address;
    
    Scanner sc= new Scanner(System.in);
    
    public String getname()
    {
        return this.name;
    }
    public void input()
    {
        System.out.print("\nnhap ho ten: ");
        this.name=sc.nextLine();
        System.out.print("nhap gioi tinh: ");
        this.sex=sc.nextLine();
        System.out.print("nhap dia chi: ");
        this.address=sc.nextLine();
        System.out.print("nhap nam sinh: ");
        this.Date=sc.nextLine();

    }
    public void show()
    {
        System.out.print("\nho ten nhan vien: "+this.name);
        System.out.print("\nnam sinh cua nhan vien: "+this.Date);
        System.out.print("\ngioi tinh cua nhan vien: "+this.sex);
        System.out.print("\ndia chi nhan vien dang o: "+this.address);
    }    
}
