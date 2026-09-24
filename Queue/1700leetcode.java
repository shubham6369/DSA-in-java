class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> queue = new LinkedList<>();

        for (int student : students) {
            q.offer(student);
        }

        int i = 0;
        int rotatio = 0;
        while(!q.isEmpty()){
            if(q.peek() == sandwiches[i]){
                q.poll();
                i++;
                rotation = 0;
            }else{  
                q.offer(q.poll());
                rotation++;

            }
            if(rotation == q.size()){
                return q.size();
            }
        }
        return 0;    
    }
}