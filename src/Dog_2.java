import java.util.Arrays;

public class Dog_2 extends Pet {
        private String name;
        private String breed;

        public Dog_2(String name, String breed, String[] commands,
                   EnumColor enumColor, Shelter shelter){
            this.name = name;
            this.breed =  breed;
            super.setShelter(shelter);
            super.setEnumColor(enumColor);
        }
        public Dog_2(String name, String breed,
                   EnumColor enumColor, Shelter shelter){
            this.name = name;
            this.breed = breed;
            super.setShelter(shelter);
            super.setEnumColor(enumColor);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        public String getBreed() {
            return breed;
        }
        public void setBreed(String breed) {
            this.breed = breed;
        }
        void makeVoice(){
            System.out.println("ГАВ-ГАВ");
        }

        void makeVoice(String voice){
            System.out.println(voice);
        }

        @Override
        public String getInfo() {
            return super.getInfo() + "\nName: " + name +
                    "\nBreed: " + breed;
        }
    }


