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
public class KySu extends CanBo {
    private String nganhdaotao;
    

    @Override
    public void input()
    {
        super.input();
        System.out.print("nhap nganh dao tao: ");
        this.nganhdaotao=sc.nextLine();
    }
    @Override
    public void show()
    {
        super.show();
        System.out.print("\nnganh dao tao: "+this.nganhdaotao);
    }
}
