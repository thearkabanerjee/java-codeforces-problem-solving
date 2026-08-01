public class substrings {
    public static void main(String[] args){
        String email = "cookiemonster@gmail.com";

        // print the username
        String username = email.substring(0,11);
        String domainname = email.substring(12);
        String propuser = email.substring(0,email.indexOf("@"));
        System.out.println(username);
        System.out.println(domainname);
        System.out.println(propuser);
    }
}
