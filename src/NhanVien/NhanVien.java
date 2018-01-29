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
public class NhanVien extends CanBo {
    private String congviec;
    

    @Override
    public void input()
    {
        super.input();
        System.out.print("nhap cong viec cua nhan vien: ");
        this.congviec=sc.nextLine();
    }

    @Override
    public void show()
    {
        super.show();
        System.out.print("\ncong viec cua nhan vien: "+this.congviec);
    }
}
