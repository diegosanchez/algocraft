package fiuba.algo3.classes.movimientos;

import java.util.ArrayList;

import fiuba.algo3.classes.exceptions.FueraDeMatriz;
import fiuba.algo3.classes.units.RaceUnit;



public abstract class Movimiento {
	
	public abstract void mover(RaceUnit unidad) throws FueraDeMatriz;
	
}