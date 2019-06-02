import java.util.*;

public class _347_TopK_Freq_El {
    public List<Integer> topKFrequent(int[] nums, int k) {
        if(nums.length == 0 ) return new ArrayList<Integer>();

        Map<Integer, Integer> freqMap = getFreqMap(nums);

        // create minHeap size of k to store k freq elements
        PriorityQueue<Map.Entry<Integer, Integer>> minheap = new PriorityQueue<>(k,
                new Comparator<Map.Entry<Integer, Integer>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                        return o1.getValue().compareTo(o2.getValue());
                    }
                }
        );

        // put top k el in min-heap, and check on the rest
        for(Map.Entry<Integer, Integer> entry: freqMap.entrySet()){
            if(minheap.size() < k){
                minheap.offer(entry);
            } else if(entry.getValue() > minheap.peek().getValue()) {
                minheap.poll();
                minheap.offer(entry);
            }
        }
        return freqList(minheap);
    }

    public Map<Integer, Integer> getFreqMap(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map;
    }

    public List<Integer> freqList(PriorityQueue<Map.Entry<Integer, Integer>> minheap){
        List<Integer> result = new ArrayList<>();
        for(int i = minheap.size() - 1; i >= 0; i--){
            int el = minheap.poll().getKey();
            result.add(el);
        }
        return result;
    }
}
