package com.uped.proyecto;

import com.uped.proyecto.modelo.*;

public class Main {
    public static void main(String[] args) {

        // Creación de objetos aplicando polimorfismo y clases multinivel
        Cliente c = new Cliente("Ana", "04512378-9", "7777-1111", 4000.0);
        Empleado e = new Empleado("Luis", "06223344-5", 850.0);
        Estudiante est = new Estudiante("Kevin", "03998877-6", "UPED-045", "Ing. Sistemas", 9.1);
        Docente d = new Docente("Carlos", "01234567-8", "Matemáticas", 10);
        Voluntario v = new Voluntario("Sara Gómez", "07456123-2", 120.0);
        Proveedor prov = new Proveedor("Comercial Ríos", "06554321-8", 8000.0);
        Gerente g = new Gerente("Marta Díaz", "05123456-7", 1200.0, 5);
        DocenteInvestigador di = new DocenteInvestigador("Dr. Iván Reyes", "07321456-9", "Ingeniería de Software", 8, 4);

        // Almacenando todas las subclases en un arreglo de la superclase abstracta Persona (Upcasting)
        Persona[] personas = {c, e, est, d, v, prov, g, di};

        System.out.println("--- RESULTADOS DEL SISTEMA ---");
        for (Persona p : personas) {

            // Downcasting seguro con instanceof para ejemplos que sobrescribieron toString
            if (p instanceof Voluntario || p instanceof Gerente || p instanceof Proveedor || p instanceof DocenteInvestigador) {
                System.out.println(p.toString() + " -> Beneficio: $" + p.calcularBeneficioAnual());
            } else {
                System.out.println(p.presentarse() + " -> Beneficio: $" + p.calcularBeneficioAnual());
            }
        }
    }
}