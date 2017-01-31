import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Human human = new Human();
        human.setAge(21);
        human.setName("Sasha");
        String humanJson = gson.toJson(human);
        System.out.println(humanJson);


        String json = "{\"name\": \"Ruslan\", \"age\": 15}";
        Human human1 = gson.fromJson(json, Human.class);
        System.out.println(human1.getName());
        System.out.println(human1.getAge());
    }

    public static class Human {
        private int age;
        private String name;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
