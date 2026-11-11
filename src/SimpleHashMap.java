import java.lang.classfile.instruction.IncrementInstruction;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class SimpleHashMap {
    private static final int INIT_SIZE = 10;
    //Hash Map Set Up
    ArrayList<ArrayList<KeyValuePairInt>> data = new ArrayList<>();

//Constructor
    public SimpleHashMap() {
        for (int i = 0; i < INIT_SIZE; i++) {
            data.add(new ArrayList<>());
        }
    }

//Return
    int Hash(int key) {
        return key%data.size();
    }

//Get
    public int get(int key) {
        int index = Hash(key);
        ArrayList<KeyValuePairInt> collisionList = data.get(index);

        for (KeyValuePairInt kv : collisionList) {
            if (kv.key == key) {
                return kv.value;
            }
        }
        throw new NoSuchElementException();
    }
//Set
        public void set ( int key, int value){
            int index = Hash(key);
            ArrayList<KeyValuePairInt> collisionList = data.get(index);

            for (KeyValuePairInt kv : collisionList) {
                if (kv.key == key) {
                    kv.value = value;
                    return;
                }
            }
            collisionList.add(new KeyValuePairInt(key, value));
        }
}
