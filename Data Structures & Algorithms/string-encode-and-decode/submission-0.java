class Solution {

    public String encode(List<String> strs) {
        String encodedString = "";

        for (String str : strs) {
            encodedString = encodedString + str.length() + "#" + str;
        }

        return encodedString;
    }

    public List<String> decode(String str) {
        List<String> decodedString = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            // Find #
            int j = i;

            while (str.charAt(j) != '#') {
                j++;
            }

            // Get the number before #
            int length = Integer.parseInt(str.substring(i, j));

            // Start of actual word
            int start = j + 1;

            // End of actual word
            int end = start + length;

            // Extract word
            String value = str.substring(start, end);

            decodedString.add(value);

            // Move to next encoded string
            i = end;
        }

        return decodedString;
    }
}