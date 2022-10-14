package services.VisitorService.impl;

import services.VisitorService.ComputerPart;
import services.VisitorService.ComputerPartVisitor;

public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
