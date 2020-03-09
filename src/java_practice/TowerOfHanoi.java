package java_practice;

public class TowerOfHanoi {
    public static String ShowMoves(int n,char startPeg,char destpeg,char tempPeg){
        if(n==1){
            return "move disk 1 from peg "+startPeg+" to peg "+destpeg+"\n";
        }
        else{
            return ShowMoves(n-1,startPeg,tempPeg,destpeg)+"move disk "+n+" from peg "+startPeg+" to peg "+destpeg+"\n"
                    + ShowMoves(n-1,tempPeg,destpeg,startPeg);
        }
    }

    public static void main(String[] args) {
        System.out.println(ShowMoves(3,'a','b','c'));
    }
}
