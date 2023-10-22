public class BinaryChop {
    public BinaryChop() {
    }

    public int chop(int searchNumber, int[] sortedList){
        for(int index = 0; index < sortedList.length; ++index){
            if(searchNumber == sortedList[index]) return index;
        }
        return -1;
    }
}
