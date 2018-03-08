package Iterator;

public class NameRepository implements Container{
    public String names[] = {"Michael H.", "Michael T.", "Lisa", "Thomas", "Niels"};

    @Override
    public Iterator getIterator(){
        return new NameIterator();
    }

    private class NameIterator implements Iterator{
        int index;

        //If index number is less than the length of the array names, return true
        @Override
        public boolean hasNext(){
            if (index < names.length){
                return true;
            }
            return false;
        }

        //If hasNext() is true, add 1 to index
        @Override
        public Object next(){
            if (this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
