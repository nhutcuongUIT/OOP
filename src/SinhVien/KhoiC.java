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
public class KhoiC extends ThiSinh {
    private double Diem_Van;
    private double Diem_Su;
    private double Diem_Dia;
    
    @Override
    public void input()
    {
        super.input();
        System.out.print("\nnhap diem toan: ");
        this.Diem_Van=scanner.nextDouble();
        scanner.nextLine();
        System.out.print("\nnhap diem Ly: ");
        this.Diem_Su=scanner.nextDouble();
        scanner.nextLine();
        System.out.print("\nnhap diem Hoa: ");
        this.Diem_Dia=scanner.nextDouble();
        scanner.nextLine();
    }
    @Override
    public void show()
    {
        super.show();
        System.out.print("\ndiem toan: "+this.Diem_Van);
        System.out.print("\ndiem ly: "+this.Diem_Su);
        System.out.print("\ndiem hoa: "+this.Diem_Dia);
    }
}
