package HW;

public class Hw {
    public static void main(String[] args) {
        int x, y; //we declare x and y and they can hold a value of a type int
        //x and y are uninitialized integers
        int z = -99; /*z is an initialized integer and we assign -99 to it
        which is 1111111110011101 in two's complement*/
        y = ++z;//pre-increment operator
         /* z = z+1 which is -98 and then y = z
         -98 is 1111111110011110 in two's complement */
        x = y++; //post-increment operator
        //x = y which is -98 and then y = y+1 which is -97
        //so far x=-98 y=-97 z=-98
        boolean first = (y == x); //we declare a variable "first" which is a boolean type
        //first is false as y=-97 and x=-98 clearly they are not equal
        boolean second = (x == y - 1) && (y == z + 2);/*x is equal to y-1, hence the first component is true,
         but y is not equal to z+2, hence the second component is false,
          true and false gives false, hence the value of second is false*/
        x = ~ z + 1;/* ~1111111110011110 (the value of z in twos complement is 0000000001100001
        which is 97 in decimal form and then we add 1,
         so overall x gets the value 98 */
        boolean third = (x >= 0) || (x + z == 0);/*first component is true as x is 98;
        the second component is also true as z is -98, hence third is true, as true or true is true */
        boolean fourth = !third; //fourth is false as not true is false
        System.out.println("x = " + x + "; y = " + y + "; z = " + z + ";");// prints "x = 98; y = -97; z = -98;"
        System.out.println("first = " + first + "; second = " + second + ";");/* on the new line prints
         "first = false; second = false;" */
        System.out.println("third = " + third + "; fourth = " + fourth + ";"); /*on a new line prints
         "third = true; fourth = false;"*/
        y = z | x; //bitwise OR operator
        //z is 1111111110011110 and x is 0000000001100010 in binary
        //z|x will be 1111111111111110 which is -2 in twos complement
        //y = -2
        z >>= 2; //is the same as z = z >> 2 (bitwise shift right operator)
        /* z is 1111111110011110 and when we shift right by two bits we get
         1111111111100111 which is -25  */

        x = y * 1000 % z;/* first it calculates the reminder when we divide 1000 to -25 which gives 0
        and -2 times 0 is 0 => x gets the value 0*/

        System.out.println("x = " + x + "; y = " + y + "; z = " + z + ";"); /*prints "x = 0; y = -2; z = -25;"*/

    }
}
