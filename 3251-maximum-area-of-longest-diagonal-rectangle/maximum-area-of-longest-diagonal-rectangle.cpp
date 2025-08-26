class Solution {
public:
    int areaOfMaxDiagonal(vector<vector<int>>& dimensions) {

        int diagnol = 0 ;
        int area = 0 ;

        for(int i = 0 ; i < dimensions.size() ; i++){

            int lenght = dimensions[i][0];
            int breadth = dimensions[i][1];
            int dia = (lenght*lenght + breadth*breadth);

            if(dia > diagnol){
                area = lenght * breadth;
                diagnol = dia ;
            }else if(dia == diagnol){
                area = max(area , lenght * breadth);
            }
        } 

        return area;
        
    }
};