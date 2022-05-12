/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

class HackerEarth1{
  public static void main(String[] args)
   {
    int count = 0;
    int a = 3;
    while(count++ < 3)
    {
    int b = (1 + 2 * count) % 3;
    switch(b)
      {
       default:
       case 0: a -= 1; break;
       case 1: a += 5;
      }
    }
System.out.println(a);
  }
}