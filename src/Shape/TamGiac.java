/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Shape;

import static java.lang.Math.sqrt;

/**
 *
 * @author CUONGUIT
 */
public class TamGiac extends DaGiac
{
      @Override
      public double cv()
      {
          return super.cv();
      }
      public double dt()
      {
          double a=cv()/2;
          return sqrt(a*(a-ds.get(0).get_kich_thuoc())*(a-ds.get(1).get_kich_thuoc())*(a-ds.get(2).get_kich_thuoc()));
      }
}
