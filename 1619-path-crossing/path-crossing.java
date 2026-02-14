class Solution {
    public boolean isPathCrossing(String path) {
         HashSet<String> hs = new HashSet<>() ;

        
        int startX = 0 ;
        int startY = 0 ;
        
        
        hs.add(startX+","+startY);
        
        
        for(int i = 0 ; i < path.length() ; i++){
            
            char c = path.charAt(i);
            
            if(c == 'N'){
                startY++;
            }
            else if(c == 'S'){
                startY--;
            }
            
            else if(c == 'E'){
                startX++;
            }
            else if(c == 'W'){
                startX--;
            }
            
            String curr = startX+","+startY;
            
            if(hs.contains(curr)){
                return true ;
            }
            
            hs.add(curr);
        }

        return false ; 

    }
}