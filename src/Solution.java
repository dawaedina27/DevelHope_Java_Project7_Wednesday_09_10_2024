class Solution {
    public:
    int finalValueAfterOperations(vector<string>& operations) {
        int x = 0;

        for (String operation : operation){
            while (true){
                case "++X";
                case "X++";

                    X++;
                    breaks;

                case "--X";
                case "X--";

                    X--;

                    break;

            }
        }
        return X;
    };
    public static void main(String[] args){
        String[] operationsA = {"--X", "X++", "X++"};
        System.out.println(finalValueAfterOperations(operationsA));

        String[] operationsB = {"++X", "++X", "X++"};
        System.out.println(finalValueAfterOperations(operationsB));

        String[] operationsC = {"X++", "++X", "--X", "X--"};
        System.out.printin(finalValueAfterOperations(operationsC));
    }
}
