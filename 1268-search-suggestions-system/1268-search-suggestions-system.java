class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> arr = new ArrayList<>();
        Arrays.sort(products);

        for (int i = 1; i <= searchWord.length(); i++) {
            List<String> arp = new ArrayList<>();
            String prefix = searchWord.substring(0, i);

            for (String product : products) {
                if (product.startsWith(prefix)) {
                    arp.add(product);

                    if (arp.size() == 3) {
                        break;
                    }
                }
            }

            arr.add(arp);
        }

        return arr;
    }
}