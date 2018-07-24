import java.util.HashMap;
import java.util.Map;

public class ThirtyFive {

	public int FirstNotRepeatingChar(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); ++i)
            mp[str[i]]++;
        for(int i = 0; i < str.length(); ++i){
            if(mp[str[i]]==1)
                return i;
        }
        return -1;
    }
}
