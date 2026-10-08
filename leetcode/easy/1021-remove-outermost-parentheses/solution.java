class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder answer = new StringBuilder();
        int depth = 0;

        for (char ch : s.toCharArray()) {

            // Opening bracket
            if (ch == '(') {

                // If we are already inside,
                // this is not the outermost bracket.
                if (depth != 0) {
                    answer.append('(');
                }

                depth++;
            }

            // Closing bracket
            else {

                depth--;

                // If we are still inside,
                // this is not the outermost bracket.
                if (depth != 0) {
                    answer.append(')');
                }
            }
        }

        return answer.toString();
    }
}