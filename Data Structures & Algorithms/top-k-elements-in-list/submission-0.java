class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map1 = new HashMap<>();
       

      
        for (int i : nums) {
            map1.put(i, map1.getOrDefault(i, 0) + 1);
        }



        List<Integer> li=new ArrayList<>(map1.keySet());
        li.sort((a,b)->map1.get(b)-map1.get(a));

        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=li.get(i);
        }
return res;
       

        
    
    }
}