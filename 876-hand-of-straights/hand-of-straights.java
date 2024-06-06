class Solution {
  public boolean isNStraightHand(int[] hand, int w) {
    // TreeMap<Integer, Integer> count = new TreeMap<>();

    // for (final int card : hand)
    //   count.merge(card, 1, Integer::sum);

    // for (final int start : count.keySet()) {
    //   final int value = count.getOrDefault(start, 0);
    //   if (value > 0)
    //     for (int i = start; i < start + groupSize; ++i)
    //       if (count.merge(i, -value, Integer::sum) < 0)
    //         return false;
    // }

    // return true;
    if(hand.length % w != 0) return false;

    TreeMap<Integer,Integer> counts = new TreeMap();
    for(int card:hand){
        if(!counts.containsKey(card)){
            counts.put(card,1);
        }
        else{
            counts.replace(card,counts.get(card)+1);
        }
    }
    while(counts.size() > 0){
        int min = counts.firstKey();
        for(int c=min;c<min+w;c++){
            if(!counts.containsKey(c)) return false;
            int count = counts.get(c);
            if(count == 1) counts.remove(c);
            else counts.replace(c,count-1);
        }
    }
    return true;
  }
}