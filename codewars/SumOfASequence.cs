public static class Kata
{
  public static int SequenceSum(int start, int end, int step)
  {
    if (start > end) return 0;
    
    int sum = 0;
    for (int i = 0; start + i * step <= end; i++){
      sum += start + i * step;
    }
    return sum;
  }
}
