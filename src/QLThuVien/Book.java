/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLThuVien;

/**
 *
 * @author CUONGUIT
 */
public class Book extends paper {
    private String ten_tac_gia;
    private int so_trang;
    
    @Override
    public void input()
    {
        super.input();
        System.out.print("\nnhap ten tac gia: ");
        this.ten_tac_gia=scanner.nextLine();
        System.out.print("\nnhap so trang: ");
        this.so_trang=scanner.nextInt();
        scanner.nextLine();
    }
    @Override
    public void show()
    {
        super.show();
        System.out.print("\nten tac gia: "+this.ten_tac_gia);
        System.out.print("\nso trang: "+this.so_trang);
    }
}
