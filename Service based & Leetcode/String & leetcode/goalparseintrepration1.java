public class goalparseintrepration1 {
    public static void main(String[] args) {
        String command="G()(al)";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                sb.append('G');
            } else if (command.charAt(i) == '(' &&
                       command.charAt(i + 1) == ')') {
                sb.append('o');
                i++;
            } else {
                sb.append("al");
                i += 3;
            }
        }
        System.out.println(sb);
    }
    
}
