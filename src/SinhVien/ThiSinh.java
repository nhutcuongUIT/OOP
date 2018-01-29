/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinhVien;

import java.util.Scanner;

/**
 *
 * @author CUONGUIT
 */
public class ThiSinh {
    private String so_bao_danh;
    private String ho_ten;
    private String dia_chi;
    private int Uu_tien;
    
    Scanner scanner = new Scanner(System.in);
    public String getsobaodanh()
    {
        return this.so_bao_danh;
    }
    public void input()
    {
        System.out.print("\nnhap so bao danh cua thi sinh: ");
        this.so_bao_danh=scanner.nextLine();
        System.out.print("\nnhap ho ten cua thi sinh: ");
        this.ho_ten=scanner.nextLine();
        System.out.print("\nnhap dia chi cua thi sinh: ");
        this.dia_chi=scanner.nextLine();
        System.out.print("\nnhap dien uu tien cua thi sinh: ");
        this.Uu_tien=scanner.nextInt();
        scanner.nextLine();
    }
    public void show()
    {
        System.out.print("\nso bao danh cua thi sinh: "+this.so_bao_danh);
        System.out.print("\nho ten cua thi sinh: "+this.ho_ten);
        System.out.print("\ndia chi cua thi sinh: "+this.dia_chi);
        System.out.print("\ndien uu tien cua thi sinH: "+this.Uu_tien);
    }
}
