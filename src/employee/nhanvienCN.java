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
public class nhanvienCN extends nhanvien{
    private int so_ngay_cong;
    
    @Override
    public void input()
    {
        super.input();
        System.out.print("\nnhap so ngay cong: ");
        this.so_ngay_cong=scanner.nextInt();
        scanner.nextLine();
    }
    @Override
    public void show()
    {
        super.show();
        System.out.print("\nso ngay cong: "+this.so_ngay_cong);
    }
    @Override
    public double getluong()
    {
        return this.so_ngay_cong*50000;
    }
}
