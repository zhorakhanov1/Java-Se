package com.company;

public class Teacher extends User{
    private String nickname;
    private String status;
    String subjects[] = new String[10];
    int sizeofSubjects = 0;

    public Teacher(){

    }

    public Teacher(int id, String login, String password, String name, String surname, String nickname, String status, String[] subjects, int sizeofSubjects) {
        super(id, login, password, name, surname);
        this.nickname = nickname;
        this.status = status;
        this.subjects = subjects;
        this.sizeofSubjects = sizeofSubjects;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public int getSizeofSubjects() {
        return sizeofSubjects;
    }

    public void addSubject(String subject){
        subjects[sizeofSubjects] = subject;
        sizeofSubjects++;
    }

    public String getUserData() {
        return "Teacher{" +
                "Nickname: " + nickname + '\'' +
                "Status: " + status + '\'' +
                ", Subjects = '" + result(subjects) + '\'' +
                '}';
    }

    public String result(String array[]){
        String res = "";
        if (array[0] == null) return "No courses";
        else {
            for (String a : array) {
                if (a != null) res += a + ", ";
            }
            return res;
        }
    }

}
