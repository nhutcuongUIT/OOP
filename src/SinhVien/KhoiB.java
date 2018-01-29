/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinhVien;

/**
 *
 * @author CUONGUIT
 */
public class KhoiB extends ThiSinh {
    private double Diem_Toan;
    private double Diem_Sinh;
    private double Diem_Hoa;
    
    @Override
    public void input()
    {
        super.input();
        System.out.print("\nnhap diem toan: ");
        this.Diem_Toan=scanner.nextDouble();
        scanner.nextLine();
        System.out.print("\nnhap diem Ly: ");
        this.Diem_Sinh=scanner.nextDouble();
        scanner.nextLine();
        System.out.print("\nnhap diem Hoa: ");
        this.Diem_Hoa=scanner.nextDouble();
        scanner.nextLine();
    }
    @Override
    public void show()
    {
        super.show();
        System.out.print("\ndiem toan: "+this.Diem_Toan);
        System.out.print("\ndiem ly: "+this.Diem_Sinh);
        System.out.print("\ndiem hoa: "+this.Diem_Hoa);
    }
}
