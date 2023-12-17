package factory;

import factory.pages.AboutPage;
import factory.pages.ItemPage;

/**
 * A concrete creator
 */
public class Blog extends Website{
    @Override
    public void createWebsite() {
        pages.add(new AboutPage());
        pages.add(new ItemPage());
    }
}
