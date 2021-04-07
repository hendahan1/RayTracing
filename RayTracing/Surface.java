package RayTracing;

public interface Surface {

	public double intersect(Ray ray) ;
    public Vector getNormal(Vector intersectionPoint);
    public int getMterialIndex();
}
