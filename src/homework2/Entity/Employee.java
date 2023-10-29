package homework2.Entity;

public class Employee {

    private PersonalData personalData;
    private Post post;

    public Employee(PersonalData personalData, Post post) {
        this.personalData = personalData;
        this.post = post;
    }

    public PersonalData getPersonalData() {
        return personalData;
    }

    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
