package Task_1;

public class Number {
    private char[] number;

    public Number( String number ){
        this.number = number.toCharArray();
    }

    public char[] getNumber(){return this.number;}

    public String  printNumber(){
        //System.out.println(String.valueOf(number));
        return String.valueOf(number);
    }

    public int getAtIndex(int index){
        //System.out.println(number[index-1]);
        int returnValue =Integer.parseInt(String.valueOf(number[index-1]));
        return returnValue;
    }

    public void printLineWise(){
        for (int i = 0; i < number.length; i++) {
            //System.out.println(number[i]);
        }
    }
}
