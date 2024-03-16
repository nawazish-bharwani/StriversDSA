class Solution {
    public int[][] merge(int[][] intervals) {
                int n = intervals.length; //Size of the array
        //Sort the array using comparator bases on the 1st (0th indexed element)
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        List<List<Integer>> ansList = new ArrayList<>();
        for (int i=0; i<n; i++) {
            if(ansList.isEmpty() || intervals[i][0] > ansList.get(ansList.size() -1).get(1)) {
                ansList.add(Arrays.asList(intervals[i][0],intervals[i][1]));
            } else {
                ansList.get(ansList.size()-1).set(1, Math.max(ansList.get(ansList.size()-1).get(1),intervals[i][1]));
            }
        }
        int[][] ansArray = new int[ansList.size()][ansList.get(0).size()];
        for(int i=0;i< ansList.size();i++) {
            for(int j=0;j<ansList.get(0).size();j++) {
                ansArray[i][j] = ansList.get(i).get(j);
            }
        }
        return ansArray;
    }
}