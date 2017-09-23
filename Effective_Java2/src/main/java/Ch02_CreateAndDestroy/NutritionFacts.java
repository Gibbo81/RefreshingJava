package Ch02_CreateAndDestroy;

//Builder Pattern page 14
public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public NutritionFacts(NutBuilder nutBuilder) {
        servingSize=nutBuilder.servingSize;
        servings= nutBuilder.servings;
        calories= nutBuilder.calories;
        fat= nutBuilder.fat;
        sodium = nutBuilder.sodium;
        carbohydrate= nutBuilder.carbohydrate;
    }

    public static class NutBuilder{
        private final int servingSize;
        private final int servings;

        //Optional parameters
        private int calories=0;
        private int fat=0;
        private int sodium=0;
        private int carbohydrate=0;

        public NutBuilder(int servingsize, int servings){
            this.servings = servings;
            servingSize = servingsize;
        }

        public NutBuilder Calories(int calories){
            this.calories = calories;
            return this;}
        public NutBuilder Fat(int val)
        { fat = val; return this; }
        public NutBuilder Carbohydrate(int val)
        { carbohydrate = val; return this; }
        public NutBuilder Sodium(int val)
        { sodium = val; return this; }

        public NutritionFacts Generate(){
            return new NutritionFacts(this);
        }
    }

    @Override
    public String toString() {
        return "this instance has sodium: "+ sodium+" and fat: "+fat;
    }
}