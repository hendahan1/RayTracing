package RayTracing;

public class Camera {
    Vector position;
	Vector lookAtPoint;
	Vector upVector;
	float screenDistance;
	float screenWidth;
    boolean fisheye=false;
    float fisheyeTransVal=(float)0.5;
    Vector direction;
	
    //add direction
	public Camera(Vector pos,Vector lookAt,Vector upVec,float distance,float width,boolean isfisheye, float fisheyeVal ) {
        this.position=pos;
        lookAt.normalize();
        this.lookAtPoint=lookAt;
        upVec.normalize();
        this.upVector=upVec;
        this.screenDistance=distance;
        this.screenWidth=width;
        this.fisheye=isfisheye;
        this.fisheyeTransVal=fisheyeVal;
    }

}
