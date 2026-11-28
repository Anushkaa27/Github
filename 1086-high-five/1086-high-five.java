class Solution {
    public int[][] highFive(int[][] items) {
        HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for(int[] studentDetail : items){
            int id = studentDetail[0];//student ka 0th element 
            int score = studentDetail[1];
            if(!map.containsKey(id)){
                map.put(id, new PriorityQueue<>());
            }
    
            PriorityQueue<Integer> heap = map.get(id);
            heap.offer(score);
            if(heap.size()>5){
                heap.poll();
            }
            // for(int scoreValue: heap){
            //     sum += scoreValue;
            // }THIS IS COMPLETELY WRONGGGGG!!!!
        }
        int[][] result = new int[map.size()][2];
        int index = 0;
        for (int id = 1; id<1000; id++){
            if (map.containsKey(id)){
                int sum = 0;
                for(int val : map.get(id)){
                    sum += val;
                }
                result[index][0] = id;
                result[index][1] = sum/5;
                index++;
            }
        }
        return result;
    }
}