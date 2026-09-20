// we will use hashing in this problem 
// hashing has two parts map and set both are interface
// map has key and set has unique data type 
// there are 3 types of derived of  map 1. hash map 2.linked hash map 3.tree map 
// 1.does not maintain insertion order (null key allowed only 1)
// 2.maintain insertion order (null key allowed only 1)
// 3. store key in sorted order(tree map does not allowed null values )
// There are 3 types of set 1. hash set 2.linked hash set 3. tree set 
// 1. Hash set stores unique elements using hashing(alllowed one null value)
// 2. Linked 
// 3.
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs){
             char[] chars = str.toCharArray();
            Arrays.sort(chars);

            String Key = new String(chars);

            if (!map.containsKey(Key)){
                map.put(Key, new ArrayList<>());
            }

            map.get(Key).add(str);
        }

        return new ArrayList<>(map.values());        
    }
}