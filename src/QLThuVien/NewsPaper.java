/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLThuVien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author CUONGUIT
 */
public class NewsPaper extends paper {
    private int so_phat_hanh;
    private Date thang_phat_hanh;
    
    public Date DatetoString(String t)
    {
        Date date=null;
        SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
        try
        {
            date=sdf.parse(t);
        }catch(ParseException e)
        {
            System.out.print(e.getMessage());
        }
        return date;
    }
    @Override
    public void input()
    {
        super.input();
        System.out.print("\nnhap thang phat hanh: ");
        String str = scanner.nextLine();
        this.thang_phat_hanh=DatetoString(str);
        System.out.print("\nnhap so phat hanh: ");
        this.so_phat_hanh=scanner.nextInt();
        scanner.nextLine();
    }
    @Override
    public void show()
    {
        super.show();
        System.out.print("\nso phat hanh: "+this.so_phat_hanh);
        System.out.print("\nthanh phat hanh: "+this.thang_phat_hanh);
    }
}
