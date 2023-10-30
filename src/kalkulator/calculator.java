package kalkulator;

/**
 * @author Rusdany
 *
 */
public class calculator {

    private long first;
    private long second;

    public calculator(long first, long second){
        this.first = first;
        this.second=second;
    }

    /**
     *
     * @param first
     * @param second
     * @return nilai first tambah nilai second
     */

    public long addFucn(long first, long second){

        return first+second;
    }

    public long subFucn(long first, long second){

        return second-first;
    }

    public long mulFucn(long first, long second){

        return first*second;
    }


    public static void main(String[] args) {

        long first = Long.parseLong(args[0]);
        long second = Long.parseLong(args[1]);

        calculator cal = new calculator(first, second);
        String output = String.format("\n*** Your Results ***\n\nFirst: %d\nSecond: %d\n\nSum : %d\nDifference : %d\nProduct : %d\n\n", cal.getFirst(), cal.getSecond(), cal.addFucn(first, second), cal.subFucn(first, second), cal.mulFucn(first, second));
        System.out.println(output);
    }

    public long getFirst() {
        return first;
    }

    public long getSecond() {
        return second;
    }
}
