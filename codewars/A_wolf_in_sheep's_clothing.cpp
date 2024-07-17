#include <vector>
#include <string>

std::string warn_the_sheep(const std::vector<std::string>& queue)
{
  if(queue[queue.size()-1] == "wolf") return "Pls go away and stop eating my sheep";
  for (int i = 0; i < queue.size(); i++){
    if (queue[i] == "wolf") return "Oi! Sheep number " + std::to_string(queue.size() - i - 1) + "! You are about to be eaten by a wolf!";
  }
    return "";
}
