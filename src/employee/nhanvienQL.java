/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author CUONGUIT
 */
public class nhanvienQL extends nhanvien {
    private double luong_co_ban;
    private double he_so_luong;
    
    @Override
    public void input()
    {
        super.input();
        System.out.print("\nnhap luong co ban cua nhan vien: ");
        this.luong_co_ban=scanner.nextDouble();
        scanner.nextLine();
        System.out.print("\nnhap he so luong cua nhan vien: ");
        this.he_so_luong=scanner.nextDouble();
        scanner.nextLine();
    }
    @Override
    public void show()
    {
        super.show();
        System.out.print("\nluong co ban cua nhan vien: "+this.luong_co_ban);
        System.out.print("\nhe so luong cua nhan vien: "+this.he_so_luong);
    }
    @Override
    public double getluong()
    {
        return this.luong_co_ban*this.he_so_luong;
    }
}
