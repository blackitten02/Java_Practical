class Example {

    public static void main(String[] args) {

        try {
            // Check minimum arguments
            if (args.length < 2) {
                throw new Exception("Please provide exactly 2 arguments");
            }

            // Ignore extra arguments
            if (args.length > 2) {
                System.out.println("Warning: Extra arguments will be ignored");
            }

            String charInput = args[0];
            String str = args[1];

            // Check if first input is single character
            if (charInput.length() != 1) {
                throw new Exception("First argument must be a single character");
            }

            char ch = charInput.charAt(0);

            System.out.println("Original String: " + str);

            // Approach 1: Using loop
            System.out.println("Approach 1:");
            repeatUsingLoop(str, ch);

            // Approach 2: Using replace()
            System.out.println("Approach 2:");
            repeatUsingReplace(str, ch);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Approach 1: Loop
    static void repeatUsingLoop(String str, char ch) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                result += ch + "" + ch;
            } else {
                result += str.charAt(i);
            }
        }

        System.out.println(result);
    }

    // Approach 2: replace()
    static void repeatUsingReplace(String str, char ch) {
        String result = str.replace(Character.toString(ch), ch + "" + ch);
        System.out.println(result);
    }
}