package services.VisitorService;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
