public class finalvalueafteroepration {

    public static void main(String[] args) {

        String operations[] = {"--X", "X++", "X++"};

        int count = 0;

        for (int i = 0; i < operations.length; i++) {

            if (operations[i].equals("--X")) {
                count = count - 1;
            } else if (operations[i].equals("X++")) {
                count = count + 1;
            } else if (operations[i].equals("++X")) {
                count = count + 1;
            }

        }

        System.out.println(count);
    }
}