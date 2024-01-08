public class FunctionsAsData {
    
    protected static class Person {
        private String name;
        private Integer age;

        public Person(String name, Integer age){
            this.name = name;
            this.age = age;
        }
        
    }

    protected static class DataLoader {
        public final NoFunction<Person> loadPerson;

        public DataLoader(Boolean isDev){
            this.loadPerson = isDev
                ? this::loadPersonFake
                : this::loadPersonReal;
        }

        private Person loadPersonReal(){
            System.out.println("Loading person...");
            return new Person("Real Person", 39);
        }
        private Person loadPersonFake(){
            System.out.println("returning fake person object...");
            return new Person("Fake Person", 93);
        }
        
    }

    public static void main(String[] args){
        final Boolean IS_DEVELOPMENT = false;

        DataLoader dataLoader = new DataLoader(IS_DEVELOPMENT);
        System.out.println(dataLoader.loadPerson.apply());

    }
    
}
