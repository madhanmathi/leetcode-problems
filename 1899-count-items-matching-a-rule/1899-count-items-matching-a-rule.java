class Solution {
    public int countMatches(List<List<String>> ls, String rulekey, String rulevalue) {
        int count = 0;
            for(int i =0;i<ls.size();i++)
            {
            switch(rulekey){
            case "type":
            if(ls.get(i).get(0).equals(rulevalue)){
            count++;
        }
        break;
        case "color":
            if(ls.get(i).get(1).equals(rulevalue)){
            count++;
        }break;
        case "name":
            if(ls.get(i).get(2).equals(rulevalue)){
            count++;
        }break;    
            default:
            continue;
        }
    }
    return count;
    }
}