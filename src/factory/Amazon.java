package factory;

import factory.pages.ItemPage;

public class Amazon extends Website{
    @Override
    public void createWebsite() {
        pages.add(new ItemPage());
    }
}
