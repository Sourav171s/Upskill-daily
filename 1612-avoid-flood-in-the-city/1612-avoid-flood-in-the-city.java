class Solution {
    public int[] avoidFlood(int[] rains) {

        int n = rains.length;
        int ans[] = new int[n];
        HashMap<Integer, Integer> hm = new HashMap<>(); //for element->their last index
        TreeSet<Integer> st = new TreeSet<>(); //for storing the indexes of 0s
        for (int i = 0; i < n; i++) {
            if (rains[i] == 0) {
                st.add(i);
            } else {
                if (!hm.containsKey(rains[i])) {
                    hm.put(rains[i], i);
                    ans[i] = -1;
                }

                else {
                    int ind = hm.get(rains[i]);
                    Integer data = st.higher(ind); //if no such value present then it returns null
                    if (data == null) {
                        return new int[] {};
                    } else {
                        ans[data] = rains[i];
                        ans[i]=-1;
                        st.remove(data);
                        hm.put(rains[i], i);
                    }
                }
            }
        }
        for (int x : st) {
            ans[x] = 1;
        }
        return ans;

    }
}