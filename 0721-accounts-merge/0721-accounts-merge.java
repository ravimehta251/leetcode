class Solution {
    public List<List<String>> accountsMerge(List<List<String>> a) {
        HashMap<String, List<Integer>> map = new HashMap<>();

        // Map each email to its account indices
        for (int i = 0; i < a.size(); i++) {
            for (int j = 1; j < a.get(i).size(); j++) {
                String email = a.get(i).get(j);

                map.computeIfAbsent(email, k -> new ArrayList<>()).add(i);
            }
        }

        boolean[] vis = new boolean[a.size()];
        List<List<String>> p = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            if (!vis[i]) {
                HashSet<String> set = new HashSet<>();

                dfs(i, a, map, vis, set);

                ArrayList<String> ar = new ArrayList<>(set);
                Collections.sort(ar);

                ar.add(0, a.get(i).get(0));
                p.add(ar);
            }
        }

        return p;
    }

    public void dfs(int i, List<List<String>> a,
                    HashMap<String, List<Integer>> map,
                    boolean[] vis, HashSet<String> set) {

        if (vis[i]) return;

        vis[i] = true;

        for (int j = 1; j < a.get(i).size(); j++) {
            String email = a.get(i).get(j);
            set.add(email);

            for (int index : map.get(email)) {
                if (!vis[index]) {
                    dfs(index, a, map, vis, set);
                }
            }
        }
    }
}