package services.VisitorService;

import services.VisitorService.impl.Computer;
import services.VisitorService.impl.ComputerPartDisplayVisitor;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
