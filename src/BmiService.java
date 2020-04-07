public abstract class BmiService<height mass> {
    public abstract int calculate(int mass; int height);
    int index;
    {
        index = mass / (height * height);
        System.out.println(index);
    }
        return index;
}
