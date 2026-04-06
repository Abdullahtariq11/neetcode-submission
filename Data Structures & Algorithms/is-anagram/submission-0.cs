public class Solution {
    public bool IsAnagram(string s, string t) {
 if (s.Length != t.Length || s.Length < 1)
        return false;
    Dictionary<char, int> map = new Dictionary<char, int>();
    for (int i = 0; i < s.Length; i++)
    {
        if (map.ContainsKey(s[i]))
            map[s[i]]++;
        else
            map[s[i]] = 1;
    }
    for (int i = 0; i < t.Length; i++)
    {
        if (map.ContainsKey(t[i]) && map[t[i]] != 0)
        {
            map[t[i]]--;
        }
        else
        {
            return false;
        }

    }

    return true;
    }
}
