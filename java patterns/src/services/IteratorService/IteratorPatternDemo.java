package services.IteratorService;

import services.IteratorService.impl.NameRepository;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository namesRepository =
                new NameRepository();

        for(Iterator iterator = namesRepository.getIterator();
            iterator.hasNext();) {
            String name = (String)iterator.next();
            System.out.println("Name : " + name);
        }
    }
}
