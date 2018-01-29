/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NhanVien;

/**
 *
 * @author CUONGUIT
 */
public class CongNhan extends CanBo {
    private String Bac;
    

    @Override
    public void input()
    {
        super.input();
        System.out.print("nhap bac cua nhan vien: ");
        this.Bac=sc.nextLine();
    }
    @Override
    public void show()
    {
        super.show();
        System.out.print("\nbac cua nhan vien: "+this.Bac);
    }
}
