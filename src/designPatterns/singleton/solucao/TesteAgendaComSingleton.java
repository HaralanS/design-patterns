package designPatterns.singleton.solucao;

import designPatterns.singleton.problema.Agenda;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TesteAgendaComSingleton {


    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //  EAGER
        // vai ser sempre a mesma instancia :O
        /*AgendaSingletonEAGER agenda1 = AgendaSingletonEAGER.getInstance();
        AgendaSingletonEAGER agenda2 = AgendaSingletonEAGER.getInstance();

        reservaDiaEAGER("Sexta");
        reservaDiaEAGER("Sabado");

        System.out.println(agenda1.getDias());
        System.out.println(agenda2.getDias());*/


        //LAZY
//        AgendaSingletonLAZY agenda1 = AgendaSingletonLAZY.getInstance();
//        AgendaSingletonLAZY agenda2 = AgendaSingletonLAZY.getInstance();

        // reflection - quebra singleton >:(
//        Constructor<AgendaSingletonLAZY> construtorTravesso = AgendaSingletonLAZY.class.getDeclaredConstructor();
//        construtorTravesso.setAccessible(true);
//        AgendaSingletonLAZY agendaTravessa = construtorTravesso.newInstance();
//        AgendaSingletonLAZY agendaTravessa2 = construtorTravesso.newInstance();
//        System.out.println(agendaTravessa);
//        System.out.println(agendaTravessa2);
//

//        reservaDiaLAZY("Sexta");
//        reservaDiaLAZY("Sabado");
//
//        System.out.println(agenda1.getDias());
//        System.out.println(agenda2.getDias());


//        Singleton ENUM - Evita Reflection >:D
        AgendaSingletonEnum agenda1 = AgendaSingletonEnum.getInstance();
        reservaDiaEnum("Sexta");
        reservaDiaEnum("Sabado");


    }

    public static void reservaDiaEAGER(String dia){
        AgendaSingletonEAGER instance = AgendaSingletonEAGER.getInstance();
        instance.ocupa(dia);
        System.out.println(instance.getDias());
    }
    public static void reservaDiaLAZY(String dia){
        AgendaSingletonLAZY instance = AgendaSingletonLAZY.getInstance();
        instance.ocupa(dia);
        System.out.println(instance.getDias());
    }
    public static void reservaDiaEnum(String dia){
        AgendaSingletonEnum instance = AgendaSingletonEnum.getInstance();
        instance.ocupa(dia);
        System.out.println(instance.getDias());
    }
}
