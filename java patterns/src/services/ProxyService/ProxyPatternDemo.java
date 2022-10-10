package services.ProxyService;

import services.ProxyService.impl.ProxyImage;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        IImage image = new ProxyImage("test_10mb.jpg");

        image.display();
        System.out.println("");

        image.display();
    }
}
