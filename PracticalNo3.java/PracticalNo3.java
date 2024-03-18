/*Aim: PracticalNo3
  Author: Anisha Bobade
  Version: 3.0
  Date: 13/02/2024
*/

public class VolumeCalculator{

    public Double calculateVolume (Double sideLength) { 
        return sidelength * sideLength * sideLength;
}

public Double calculateVolume(Double radius, Double height) {
    return Math.PI * radius * radius * height;
}

public Double calculateVolume (Double length, Double width, Double height){
    return length * width * height;
}

public static void main(String[] args){
    VolumeCalculator calculator = new VolumeCalculator();

    Double cubeVolume = calculator.calculateVolume(4.0);
    Double cylinderVolume = calculator.calculateVolume (3.0, 5.0);
    Double boxVolume = calculator.calculateVolume (2.5, 3.0, 5.0);

    System.out.println("Volume of Cube: "+ cubeVolume);
    System.out.println("Volume of Cylinder: "+ cylinderVolume);
    System.out.println("Volume of Box: "+ boxVolume);

}
}


