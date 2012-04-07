/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hwmaven1;

/**
 *
 * @author ean
 */
public class Reverse {
    public String string(String s)
    {
        int l = s.length();
        char[] c = s.toCharArray();
        char t;
        for (int x=0; x<(l/2); x++)
        {
            t = c[x];
            c[x] = c[l-1 - x];
            c[l-1 - x] = t;
        }
        String r = new String(c) ;
        return r;
    }
    
}
