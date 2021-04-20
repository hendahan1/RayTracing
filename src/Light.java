public class Light {
	Vector position;
	Vector color;
	float specularIntensity;
	float shadowIntensity;
	float radius;
	Vector corner;

	public Light(Vector pos, Vector col, float specularIntens, float shadowIntens, float radiusVal) {
		this.position=pos;
		this.color=col;
		this.specularIntensity=specularIntens;
		this.shadowIntensity=shadowIntens;
		this.radius=radiusVal;
	}

	public void setCorner(Vector corner){
		this.corner=corner;
	}

}
