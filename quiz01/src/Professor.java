class Professor extends Person{

    public Professor(String name, int ID, int age) {
        super(name, ID, age);
        // TODO Auto-generated constructor stub
    }

    public String giveQuiz() {
        return super.toString();
    }

}