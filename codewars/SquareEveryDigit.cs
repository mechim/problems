using System;

public class Kata
{
  public static int SquareDigits(int n)
  {
    string answ = "";
    while (n != 0){
      int a = n % 10;
      answ = (a * a).ToString() + answ;
      n /= 10;
    }
    if (answ == "") answ = "0";
    int result = Convert.ToInt32(answ);
    return result;
  }
}
