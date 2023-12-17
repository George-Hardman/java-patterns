package factory;

import factory.pages.AbstractPage;

import java.util.ArrayList;
import java.util.List;

/**
 * The base creator.
 */
public abstract class Website {

    public List<AbstractPage> getPages() {
        return pages;
    }

    protected List<AbstractPage> pages = new ArrayList<>();

    /**
     * Whenever a Website is created, the abstract method is called.
     */
    public Website(){
        System.out.println("Creating a website");
        this.createWebsite();
    }

    /**
     * This is the factory method. It is overwritten, then called whenever a subclass is created.
     * This is the part that makes it concrete.
     */
    public abstract void createWebsite();

}
