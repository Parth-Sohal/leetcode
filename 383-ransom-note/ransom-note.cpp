class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
    
        vector<int> mag(27,0);
        vector<int> rag(27,0);
        for(int i = 0 ; i < magazine.size() ; i++){
            mag[magazine[i] - 'a']++;
        }

        for(int i =0 ; i < ransomNote.size() ;i++){
            rag[ransomNote[i] - 'a']++;
        }

        for(int i = 0 ; i < rag.size() ;i++){
            if(rag[i] != 0){
                if(rag[i] > mag[i]){
                    return false;
                }
            }
        }
        return true;

    }
};