public class GradleAverage {
    public static void main(String[] args) {
        int i = 10;
        System.out.println(i++);
        Integer noteMaths = 79;
        Integer notePhysics = 55;
        Integer noteChemistry = 80;

        Integer average = (noteMaths + notePhysics + noteChemistry)/3;
        String gradle = "";
        if(noteMaths < 35 || notePhysics < 35 || noteChemistry < 35){
            System.out.println("Failure!");
        }
        if(noteMaths > 35 && notePhysics > 35 && noteChemistry > 35){
            if(average <= 59){
                gradle = "C";
            }else if(average <= 69){
                gradle = "D";
            }else {
                gradle = "A";
            }
            System.out.println("Success with gradle of "+gradle);
        }
    }
}
