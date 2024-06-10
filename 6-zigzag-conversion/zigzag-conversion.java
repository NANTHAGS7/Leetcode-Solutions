class Solution {
    public String convert(String s, int numRows) {
        // If numRows is 1 or s length is less than numRows, return the original string
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        // Create a list of StringBuilder to store characters for each row
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        // Iterate over each character in the string
        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);
            // If we are at the top or bottom row, reverse direction
            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }
            // Move to the next row
            currentRow += goingDown ? 1 : -1;
        }

        // Combine all rows to get the final result
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
