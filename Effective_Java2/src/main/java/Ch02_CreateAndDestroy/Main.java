package Ch02_CreateAndDestroy;



public class Main {
    public static void main(String[] args){

        System.out.println("Builder Pattern pag 14");
        NutritionFacts n = new NutritionFacts.NutBuilder(5,120)
                                             .Calories(40)
                                             .Carbohydrate(50)
                                             .Fat(1)
                                             .Sodium(14)
                                             .Generate();
        System.out.println(n);
        System.out.println("It works but thwere is no warranty that Generate will be called only when all parameter are inserted");
        System.out.println("---------------------------------------------");





    }
}
