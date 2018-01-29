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
public class KhoiA extends ThiSinh {
    private double Diem_Toan;
    private double Diem_Ly;
    private double Diem_Hoa;
    
    public double DiemToan()
    {
        return this.Diem_Toan;
    }
    public double DiemLy()
    {
        return this.Diem_Ly;
    }
    public double DiemHoa()
    {
        return this.Diem_Hoa;
    }

    /**
     *
     */
    @Override
    public void input()
    {
        super.input();
        System.out.print("\nnhap diem toan: ");
        this.Diem_Toan=scanner.nextDouble();
        scanner.nextLine();
        System.out.print("\nnhap diem Ly: ");
        this.Diem_Ly=scanner.nextDouble();
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
        System.out.print("\ndiem ly: "+this.Diem_Ly);
        System.out.print("\ndiem hoa: "+this.Diem_Hoa);
    }
}
