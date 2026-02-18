class Assignment1 {

    static void Logic1(int size) {

        if (size % 2 == 0) {
            System.out.println("Size must be odd.");
            return;
        }

        int mid = size / 2;

        for (int i = 0; i <= mid; i++) {
            for (int s = 0; s < mid - i; s++)
                System.out.print(" ");

            for (int j = 0; j < 2 * i + 1; j++) {
                if (j == 0 || j == 2 * i)
                    System.out.print("X");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = mid - 1; i >= 0; i--) {
            for (int s = 0; s < mid - i; s++)
                System.out.print(" ");

            for (int j = 0; j < 2 * i + 1; j++) {
                if (j == 0 || j == 2 * i)
                    System.out.print("X");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void Logic2(int size) {

        if (size % 2 == 0) {
            System.out.println("Size must be odd.");
            return;
        }

        int mid = size / 2;

        for (int i = 0; i < size; i++) {

            int spaces = Math.abs(mid - i);
            int stars = size - 2 * spaces;

            for (int s = 0; s < spaces; s++)
                System.out.print(" ");

            for (int j = 0; j < stars; j++) {
                if (j == 0 || j == stars - 1)
                    System.out.print("X");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void Logic3(int size) {

        if (size % 2 == 0) {
            System.out.println("Size must be odd.");
            return;
        }

        int mid = size / 2;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                if (Math.abs(mid - i) + Math.abs(mid - j) == mid)
                    System.out.print("X");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {


        System.out.println("Logic 1:");
        Logic1(11);

        System.out.println("\nLogic 2:");
        Logic2(11);

        System.out.println("\nLogic 3:");
        Logic3(11);

	System.out.println();
	System.out.println();

	System.out.println("Logic 1:");
        Logic1(4);

        System.out.println("\nLogic 2:");
        Logic2(4);

        System.out.println("\nLogic 3:");
        Logic3(4);
    }
}