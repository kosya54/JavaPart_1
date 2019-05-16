package Completed.lesson7.ClassWork.Contact;

public class MainContact {
    public static void main(String[] args) {
        Contact contact1 = new Contact("Пупкин", "Василий", "=7 913 450 9868");
        String fullNameContact1 = contact1.getFullName();
        System.out.println(fullNameContact1);

        contact1.setPhoneNumber("8 920 444 77 99");
        System.out.println(contact1.getPhoneNumber());

        Contact contact2 = new Contact("Иванов", "Иван", "=7 913 450 9868");
        String fullNameContact2 = contact2.getFullName();
        System.out.println(fullNameContact2);

        contact2.setPhoneNumber("8 913 450 77 99");
        System.out.println(contact2.getPhoneNumber());

        contact2.setSurname("Магомедов");
        fullNameContact2 = contact2.getFullName();
        System.out.println(fullNameContact2);
    }
}
