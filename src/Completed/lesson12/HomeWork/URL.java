package Completed.lesson12.HomeWork;

public class URL {
    public static void main(String[] args) {
        String url = "https://codeanywhere.com/editor/#";
        String url2 = "http://google.com";
        String url3 = "https://tools.ietf.org/html/rfc2616";
        String url4 = "https://www.google.com/search?q=%D0%BA%D0%BE%D1%82%D0%B8%D0%BA%D0%B8&rlz=1C1GCEA_enRU779RU779&oq=%D0%BA%D0%BE%D1%82%D0%B8%D0%BA%D0%B8&aqs=chrome..69i57j0l5.1128j0j4&sourceid=chrome&ie=UTF-8";
        String url5 = "http://ftp.dlink.ru/pub";

        System.out.println(getServerName(url));
        System.out.println(getServerName(url2));
        System.out.println(getServerName(url3));
        System.out.println(getServerName(url4));
        System.out.println(getServerName(url5));
    }

    private static String getServerName(String url) {
        int serverNameFirstIndex = url.indexOf("://") + "://".length();
        int serverNameLastIndex = url.indexOf("/", serverNameFirstIndex);

        return (serverNameLastIndex != -1) ? url.substring(serverNameFirstIndex, serverNameLastIndex) : url.substring(serverNameFirstIndex);
    }
}
