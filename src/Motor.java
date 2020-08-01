/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author camorenoc
 */
public class Motor {
    private int idMotor;
    private static int contadorMotores = 0;
    private int insumo_0;
    private int insumo_1;
    private int insumo_2;
    private int insumo_3;
    private int insumo_4;
    private int insumo_5;
    private int insumo_6;
   
    public Motor (int[] insumos) {
        this.idMotor = ++this.contadorMotores;
        this.insumo_0 = insumos[0];
        this.insumo_1 = insumos[1];
        this.insumo_2 = insumos[2];
        this.insumo_3 = insumos[3];
        this.insumo_4 = insumos[4];
        this.insumo_5 = insumos[5];
        this.insumo_6 = insumos[6];
    }
}
