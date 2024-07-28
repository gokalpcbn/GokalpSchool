package com.project.superhuman;

public class Human {
    public String name;
    public String surname;
    public int age;
    public int schoolNumber;
    public String schoolClub;
    public String section;
    public String city;
    private boolean schoolPayment;

    public Human(){
        name = "İsim Girilmedi";
        surname = "Soyisim Girilmedi";
        age = 0;
        schoolNumber = 0;
        schoolClub = "null";
        section = "null";
        city = "null";
        schoolPayment = false;
    }

    public Human(int userId){
        if(userId==1){
            name = "Aslı";
            surname = "Yılmaz";
            age = 15;
            schoolNumber = 127;
            schoolClub = "Music";
            section = "English";
            city = "Ankara";
            schoolPayment = true;
        } else if (userId == 2) {
            name = "Asya";
            surname = "Demir";
            age = 16;
            schoolNumber = 128;
            schoolClub = "Art";
            section = "Turkish";
            city = "Istanbul";
            schoolPayment = true;
        } else if (userId == 3) {
            name = "Baran";
            surname = "Kaya";
            age = 17;
            schoolNumber = 129;
            schoolClub = "Science";
            section = "Turkish";
            city = "Izmir";
            schoolPayment = false;
        } else if (userId == 4) {
            name = "Berkehan";
            surname = "Çelik";
            age = 16;
            schoolNumber = 130;
            schoolClub = "Drama";
            section = "Math";
            city = "Bursa";
            schoolPayment = true;
        } else if (userId == 5) {
            name = "Ege";
            surname = "Arslan";
            age = 15;
            schoolNumber = 131;
            schoolClub = "Sports";
            section = "English";
            city = "Antalya";
            schoolPayment = false;
        } else if (userId == 6) {
            name = "Ergün";
            surname = "Özkan";
            age = 17;
            schoolNumber = 132;
            schoolClub = "Music";
            section = "Math";
            city = "Adana";
            schoolPayment = true;
        } else if (userId == 7) {
            name = "Jrgokalp";
            surname = "Yavuz";
            age = 16;
            schoolNumber = 133;
            schoolClub = "Literature";
            section = "Math";
            city = "Trabzon";
            schoolPayment = false;
        } else if (userId == 8) {
            name = "Rana";
            surname = "Aydın";
            age = 15;
            schoolNumber = 134;
            schoolClub = "Turkish";
            section = "Physics";
            city = "Konya";
            schoolPayment = true;

        }

    }

}
