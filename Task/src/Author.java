public class Author {

    private String name, mail;

    private Gender gender;

    public Author(String name, String mail, Gender gender) {
        this.name = name;
        this.mail = mail;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public Gender getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Автор:" +
                "\n\tИмя - " + name +
                "\n\tПочта - " + mail +
                "\n\tПол - " + gender;
    }
}
