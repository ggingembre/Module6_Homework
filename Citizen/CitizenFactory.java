package Citizen;

/**
 * Created by Guillaume Gingembre on 07/03/2017.
 */
public class CitizenFactory {

    private static class Englishman implements Citizen {
        @Override
        public void sayHello() {
            System.out.println("Hello from Britain!");
        }
    }

    private static class French implements Citizen {
        @Override
        public void sayHello() {
            System.out.println("Hello from France, bonjour!");
        }
    }

    private static class Japanese implements Citizen {
        @Override
        public void sayHello() {
            System.out.println("Hello from Japan, こんにちは!");
        }
    }

    private static class Russian implements Citizen {
        @Override
        public void sayHello() {
            System.out.println("Hello from Russia, Привет");
        }
    }

    public static Citizen Englishman() {return new Englishman();}
    public static Citizen French() {return new French();}
    public static Citizen Japanese() {return new Japanese();}
    public static Citizen Russian() {return new Russian();}

}
