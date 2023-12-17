package factory;

import factory.pages.ItemPage;

/**
 * A concrete creator
 */
public class Shop extends Website{
    @Override
    public void createWebsite() {
        pages.add(new ItemPage());
    }
}
