/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLThuVien;

import java.util.Scanner;

/**
 *
 * @author CUONGUIT
 */
public class paper {

private String Ma_tai_lieu;
private String nha_xuat_ban;
private int so_ban_phat_hanh;

Scanner scanner = new Scanner(System.in);

public String getmtl()
{
    return this.Ma_tai_lieu;
}
public void input()
{
    System.out.print("\nnhap ma tai lieu: ");
    this.Ma_tai_lieu=scanner.nextLine();
    System.out.print("\nnhap ten nha xuat ban: ");
    this.nha_xuat_ban=scanner.nextLine();
    System.out.print("\nso bang phat hanh: ");
    this.so_ban_phat_hanh=scanner.nextInt();
    scanner.nextLine();
}
public void show()
{
    System.out.print("\nma tai lieu: "+this.Ma_tai_lieu);
    System.out.print("\nten nha xuat ban: "+this.nha_xuat_ban);
    System.out.print("\nso ban phat hanh: "+this.so_ban_phat_hanh);
}
}
