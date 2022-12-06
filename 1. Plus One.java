class Solution {
    public int[] plusOne(int[] digits) {
        int number = 0;
        for(int i=0;i<digits.length;i++)
            number=number*10 + digits[i];
        number+=1;
        String numberInString = String.valueOf(number);
        int[] result=new int[numberInString.length()];
        for(int i=0; i<numberInString.length();i++){
            result[i]=numberInString.charAt(i) - '0';
        }
        return result;
    }

}
