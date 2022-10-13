package services.TemplateService;

import services.TemplateService.impl.Cricket;
import services.TemplateService.impl.Football;

public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();

        System.out.println();

        game = new Football();
        game.play();
    }
}
