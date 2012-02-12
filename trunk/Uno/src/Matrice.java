import java.util.*;
import java.io.*;

public class Matrice {
	private int celle[][]=null;
	private int dimX=0;
	private int dimY=0;

	public Matrice(int dimX, int dimY){
		this.dimX=dimX;
		this.dimY=dimY;
		celle=new int[dimX][dimY];
	}

	public void initRandom(){
		for(int i=0;i<dimX;i++){
			for(int j=0;j<dimY;j++){
				celle[i][j]=(int)Math.round(Math.random());
			}
		}
	}

	public void reset(){
		for(int i=0;i<dimX;i++){
			for(int j=0;j<dimY;j++){
				celle[i][j]=0;
			}
		}
	}

	public int getDimX(){
		return dimX;
	}

	public int getDimY(){
		return dimY;
	}

	public int getValore(int x,int y){
		if(x>=0 && x<dimX && y>=0 && y<dimY){
			return celle[x][y];
			}
		return 0;
	}

	public int ricerca(Matrice mat){
		int trovate=0;
		for(int x=0;x<dimX-2;x++){
			for(int y=0;y<dimY;y++){
				if(sovrapponi(x,y,mat))
					trovate++;
			}
		}
		return trovate;
	}

	private boolean sovrapponi(int x,int y, Matrice mat){
		for(int i=0;i<mat.getDimX();i++){
			for(int j=0;j<mat.getDimY();j++){
				if(mat.celle[i][j]!=this.celle[x+i][x+j])
					return false;
			}
		}

	return true;
	}
}
