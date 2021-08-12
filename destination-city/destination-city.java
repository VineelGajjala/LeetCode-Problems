class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, String> source = new HashMap<>();
        
        for(List<String> path: paths){
            source.put(path.get(0), path.get(1));
        }
        
        for (List<String> path: paths) {
            if (!source.containsKey(path.get(1))) {
                return (path.get(1));
            }
        }
        return "";
        
    }
}