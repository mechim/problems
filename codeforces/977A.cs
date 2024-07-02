using System;
class WrongSubtraction {
  static void Main() {
    string input = Console.ReadLine();
    string[] inputSplit = input.Split(" ");
    int n = Convert.ToInt32(inputSplit[0]); int k = Convert.ToInt32(inputSplit[1]);
    
    for (int i = 0; i < k; i++){
        int a = n % 10;
        if (a != 0){
            n -= 1;
        } else {
            n /= 10;
        }
    }
  Console.WriteLine(n);
  }
}
