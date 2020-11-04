public class BmiService {
    public float calculate(float weight, int growth){
        float index = weight * 10000 / (growth*growth);
        return index;
    }
}
