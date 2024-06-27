using System;
class HelloWorld {
    public static bool IsHappy(int number){
        bool res = true;
        while (number != 0){
            int digit = number % 10;
            number /= 10;
            if (!(digit == 7 || digit == 4)){
                res = false;
                break;
            }
        }
        return res;
    }
  static void Main() {
    int input = Convert.ToInt32(Console.ReadLine());
    bool almost = false;
    for (int i = 4; i <= input; i ++){
        if (IsHappy(i)){
            if (input % i == 0){
                almost = true;
            }
        }
    }
    
    if (almost){
        Console.WriteLine("YES");
    } else {
        Console.WriteLine("NO");
    }
  }
}
