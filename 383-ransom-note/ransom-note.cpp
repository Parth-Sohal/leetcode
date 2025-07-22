class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
    
        unordered_map<char,int> mag;
        unordered_map<char,int> rag;
        for(int i = 0 ; i < magazine.size() ; i++){
            mag[magazine[i]]++;
        }

        for(int i =0 ; i < ransomNote.size() ;i++){
            rag[ransomNote[i]]++;
        }

        for(auto it : rag){
            if(mag.find(it.first) != mag.end()){
                if(it.second > mag[it.first]){
                    return false;
                }
            }else{
                return false;
            }
        }

        return true;

    }
};