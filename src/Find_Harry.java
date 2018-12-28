public class Find_Harry {

        public boolean presenceOfString(String input) {

            boolean res = input.matches("(.*)Harry(.*)");
            System.out.println(res);
            return res;
        }
    }

