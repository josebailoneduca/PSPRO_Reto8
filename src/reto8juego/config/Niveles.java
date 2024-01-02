/**
 * 
 */
package reto8juego.config;

/**
 * 
 * @author Jose Javier Bailon Ortiz
 */
public class Niveles {
	public static final int MOV_RECTO=0;
	public static final int MOV_ONDULADO=1;
	
	public static final int ENEMIGO_0=0;
	public static final int ENEMIGO_1=1;
	public static final int ENEMIGO_2=2;
	
	private static int[][][]niveles={
			//nivel 1
			{
				//tiempo, x MOV, tipo enemigo, cantidad, frecuencia
				{4000,Config.CENTRO_ANCHO,MOV_RECTO,ENEMIGO_0,3,1000},
				{4000,Config.CENTRO_ANCHO,MOV_RECTO,ENEMIGO_0,3,1000},
				{4000,200,MOV_ONDULADO,ENEMIGO_1,3,1000},
				{8000,600,MOV_ONDULADO,ENEMIGO_1,3,1000},
				{8000,Config.CENTRO_ANCHO,MOV_RECTO,ENEMIGO_0,4,1000},
				{4000,Config.CENTRO_ANCHO,MOV_RECTO,ENEMIGO_0,4,1000},
				{4000,200,MOV_ONDULADO,ENEMIGO_2,3,1000},
				{8000,600,MOV_ONDULADO,ENEMIGO_2,3,1000}
			},
			
			//nivel 2
			{
				{4000,Config.CENTRO_ANCHO,MOV_RECTO,ENEMIGO_0,3,1000},
				{4000,600,MOV_RECTO,ENEMIGO_1,3,1000},
				{4000,200,MOV_RECTO,ENEMIGO_1,4,1000},
				{4000,Config.CENTRO_ANCHO,MOV_RECTO,ENEMIGO_0,3,1000},
				{4000,300,MOV_ONDULADO,ENEMIGO_2,4,1000},
				{5000,500,MOV_ONDULADO,ENEMIGO_1,3,1000},
				{5000,200,MOV_ONDULADO,ENEMIGO_1,4,1000},
				{5000,600,MOV_ONDULADO,ENEMIGO_2,3,1000},
				{4000,Config.CENTRO_ANCHO,MOV_RECTO,ENEMIGO_0,3,1000}
			},
			//nivel 3
			{
				{4000,300,MOV_ONDULADO,ENEMIGO_2,4,1000},
				{5000,500,MOV_ONDULADO,ENEMIGO_1,3,1000},
				{4000,600,MOV_RECTO,ENEMIGO_1,3,1000},
				{4000,Config.CENTRO_ANCHO,MOV_RECTO,ENEMIGO_0,3,1000},
				{4000,200,MOV_RECTO,ENEMIGO_1,4,1000},
				{5000,200,MOV_ONDULADO,ENEMIGO_1,4,1000},
				{4000,Config.CENTRO_ANCHO,MOV_RECTO,ENEMIGO_0,3,1000},
				{4000,Config.CENTRO_ANCHO,MOV_RECTO,ENEMIGO_0,3,1000},
				{5000,600,MOV_ONDULADO,ENEMIGO_2,3,1000},
			},
			//nivel 4
			{
				{4000,600,MOV_RECTO,ENEMIGO_1,5,1500},
				{8000,200,MOV_ONDULADO,ENEMIGO_1,4,2000},
				{1000,600,MOV_ONDULADO,ENEMIGO_0,1,1000},
				{1000,Config.CENTRO_ANCHO,MOV_ONDULADO,ENEMIGO_2,2,1000},
				{1000,200,MOV_ONDULADO,ENEMIGO_0,1,1000},
				{5000,Config.CENTRO_ANCHO,MOV_ONDULADO,ENEMIGO_2,4,2000},
				{1000,600,MOV_ONDULADO,ENEMIGO_0,1,1000},
				{1000,Config.CENTRO_ANCHO,MOV_ONDULADO,ENEMIGO_2,2,1000},
				{1000,200,MOV_ONDULADO,ENEMIGO_0,1,1000},
			},
			
			
			//nivel 5
			{
				{1000,200,MOV_RECTO,ENEMIGO_0,1,1000},
				{1000,300,MOV_RECTO,ENEMIGO_0,1,1000},
				{1000,400,MOV_RECTO,ENEMIGO_0,1,1000},
				{1000,500,MOV_RECTO,ENEMIGO_0,1,1000},
				{1000,600,MOV_RECTO,ENEMIGO_0,1,1000},
				{4000,Config.CENTRO_ANCHO,MOV_ONDULADO,ENEMIGO_2,3,1000},
				{4000,300,MOV_ONDULADO,ENEMIGO_2,3,1000},
				{5000,500,MOV_ONDULADO,ENEMIGO_1,3,1000},
				{5000,200,MOV_ONDULADO,ENEMIGO_1,3,1000},
				{5000,600,MOV_ONDULADO,ENEMIGO_2,3,1000},
				{4000,Config.CENTRO_ANCHO,MOV_RECTO,ENEMIGO_0,3,1000}
			},
			//nivel 6
			{
				{4000,Config.CENTRO_ANCHO,MOV_RECTO,ENEMIGO_0,3,1000},
				{4000,200,MOV_ONDULADO,ENEMIGO_1,3,1000},
				{4000,Config.CENTRO_ANCHO,MOV_RECTO,ENEMIGO_0,3,1000},
				{8000,Config.CENTRO_ANCHO,MOV_RECTO,ENEMIGO_0,4,1000},
				{8000,600,MOV_ONDULADO,ENEMIGO_1,3,1000},
				{8000,600,MOV_ONDULADO,ENEMIGO_2,3,1000},
				{4000,Config.CENTRO_ANCHO,MOV_RECTO,ENEMIGO_0,4,1000},
				{4000,200,MOV_ONDULADO,ENEMIGO_2,3,1000},
			},
			
			//nivel 7
			{
				{4000,600,MOV_RECTO,ENEMIGO_1,3,1000},
				{4000,Config.CENTRO_ANCHO,MOV_RECTO,ENEMIGO_0,3,1000},
				{4000,200,MOV_RECTO,ENEMIGO_1,4,1000},
				{4000,Config.CENTRO_ANCHO,MOV_RECTO,ENEMIGO_0,3,1000},
				{4000,300,MOV_ONDULADO,ENEMIGO_2,4,1000},
				{5000,200,MOV_ONDULADO,ENEMIGO_1,4,1000},
				{4000,Config.CENTRO_ANCHO,MOV_RECTO,ENEMIGO_0,3,1000},
				{5000,500,MOV_ONDULADO,ENEMIGO_1,3,1000},
				{5000,600,MOV_ONDULADO,ENEMIGO_2,3,1000},
			},
			//nivel 8
			{
				{4000,300,MOV_ONDULADO,ENEMIGO_2,4,1000},
				{5000,500,MOV_ONDULADO,ENEMIGO_1,3,1000},
				{4000,600,MOV_RECTO,ENEMIGO_1,3,1000},
				{4000,Config.CENTRO_ANCHO,MOV_RECTO,ENEMIGO_0,3,1000},
				{4000,200,MOV_RECTO,ENEMIGO_1,4,1000},
				{5000,200,MOV_ONDULADO,ENEMIGO_1,4,1000},
				{4000,Config.CENTRO_ANCHO,MOV_RECTO,ENEMIGO_0,3,1000},
				{4000,Config.CENTRO_ANCHO,MOV_RECTO,ENEMIGO_0,3,1000},
				{5000,600,MOV_ONDULADO,ENEMIGO_2,3,1000},
			},
			//nivel 9
			{
				{4000,600,MOV_RECTO,ENEMIGO_1,5,1500},
				{1000,600,MOV_ONDULADO,ENEMIGO_0,1,1000},
				{8000,200,MOV_ONDULADO,ENEMIGO_1,4,2000},
				{1000,200,MOV_ONDULADO,ENEMIGO_0,1,1000},
				{1000,Config.CENTRO_ANCHO,MOV_ONDULADO,ENEMIGO_2,2,1000},
				{5000,Config.CENTRO_ANCHO,MOV_ONDULADO,ENEMIGO_2,4,2000},
				{1000,Config.CENTRO_ANCHO,MOV_ONDULADO,ENEMIGO_2,2,1000},
				{1000,600,MOV_ONDULADO,ENEMIGO_0,1,1000},
				{1000,200,MOV_ONDULADO,ENEMIGO_0,1,1000},
			},
			
			
			//nivel 10
			{
				{1000,300,MOV_RECTO,ENEMIGO_0,1,1000},
				{1000,200,MOV_RECTO,ENEMIGO_0,1,1000},
				{1000,500,MOV_RECTO,ENEMIGO_0,1,1000},
				{1000,400,MOV_RECTO,ENEMIGO_0,1,1000},
				{1000,600,MOV_RECTO,ENEMIGO_0,1,1000},
				{4000,Config.CENTRO_ANCHO,MOV_ONDULADO,ENEMIGO_2,3,1000},
				{4000,Config.CENTRO_ANCHO,MOV_RECTO,ENEMIGO_0,3,1000},
				{5000,500,MOV_ONDULADO,ENEMIGO_1,3,1000},
				{4000,300,MOV_ONDULADO,ENEMIGO_2,3,1000},
				{5000,600,MOV_ONDULADO,ENEMIGO_2,3,1000},
				{5000,200,MOV_ONDULADO,ENEMIGO_1,3,1000},
			},
	};

	public static int[][] getNivel(int n) {
		if (n>=niveles.length)
			return null;
		return niveles[n];
	}
}
