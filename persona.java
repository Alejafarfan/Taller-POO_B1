/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NEGOCIO;

import static java.lang.Character.toUpperCase;

/**
 *
 * @author LabSispc03
 */
public class persona {

    private String name;
    private byte edad;
    private int cedula;
    private char sexo;
    private short peso;
    private float altura;

    public persona() {
    }

    public persona(String name, byte edad, char sexo) {
        this.name = name;
        this.edad = edad;
        this.sexo = sexo;
        this.cedula = 0;
        this.peso = 65;
        this.altura = 1.45f;

    }

    public float calcularIMC(short peso, float altura) {
        float peso_ideal = (float) (peso / Math.pow(altura, 2));

        if (peso_ideal < 20) {
            return -1;
        } else if (peso_ideal >= 20 && peso_ideal <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad(byte edad) {
        if (edad < 18) {
            return false;
        } else {
            return true;
        }
    }

    public char comprobarSexo(char sexo) {
        if (toUpperCase(sexo) == 'H' || toUpperCase(sexo) == 'M') {
            return sexo;
        } else {
            System.out.println("el sexo no es correcto");
            return 'H';
        }
    }

    @Override
    public String toString() {
        return "persona{" + "name=" + name + ", edad=" + edad + ", cedula=" + cedula + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
    

    public int generaCedula(int cedula) {
        cedula = (int) (Math.random() * 10);
        return cedula;

    }

    public String getName() {
        return name;
    }

    public byte getEdad() {
        return edad;
    }

    public int getCedula() {
        return cedula;
    }

    public char getSexo() {
        return sexo;
    }

    public short getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(short peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

}
