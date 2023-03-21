/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_dimas;

/**
 *
 * @author Lenovo
 */
public class Person extends Division implements finalWeight{
    public String division, nik, name, status;
    public double writtenTest, codingTest, interviewTest, result;

    Person(){
    }
    @Override
    public double getWrite() {
        return this.writeWeight*this.writtenTest;
    }

    @Override
    public double getCoding() {
        return this.codingWeight*this.codingTest;
    }

    @Override
    public double getInterview() {
        return this.interviewWeight*this.interviewTest;
    }
}
