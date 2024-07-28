package com.project.superteacher;

public class Humanteach {
    public String name;
    public String surname;
    public String age;
    public String branch;
    private int yearsOfExperience;
    public boolean isTenured;


    public Humanteach(int userId) {
        if (userId == 1) {
            name = "Bülent";
            surname = "Yılmaz";
            age = "45";
            branch = "Mathematics";
            yearsOfExperience = 20;
            isTenured = true;
        } else if (userId == 2) {
            name = "Nuray";
            surname = "Kara";
            age = "38";
            branch = "Physics";
            yearsOfExperience = 15;
            isTenured = false;
        } else if (userId == 3) {
            name = "Ömer";
            surname = "Demir";
            age = "50";
            branch = "History";
            yearsOfExperience = 25;
            isTenured = true;
        } else if (userId == 4) {
            name = "Tunç";
            surname = "Çetin";
            age = "42";
            branch = "English";
            yearsOfExperience = 18;
            isTenured = false;
        } else {
            setDefaultDetails();
        }
    }

    public Humanteach() {
        setDefaultDetails();
    }

    private void setDefaultDetails() {
        this.name = "İsim Girilmedi";
        this.surname = "Soyisim Girilmedi";
        this.age = "0";
        this.branch = "null";
        this.yearsOfExperience = 0;
        this.isTenured = false;
    }
}
