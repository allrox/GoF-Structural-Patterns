package bridge;

import bridge.abstraction.Card;
import bridge.abstraction.ProductCard;
import bridge.abstraction.ProfileCard;
import bridge.implementor.WebCardRenderer;
import bridge.implementor.MobileCardRenderer;

public class Main {

    public static void main(String[] args) {

        // Here we instantiate the cards passing each renderer.
        Card productWebCard = new ProductCard(new WebCardRenderer());
        Card productMobileCard = new ProductCard(new MobileCardRenderer());
        Card profileMobileCard = new ProfileCard(new MobileCardRenderer());
        Card profileWebCard = new ProfileCard(new WebCardRenderer());


        System.out.println("Product Cards\n---------------------------");
        productWebCard.render();
        productMobileCard.render();

        System.out.println("Profile Cards\n---------------------------");
        profileWebCard.render();
        profileMobileCard.render();

    }
    
}
