import java.util.Arrays;

public enum Times {
    WINTER("зима"){
        public void getDiscription(){
            System.out.println("холодное время года " + avgTemp.forWinter.qwe);
        }
    },
    AUTUMN("осень"){
        public void getDiscription(){

            System.out.println("холодное время года "+ avgTemp.forAutumn.qwe);
        }
    },
    SUMMER("лето"){
        public void getDiscription(){
            System.out.println("теплое время года " +avgTemp.forSummer.qwe);
        }
    },
    SPRING("весна"){
        public void getDiscription(){
            System.out.println("теплое время года "+ avgTemp.forSpring.qwe);
        }
    };
    private String favorite;
    Times(String favorite){
        this.favorite = favorite;
    }

    abstract public void getDiscription();
    String love;
    public String setLove(String... huy){
        return Arrays.toString(huy);
    }
    public String getLove() {
        return love;
    }
    enum avgTemp{
        forWinter("-24"),
        forSpring("-12"),
        forAutumn("-5"),
        forSummer("30+");
        private String qwe;
        avgTemp(String temp){
            this.qwe = temp;
        }
    }



}
