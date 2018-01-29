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
public class magazine extends paper {
    private Date ngay_phat_hanh;
    
    public Date DatetoString(String str)
    {
        String pattern ="yyyy/mm/dd";
        Date dt= null;
        SimpleDateFormat sdf= new SimpleDateFormat(pattern);
        try{
            dt=sdf.parse(str);
        }catch(ParseException e)
        {
            System.out.print(e.getMessage());
        }
        return dt;
    }
    @Override
    public void input()
    {
        super.input();
        System.out.print("\nnhap ngay phat hanh: ");
        String str = scanner.nextLine();
        this.ngay_phat_hanh=DatetoString(str);
    }       

    /**
     *
     */
    @Override
    public void show()
    {
        super.show();
        System.out.print("\nngay phat hanh: "+this.ngay_phat_hanh);
        
    }
}
