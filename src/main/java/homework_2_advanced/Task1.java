package main.java.homework_2_advanced;

public class Task1 {

         private int age;
         private String name;
         String ageGroup;



        public void validateAge(int age){
            if (age > 0 && age < 100) {
                this.age = age;
                validateAgeGroup(ageGroup);
            } else {
                System.out.println("Возраст должен быть не меньше 0 и не больше 100");
            }
        }

        public void setAge(int age){
            this.validateAge(age);
        }

        public int getAge(){
            return age;
        }

        public void validateName(String name){
            if (name.length() > 3 && name.length() < 50 && name.trim().isEmpty()){
              this.name = name.toUpperCase();
            }else {
               System.out.println("Имя не может быть меньше 3 и больше 50 символом и состоять только с пробелов");
            }
        }

        public void setName(String name){
            this.validateName(name);
        }

        public String getName(){
            return name;
        }


        public void validateAgeGroup(String ageGroup){
            if (age <= 15) {
                System.out.println(this.ageGroup = age + " Child");
            } if (age > 15 && age <= 25){
                System.out.println(this.ageGroup = age + " student");
            } if (age > 26 && age <= 65) {
                System.out.println(this.ageGroup = age + " worker");
            } if (age > 66) {
                System.out.println(this.ageGroup = age + " pensioner");
            }
        }

    private void setAgeGroup() {
        this.validateAgeGroup(ageGroup);
    }

    public String getAgeGroup (){
            return ageGroup;
    }
}
