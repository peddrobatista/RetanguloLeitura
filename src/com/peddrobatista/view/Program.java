package com.peddrobatista.view;

import com.peddrobatista.classes.Retangle;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Retangle retangulo = new Retangle();
        System.out.println("Digite a altura e largura do retângulo: ");
        retangulo.altura = teclado.nextDouble();
        retangulo.largura = teclado.nextDouble();
        System.out.println();

        System.out.println("ÁREA = " + retangulo.area());
        System.out.println("PERÍMETRO = " + retangulo.perimetro());
        System.out.println("DIAGONAL = " + retangulo.diagonal());

    }
}
