
interface IntSequence {
    public static IntSequence of(int... values) {
        return new IntArraySequence(values);
    }
    
    public boolean hasNext();
    public int next();
}

public class IntArraySequence implements IntSequence {
    private int[] values;
    private int index;
    
    public IntArraySequence(int... values) {
        this.values = values;
        this.index = 0;
    }
    
    public boolean hasNext() {
        return index < values.length;
    }
    
    public int next() {
        return values[index++];
    }

    public static void main(String[] args) {
        IntSequence seq = IntSequence.of(3, 1, 4, 1, 5, 9);
        while (seq.hasNext()) {
            System.out.println(seq.next());
        }
    }
}


