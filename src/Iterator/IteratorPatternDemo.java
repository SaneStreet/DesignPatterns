package Iterator;
/*
https://www.tutorialspoint.com/design_pattern/iterator_pattern.htm
Iterator - Sequentially access the elements of a collection
Example : Next/Previous buttons on TV
 */

public class IteratorPatternDemo {

    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        //for every name, if hasNext is true, print the name
        for (Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }
    }
}
