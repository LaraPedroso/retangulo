package renti;

public class Retan {
	
//	return ((Math.pow(this.altura(), 2) + Math.pow(this.base(), 2)) * 0.5);
	   
		public double width;
	    public double height;
	    public double peri;
	    public double diago;
	    public double aux;


	    public double area() {
	        return width * height;
	    }

	    public double perimetro() {
	        return peri = (width * height) + 2;
	    }

	    public double diagonal() {
	    	return Math.sqrt(width * width + height * height);
	    }

	    public String toString() {
	        return  "AREA = "
	            +   String.format("%.2f\n", area())
	            +   "PERIMETRO = "
	            +   String.format("%.2f \n", perimetro())
	            +   "DIAGONAL = "
	            +   String.format("%.2f\n", diagonal());
	    }

	}

