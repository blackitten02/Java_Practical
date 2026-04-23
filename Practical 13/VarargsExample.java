class VarargsExample {

    // Simple varargs
    static void showNumbers(int... nums) {
        System.out.println("Numbers are:");
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    // Example 1: Ambiguity
    static void fun(String... s) {
        System.out.println("String varargs");
    }

    static void fun(int... i) {
        System.out.println("Int varargs");
    }

    // Example 3: Vararg position
    static void display(String name, int... marks) {
        System.out.println("Name: " + name);
        for (int m : marks) {
            System.out.print(m + " ");
        }
        System.out.println();
    }

    // Example 4: Invalid (commented because it causes error)
    /*
    static void test(float... f, int i) { }
    */
}