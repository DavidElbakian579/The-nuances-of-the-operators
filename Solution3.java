/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasyntaxpro9l7;

/**
 *
 * @author David-pc
 */
public class Solution3 {
    public static void testForIncrement() {
        int a = 3;
        int b = ++a + (a-- * ++a);
        System.out.println(b);
    }
}
