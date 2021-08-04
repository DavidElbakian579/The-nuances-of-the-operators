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
public class Solution1 {
    /* 1
    Логические операторы
    Внеси исправления в метод taskForCondition(), чтобы он выводил в консоли число 30. 
    Изменять можно только логические операторы: && на & и || на |.
    */
    
    public static void taskForCondition() {
        int number = 15;
        boolean conditionFirst = number < 15 & number > 25 & (number += 15) < 25;
        boolean conditionSecond = (number | 5) > 12 || (number = number + 2) > 40;
        System.out.println(number);
    }
}
