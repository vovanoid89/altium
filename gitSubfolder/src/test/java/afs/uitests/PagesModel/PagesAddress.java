package afs.uitests.PagesModel;

public enum PagesAddress {
    home(""), users("usermanagement#users"), roles("usermanagement#roles"), ldap("usermanagement#ldap"), sessions("usermanagement#sessions");


    public String applicationUrl;
    //private String applicationPort = ":9780";

    PagesAddress(String url) {
        applicationUrl = url;
    }

}
