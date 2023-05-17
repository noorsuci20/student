/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siswa;

/**
 *
 * @author Labkom M21
 */
public class data {
    private String name;
    private int age;

    public data(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Nama: " + name);
        System.out.println("Usia: " + age);
    }

    public static void main(String[] args) {
        data student = new data("Noorsuci", 21);
        student.displayInfo();
    }
    
}
