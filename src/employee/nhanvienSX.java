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
public class nhanvienSX extends nhanvien {
    private int so_san_pham;
    
    @Override
    public void input()
    {
        super.input();
        System.out.print("\nnhap so san pham: ");
        this.so_san_pham=scanner.nextInt();
        scanner.nextLine();
    }
    @Override
    public void show()
    {
        super.show();
        System.out.print("\nso san pham: "+this.so_san_pham);
    }
    @Override
    public double getluong()
    {
        return this.so_san_pham*2000;
    }
    
}
