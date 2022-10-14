package services.VisitorService;

import services.VisitorService.impl.Computer;
import services.VisitorService.impl.Keyboard;
import services.VisitorService.impl.Monitor;
import services.VisitorService.impl.Mouse;

public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
