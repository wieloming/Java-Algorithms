package companies.forgotten;

public class PrintAllValidCombinationsOfParenthesis {

    public void calculate(String parenthesis){
        int left = 0;
        int right = 0;
        for(int i = 0; i < parenthesis.length(); i++){
            if(String.valueOf(parenthesis.charAt(i)).equals(")")){
                right++;
            }
            if(String.valueOf(parenthesis.charAt(i)).equals("(")){
                left++;
            }
        }
        calculate(left, right, "", 0);
    }

    private void calculate(int leftRemain, int rightRemain, String result, int opendedParenthesis){

        if(leftRemain == 0 && rightRemain == 0){
            System.out.println(result);
        }
        if(leftRemain > 0){
            calculate(leftRemain-1, rightRemain, result + "(", opendedParenthesis+1);
        }
        if(rightRemain > 0 && opendedParenthesis > 0){
            calculate(leftRemain, rightRemain-1, result + ")", opendedParenthesis-1);
        }
    }
}
